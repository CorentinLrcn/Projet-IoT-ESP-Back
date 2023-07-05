package project.iot.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import project.iot.model.Temperature;
import project.iot.service.TemperatureService;
import project.iot.web.response.TemperatureResponse;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class TemperatureController {

    private final TemperatureService tempService;

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/temperature", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Temperature> getConfig() {
        return tempService.getEsp32Temperature();
    }

}
