package project.iot.web.response;

import java.time.Instant;
import java.util.Map;

public class TemperatureResponse {

    Map<Instant, Float> temperatures;

    public Map<Instant, Float> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(Map<Instant, Float> temperatures) {
        this.temperatures = temperatures;
    }
}
