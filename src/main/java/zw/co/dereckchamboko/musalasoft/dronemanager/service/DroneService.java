package zw.co.dereckchamboko.musalasoft.dronemanager.service;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import zw.co.dereckchamboko.musalasoft.dronemanager.dto.AvailableDrone;
import zw.co.dereckchamboko.musalasoft.dronemanager.dto.DroneBattery;
import zw.co.dereckchamboko.musalasoft.dronemanager.dto.Error;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.DroneState;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.DroneModelRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.DroneRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.DroneStateRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.util.WeightUtils;

import java.awt.*;
import java.util.ArrayList;

@Service
public class DroneService {


    @Autowired
    DroneRepository droneRepository;

    @Autowired
    DroneStateRepository droneStateRepository;

    @Autowired
    DroneModelRepository droneModelRepository;


    public ResponseEntity<Object> saveDrone(Drone drone){
        if(drone.getSerialNumber().length()>100){
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Serial number must not exceed 100 non white space characters")
                            .statusCode(0)
                            .build()
            );
        }
        if(drone.getBatteryCapacity()<0 || drone.getBatteryCapacity()>100){
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Battery percentage should be between 0 and 100 inclusive")
                            .statusCode(0)
                            .build()
            );
        }
        if(droneModelRepository.findById(drone.getDroneModelId()).isEmpty()){
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Drone Model is invalid")
                            .statusCode(0)
                            .build()
            );
        }
        if(droneStateRepository.findById(drone.getDroneStateId()).isEmpty()){
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Drone state is invalid")
                            .statusCode(0)
                            .build()
            );
        }

        return ResponseEntity.ok(droneRepository.save(drone));

    }

    public ResponseEntity<Object> getDroneBatteryPercentageBiID(int id) {
        var response = droneRepository.findByDroneId(id);
        if (response != null) {
            return ResponseEntity.ok(new DroneBattery(response.getBatteryCapacity()) );
        } else {
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Drone ID is invalid")
                            .statusCode(0)
                            .build()
            );
        }
    }
        public ResponseEntity<Object> getDroneBatteryPercentageBySerial(String serial) {
            var response = droneRepository.findBySerialNumber(serial);
            if (response != null) {
                return ResponseEntity.ok(new DroneBattery(response.getBatteryCapacity()));
            } else {
                return ResponseEntity.ok(
                        Error.builder()
                                .message("Serial is invalid")
                                .statusCode(0)
                                .build()
                );
            }
        }

            public ResponseEntity<Object> getDroneLoadedByDroneID(long id){
                var response=droneRepository.findByDroneId(id);
                if (response!=null){
                    return ResponseEntity.ok(response);
                }else {
                    return ResponseEntity.ok(
                            Error.builder()
                                    .message("Drone ID is invalid")
                                    .statusCode(0)
                                    .build()
                    );
                }


    }

    public ResponseEntity<Object> getDroneLoadedByIDBySerialID(String serial) {
        var response=droneRepository.findBySerialNumber(serial);
        if (response!=null){
            return ResponseEntity.ok(response);
        }else {
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Serial is invalid")
                            .statusCode(0)
                            .build()
            );
        }
    }

    public ResponseEntity<Object> getAllDronesAvailableForLoading() {
        var response=droneRepository.findAll();
        ArrayList availableDrones=new ArrayList<AvailableDrone>();
        for(Drone drone:response){
            if(!drone.isActive()){
                continue;
            }
            if(drone.getBatteryCapacity()<25){
                continue;
            }
            var availableSpace= WeightUtils.getAvailableLoadSpace(drone);
            if(availableSpace<=0){
                continue;
            }
            availableDrones.add(
                    AvailableDrone.builder()
                            .availableSpace(availableSpace)
                            .droneState(drone.getDroneState())
                            .droneModel(drone.getDroneModel())
                            .droneId(drone.getDroneId())
                            .serialNumber(drone.getSerialNumber())
                            .batteryCapacity(drone.getBatteryCapacity())
                            .build()
            );

        }
        if(availableDrones.isEmpty()){
            return ResponseEntity.ok(
                    Error.builder()
                            .message("No available drones at the moment")
                            .build()
            );

        }
        return ResponseEntity.ok(availableDrones);

    }
}
