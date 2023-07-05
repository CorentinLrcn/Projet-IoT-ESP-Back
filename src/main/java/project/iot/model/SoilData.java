package project.iot.model;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "soil")
public class SoilData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "conduct_soil")
    private Integer conductSoil;
    @Column(name = "temp_soil")
    private Float tempSoil;
    @Column(name = "soil_moisture")
    private Float soilMoisture;
    private Instant timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConductSoil() {
        return conductSoil;
    }

    public void setConductSoil(Integer conductSoil) {
        this.conductSoil = conductSoil;
    }

    public Float getTempSoil() {
        return tempSoil;
    }

    public void setTempSoil(Float tempSoil) {
        this.tempSoil = tempSoil;
    }

    public float getSoilMoisture() {
        return soilMoisture;
    }

    public void setSoilMoisture(float soilMoisture) {
        this.soilMoisture = soilMoisture;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
