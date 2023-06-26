package zw.co.dereckchamboko.musalasoft.dronemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;

public interface DroneRepository extends JpaRepository<Drone,Long> {
}
