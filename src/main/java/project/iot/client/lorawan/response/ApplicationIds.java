package project.iot.client.lorawan.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApplicationIds {
    @JsonProperty("application_id")
    private String applicationId;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
