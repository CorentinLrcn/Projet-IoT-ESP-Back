package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
    @JsonProperty("end_device_ids")
    private EndDeviceIds endDeviceIds;
    @JsonProperty("received_at")
    private String receivedAt;
    @JsonProperty("uplink_message")
    private UplinkMessage uplinkMessage;

    public EndDeviceIds getEndDeviceIds() {
        return endDeviceIds;
    }

    public void setEndDeviceIds(EndDeviceIds endDeviceIds) {
        this.endDeviceIds = endDeviceIds;
    }

    public String getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public UplinkMessage getUplinkMessage() {
        return uplinkMessage;
    }

    public void setUplinkMessage(UplinkMessage uplinkMessage) {
        this.uplinkMessage = uplinkMessage;
    }
}
