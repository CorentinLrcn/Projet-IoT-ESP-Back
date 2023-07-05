package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RxMetadata {
    @JsonProperty("gateway_ids")
    private GatewayIds gatewayIds;
    @JsonProperty("time")
    private String time;
    @JsonProperty("timestamp")
    private long timestamp;
    @JsonProperty("rssi")
    private int rssi;
    @JsonProperty("channel_rssi")
    private int channelRssi;
    @JsonProperty("snr")
    private double snr;
    @JsonProperty("frequency_offset")
    private String frequencyOffset;
    @JsonProperty("channel_index")
    private int channelIndex;
    @JsonProperty("received_at")
    private String receivedAt;
    @JsonProperty("location")
    private Location location;

    public GatewayIds getGatewayIds() {
        return gatewayIds;
    }

    public void setGatewayIds(GatewayIds gatewayIds) {
        this.gatewayIds = gatewayIds;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public int getChannelRssi() {
        return channelRssi;
    }

    public void setChannelRssi(int channelRssi) {
        this.channelRssi = channelRssi;
    }

    public double getSnr() {
        return snr;
    }

    public void setSnr(double snr) {
        this.snr = snr;
    }

    public String getFrequencyOffset() {
        return frequencyOffset;
    }

    public void setFrequencyOffset(String frequencyOffset) {
        this.frequencyOffset = frequencyOffset;
    }

    public int getChannelIndex() {
        return channelIndex;
    }

    public void setChannelIndex(int channelIndex) {
        this.channelIndex = channelIndex;
    }

    public String getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(String receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
