package project.iot.client.mqtt;

import org.eclipse.paho.client.mqttv3.*;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import project.iot.model.SenderType;
import project.iot.properties.MqttProperties;
import project.iot.service.TemperatureService;
import project.iot.web.request.TemperatureCreateRequest;

@Component
public class MqttSubscriber implements MqttCallback, ApplicationRunner {
    Logger logger = LoggerFactory.getLogger(MqttSubscriber.class);

    private final TemperatureService tempService;

    @Autowired
    MqttProperties mqttProperties;

    public MqttSubscriber(TemperatureService tempService, MqttProperties mqttProperties) {
        this.tempService = tempService;
        this.mqttProperties = mqttProperties;
    }

    @Override
    public void run(ApplicationArguments args) {
        try (MqttClient mqttClient = new MqttClient(mqttProperties.getBroker(), mqttProperties.getClient())) {
            mqttClient.setCallback(this);
            mqttClient.connect();
            mqttClient.subscribe(mqttProperties.getTopic());
        } catch (MqttException e) {
            logger.warn(e.getMessage());
        }
    }

    @Override
    public void connectionLost(Throwable cause) {
        logger.error("Connection lost: " + cause.getMessage());
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws Exception {
        logger.info("Received message on topic '" + topic + "': " + new String(message.getPayload()));
        JSONObject payload = new JSONObject(new String(message.getPayload()));
        TemperatureCreateRequest temp = new TemperatureCreateRequest();
        tempService.saveTemperature(payload.get("value").toString(), SenderType.MQTT);

    }

    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        // Not used in subscriber
    }

}
