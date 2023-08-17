package zw.co.dereckchamboko.musalasoft.dronemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.DroneState;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Medication;

public interface DroneStateRepository extends JpaRepository<DroneState,Long> {
}
