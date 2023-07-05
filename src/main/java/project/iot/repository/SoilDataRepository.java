package project.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import project.iot.model.SoilData;

import java.time.Instant;
import java.util.Optional;

@Repository
public interface SoilDataRepository extends JpaRepository<SoilData, Long> {
    @Query(value = "SELECT MAX(timestamp) FROM SoilData")
    public Optional<Instant> getLastSoilDate();

}
