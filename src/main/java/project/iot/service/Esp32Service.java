package project.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.iot.properties.Esp32Properties;
import project.iot.web.response.ConfigResponse;

@Service
public class Esp32Service {

    @Autowired
    Esp32Properties esp32Properties;

    public ConfigResponse getConfig(){
        ConfigResponse response = new ConfigResponse();
        response.setConnectionConfig(esp32Properties.getConnectionConfig());
        response.setTempFreq(esp32Properties.getTempFreq());
        response.setConnectionFreq(esp32Properties.getConnectionFreq());
        return response;
    }
}
