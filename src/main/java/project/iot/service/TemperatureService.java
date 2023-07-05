package project.iot.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import project.iot.mapper.TemperatureMapper;
import project.iot.model.SenderType;
import project.iot.model.Temperature;
import project.iot.repository.TemperatureRepository;
import project.iot.web.request.TemperatureCreateRequest;
import project.iot.web.response.TemperatureResponse;

import java.util.List;

@Service
@AllArgsConstructor
public class TemperatureService {

    private final TemperatureRepository temperatureRepository;
    private static final TemperatureMapper tempMapper = new TemperatureMapper();
    public void saveTemperature (TemperatureCreateRequest request, SenderType type) {
        save(request.getValue(), type);
    }
    public void saveTemperature (String value, SenderType type) {
        save(value, type);
    }
    private void save(String temp, SenderType type) {
        Temperature temperatureToSave = tempMapper.toTemperature(temp, type);
        temperatureRepository.save(temperatureToSave);
    }
    public List<Temperature> getEsp32Temperature(){
        return temperatureRepository.findAll();
    }
}
