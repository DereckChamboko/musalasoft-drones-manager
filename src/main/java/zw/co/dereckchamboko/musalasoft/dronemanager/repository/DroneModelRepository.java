package zw.co.dereckchamboko.musalasoft.dronemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.DroneModel;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Medication;

public interface DroneModelRepository extends JpaRepository<DroneModel,Long> {
}
