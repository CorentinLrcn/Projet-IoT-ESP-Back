package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DecodedPayload {
    @JsonProperty("Bat")
    private String bat;
    @JsonProperty("TempC_DS18B20")
    private String tempC_DS18B20;
    @JsonProperty("conduct_SOIL")
    private String conductSoil;
    @JsonProperty("temp_SOIL")
    private String tempSoil;
    @JsonProperty("water_SOIL")
    private String waterSoil;

    public String getBat() {
        return bat;
    }

    public void setBat(String bat) {
        this.bat = bat;
    }

    public String getTempC_DS18B20() {
        return tempC_DS18B20;
    }

    public void setTempC_DS18B20(String tempC_DS18B20) {
        this.tempC_DS18B20 = tempC_DS18B20;
    }

    public String getConductSoil() {
        return conductSoil;
    }

    public void setConductSoil(String conductSoil) {
        this.conductSoil = conductSoil;
    }

    public String getTempSoil() {
        return tempSoil;
    }

    public void setTempSoil(String tempSoil) {
        this.tempSoil = tempSoil;
    }

    public String getWaterSoil() {
        return waterSoil;
    }

    public void setWaterSoil(String waterSoil) {
        this.waterSoil = waterSoil;
    }
}
