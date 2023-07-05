package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoRa {
    @JsonProperty("bandwidth")
    private int bandwidth;
    @JsonProperty("spreading_factor")
    private int spreadingFactor;
    @JsonProperty("coding_rate")
    private String codingRate;

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getSpreadingFactor() {
        return spreadingFactor;
    }

    public void setSpreadingFactor(int spreadingFactor) {
        this.spreadingFactor = spreadingFactor;
    }

    public String getCodingRate() {
        return codingRate;
    }

    public void setCodingRate(String codingRate) {
        this.codingRate = codingRate;
    }
}
