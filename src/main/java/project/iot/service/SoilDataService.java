package project.iot.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import project.iot.client.lorawan.controller.SoilDataPrivateController;
import project.iot.client.lorawan.response.ResultObject;
import project.iot.mapper.SoilMapper;
import project.iot.model.SoilData;
import project.iot.repository.SoilDataRepository;
import project.iot.web.response.SoilDataResponse;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SoilDataService {
    private final SoilDataPrivateController soilDataPrivateController;
    private final SoilDataRepository soilDataRepository;
    private static final SoilMapper soilMapper = new SoilMapper();

    private static final String DEVICE_ID = "eui-a8404194a1875ff3";

    public SoilDataService(SoilDataPrivateController soilDataPrivateController, SoilDataRepository soilDataRepository) {
        this.soilDataPrivateController = soilDataPrivateController;
        this.soilDataRepository = soilDataRepository;
    }

    public void saveSoilDataFromLoRaWan() {
        String loRaWanOutPut = soilDataPrivateController.getSoilMoistureInfos(getSearchDate());
        if (!(loRaWanOutPut == null)) {
            String jsonString = convertMultipleRootElementToValidJson(loRaWanOutPut);
            getObjectFromJson(jsonString);
        }
    }

    private Instant getSearchDate() {
        Optional<Instant> lastSave = soilDataRepository.getLastSoilDate();
        return lastSave.orElseGet(() -> Instant.now().minus(Duration.ofDays(10)));
    }

    private String convertMultipleRootElementToValidJson(String stringJsonToConvert) {
        String regex = "\\}(?=\\s*\\{)";
        String modifiedString = stringJsonToConvert.replaceAll(regex, "},");
        return "[" + modifiedString + "]";
    }

    private void getObjectFromJson(String jsonString) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<ResultObject> results = objectMapper.readValue(jsonString, new com.fasterxml.jackson.core.type.TypeReference<List<ResultObject>>() {
            });
            if (!results.isEmpty()) {
                List<ResultObject> filteredResult = filterResult(results);
                saveData(filteredResult);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<ResultObject> filterResult(List<ResultObject> resultObjects) {
        return resultObjects.stream().filter(resultObject -> resultObject.getResult().getEndDeviceIds().getDeviceId().equals(DEVICE_ID)).collect(Collectors.toList());
    }

    private void saveData(List<ResultObject> dtoToSave) {
        List<SoilData> dataToSave = soilMapper.toSoilData(dtoToSave);
        soilDataRepository.saveAll(dataToSave);
    }

    public SoilDataResponse getDataToGraph() {
        List<SoilData> all = soilDataRepository.findAll();
        return soilMapper.toResponse(all);
    }
}
