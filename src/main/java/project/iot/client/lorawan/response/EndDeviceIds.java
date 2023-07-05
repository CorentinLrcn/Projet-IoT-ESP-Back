package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EndDeviceIds {
    @JsonProperty("device_id")
    private String deviceId;
    @JsonProperty("application_ids")
    private ApplicationIds applicationIds;
    @JsonProperty("dev_eui")
    private String devEui;
    @JsonProperty("dev_addr")
    private String devAddr;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public ApplicationIds getApplicationIds() {
        return applicationIds;
    }

    public void setApplicationIds(ApplicationIds applicationIds) {
        this.applicationIds = applicationIds;
    }

    public String getDevEui() {
        return devEui;
    }

    public void setDevEui(String devEui) {
        this.devEui = devEui;
    }

    public String getDevAddr() {
        return devAddr;
    }

    public void setDevAddr(String devAddr) {
        this.devAddr = devAddr;
    }
}
