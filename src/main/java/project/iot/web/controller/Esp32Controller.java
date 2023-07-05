package project.iot.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import project.iot.model.SenderType;
import project.iot.service.Esp32Service;
import project.iot.service.TemperatureService;
import project.iot.web.request.TemperatureCreateRequest;
import project.iot.web.response.ConfigResponse;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class Esp32Controller {

    private final TemperatureService tempService;
    private final Esp32Service esp32Service;

    @RequestMapping(method = RequestMethod.POST, value = "/api/v1/esp32", produces = MediaType.APPLICATION_JSON_VALUE)
    public void register(@Valid @RequestBody TemperatureCreateRequest request) {
        tempService.saveTemperature(request, SenderType.HTTP);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/v1/esp32/config", produces = MediaType.APPLICATION_JSON_VALUE)
    public ConfigResponse getConfig() {
        return esp32Service.getConfig();
    }

}
