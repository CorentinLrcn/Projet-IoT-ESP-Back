package project.iot.mapper;

import project.iot.client.lorawan.response.DecodedPayload;
import project.iot.client.lorawan.response.ResultObject;
import project.iot.model.SoilData;
import project.iot.web.response.ConductSoilResponse;
import project.iot.web.response.SoilDataResponse;
import project.iot.web.response.SoilMoistureResponse;
import project.iot.web.response.TemperatureSoilResponse;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class SoilMapper {

    public List<SoilData> toSoilData(List<ResultObject> resultObjects) {
        List<SoilData> soilDataList = new ArrayList<>();
        for (ResultObject resultObject : resultObjects) {
            DecodedPayload decodedPayload = resultObject.getResult().getUplinkMessage().getDecodedPayload();
            SoilData soilData = new SoilData();
            soilData.setConductSoil(Integer.parseInt(decodedPayload.getConductSoil()));
            soilData.setTempSoil(Float.parseFloat(decodedPayload.getTempSoil()));
            soilData.setSoilMoisture(Float.parseFloat(decodedPayload.getWaterSoil()));
            soilData.setTimestamp(Instant.parse(resultObject.getResult().getReceivedAt()));
            soilDataList.add(soilData);
        }
        return soilDataList;
    }

    public SoilDataResponse toResponse(List<SoilData> datas) {
        SoilDataResponse soilDataResponse = new SoilDataResponse();
        List<SoilMoistureResponse> soilMoistures = new ArrayList<>();
        List<TemperatureSoilResponse> tempSoils = new ArrayList<>();
        List<ConductSoilResponse> conductSoils = new ArrayList<>();

        datas.forEach(soilData -> {
            SoilMoistureResponse soilMoistureResponse = new SoilMoistureResponse(
                    soilData.getSoilMoisture(),
                    soilData.getTimestamp()
            );
            soilMoistures.add(soilMoistureResponse);

            TemperatureSoilResponse tempSoilResponse = new TemperatureSoilResponse(
                    soilData.getTempSoil(),
                    soilData.getTimestamp()
            );
            tempSoils.add(tempSoilResponse);

            ConductSoilResponse conductSoilResponse = new ConductSoilResponse(
                    soilData.getConductSoil(),
                    soilData.getTimestamp()
            );
            conductSoils.add(conductSoilResponse);
        });
        soilDataResponse.setConductSoils(conductSoils);
        soilDataResponse.setSoilMoistures(soilMoistures);
        soilDataResponse.setTempSoils(tempSoils);

        return soilDataResponse;
    }

}
