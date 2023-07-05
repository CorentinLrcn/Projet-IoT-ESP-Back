package project.iot.web.response;

import java.util.List;

public class SoilDataResponse {
    private List<SoilMoistureResponse> soilMoistures;
    private List<TemperatureSoilResponse> tempSoils;
    private List<ConductSoilResponse> conductSoils;

    public List<SoilMoistureResponse> getSoilMoistures() {
        return soilMoistures;
    }

    public void setSoilMoistures(List<SoilMoistureResponse> soilMoistures) {
        this.soilMoistures = soilMoistures;
    }

    public List<TemperatureSoilResponse> getTempSoils() {
        return tempSoils;
    }

    public void setTempSoils(List<TemperatureSoilResponse> tempSoils) {
        this.tempSoils = tempSoils;
    }

    public List<ConductSoilResponse> getConductSoils() {
        return conductSoils;
    }

    public void setConductSoils(List<ConductSoilResponse> conductSoils) {
        this.conductSoils = conductSoils;
    }
}
