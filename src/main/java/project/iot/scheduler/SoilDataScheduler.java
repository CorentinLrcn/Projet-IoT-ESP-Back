package project.iot.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import project.iot.service.SoilDataService;

@Component
public class SoilDataScheduler {

    private final SoilDataService service;

    public SoilDataScheduler(SoilDataService service) {
        this.service = service;
    }

    @Scheduled(cron = "${api-properties.cron.lorawan}")
    public void checkTagOperationStatusAndUpdate() {
        service.saveSoilDataFromLoRaWan();
    }

}
