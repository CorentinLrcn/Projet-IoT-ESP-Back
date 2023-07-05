package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataRate {
    @JsonProperty("lora")
    private LoRa loRa;

    public LoRa getLoRa() {
        return loRa;
    }

    public void setLoRa(LoRa loRa) {
        this.loRa = loRa;
    }
}
