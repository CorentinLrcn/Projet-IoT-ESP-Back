package project.iot.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import project.iot.service.SoilDataService;
import project.iot.web.response.SoilDataResponse;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class SoilController {

    private final SoilDataService soilDataService;

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/ttn", produces = MediaType.APPLICATION_JSON_VALUE)
    public SoilDataResponse getConfig() {
        return soilDataService.getDataToGraph();
    }

}
