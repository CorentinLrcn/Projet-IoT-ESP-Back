package project.iot.client.lorawan.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import project.iot.config.FeignInternalAuthConfig;

import java.time.Instant;

@FeignClient(
        name = "lorawan-soil-moisture-client",
        url = "${feign.client.lorawan.url}",
        configuration = {
                FeignInternalAuthConfig.class
        }
)
public interface SoilDataPrivateController {

        @RequestMapping(method = RequestMethod.GET, produces = "application/json")
        public String getSoilMoistureInfos(@RequestParam("after") Instant dateTime);

}
