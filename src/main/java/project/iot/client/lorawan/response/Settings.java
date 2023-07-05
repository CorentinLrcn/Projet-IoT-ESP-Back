package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Settings {
    @JsonProperty("data_rate")
    private DataRate dataRate;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("time")
    private String time;

    public DataRate getDataRate() {
        return dataRate;
    }

    public void setDataRate(DataRate dataRate) {
        this.dataRate = dataRate;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
