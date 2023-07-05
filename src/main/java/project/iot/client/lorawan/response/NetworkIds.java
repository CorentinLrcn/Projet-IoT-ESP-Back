package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NetworkIds {
    @JsonProperty("net_id")
    private String netId;
    @JsonProperty("tenant_id")
    private String tenantId;
    @JsonProperty("cluster_id")
    private String clusterId;
    @JsonProperty("cluster_address")
    private String clusterAddress;

    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterAddress() {
        return clusterAddress;
    }

    public void setClusterAddress(String clusterAddress) {
        this.clusterAddress = clusterAddress;
    }
}
