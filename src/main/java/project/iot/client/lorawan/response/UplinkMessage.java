package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UplinkMessage {
    @JsonProperty("f_port")
    private int fPort;
    @JsonProperty("f_cnt")
    private int fCnt;
    @JsonProperty("frm_payload")
    private String frmPayload;
    @JsonProperty("decoded_payload")
    private DecodedPayload decodedPayload;
    @JsonProperty("rx_metadata")
    private RxMetadata[] rxMetadata;
    @JsonProperty("settings")
    private Settings settings;
    @JsonProperty("received_at")
    private String receivedAt;
    @JsonProperty("consumed_airtime")
    private String consumedAirtime;
    @JsonProperty("network_ids")
    private NetworkIds networkIds;
    private boolean confirmed;


    public int getfPort() {
        return fPort;
    }

    public void setfPort(int fPort) {
        this.fPort = fPort;
    }

    public int getfCnt() {
        return fCnt;
    }

    public void setfCnt(int fCnt) {
        this.fCnt = fCnt;
    }

    public String getFrmPayload() {
        return frmPayload;
    }

    public void setFrmPayload(String frmPayload) {
        this.frmPayload = frmPayload;
    }

    public DecodedPayload getDecodedPayload() {
        return decodedPayload;
    }

    public void setDecodedPayload(DecodedPayload decodedPayload) {
        this.decodedPayload = decodedPayload;
    }

    public RxMetadata[] getRxMetadata() {
        return rxMetadata;
    }

    public void setRxMetadata(RxMetadata[] rxMetadata) {
        this.rxMetadata = rxMetadata;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public String getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public String getConsumedAirtime() {
        return consumedAirtime;
    }

    public void setConsumedAirtime(String consumedAirtime) {
        this.consumedAirtime = consumedAirtime;
    }

    public NetworkIds getNetworkIds() {
        return networkIds;
    }

    public void setNetworkIds(NetworkIds networkIds) {
        this.networkIds = networkIds;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}
