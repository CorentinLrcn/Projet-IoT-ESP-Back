package project.iot.web.response;

import lombok.Data;

@Data
public class ConfigResponse {
    private Integer tempFreq;
    private Integer connectionConfig;
    private Integer connectionFreq;
}
