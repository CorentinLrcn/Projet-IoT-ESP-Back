package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayIds {
    @JsonProperty("gateway_id")
    private String gatewayId;
    @JsonProperty("eui")
    private String eui;

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getEui() {
        return eui;
    }

    public void setEui(String eui) {
        this.eui = eui;
    }
}
