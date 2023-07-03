package zw.co.dereckchamboko.musalasoft.dronemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Dispatch;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Medication;

import java.util.List;

public interface DispatchRepository extends JpaRepository<Dispatch,Long> {

}
