package zw.co.dereckchamboko.musalasoft.dronemanager.service;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import zw.co.dereckchamboko.musalasoft.dronemanager.dto.DroneBattery;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.DroneRepository;

@Service
public class DroneService {


    @Autowired
    DroneRepository droneRepository;
    public Drone saveDrone(Drone drone){
        return droneRepository.save(drone);

    }

    public ResponseEntity<Object> getDroneBatteryPercentageBiID(int id) {
        var response = droneRepository.findByDroneId(id);
        if (response != null) {
            return ResponseEntity.ok(new DroneBattery(response.getBatteryCapacity()) );
        } else {
            return ResponseEntity.notFound().build();
        }
    }
        public ResponseEntity<Object> getDroneBatteryPercentageBySerial(String serial){
            var response=droneRepository.findBySerialNumber(serial);
            if (response!=null){
                return ResponseEntity.ok(new DroneBattery(response.getBatteryCapacity()) );
            }else {
                return ResponseEntity.notFound().build();
            }
    }
}
