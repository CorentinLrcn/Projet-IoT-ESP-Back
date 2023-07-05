package project.iot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("api-properties.esp32")
public class Esp32Properties {
    private Integer tempFreq;
    private Integer connectionConfig;
    private Integer connectionFreq;

    public Integer getTempFreq() {
        return tempFreq;
    }

    public void setTempFreq(Integer tempFreq) {
        this.tempFreq = tempFreq;
    }

    public Integer getConnectionConfig() {
        return connectionConfig;
    }

    public void setConnectionConfig(Integer connectionConfig) {
        this.connectionConfig = connectionConfig;
    }

    public Integer getConnectionFreq() {
        return connectionFreq;
    }

    public void setConnectionFreq(Integer connectionFreq) {
        this.connectionFreq = connectionFreq;
    }
}
