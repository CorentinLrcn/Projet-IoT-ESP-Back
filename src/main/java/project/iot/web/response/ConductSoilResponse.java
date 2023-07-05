package project.iot.web.response;

import java.time.Instant;

public class ConductSoilResponse {

    private Integer value;
    private Instant timestamp;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public ConductSoilResponse(Integer value, Instant timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }
}
