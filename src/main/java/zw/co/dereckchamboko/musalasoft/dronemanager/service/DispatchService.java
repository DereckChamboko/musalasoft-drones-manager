package zw.co.dereckchamboko.musalasoft.dronemanager.service;


import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import zw.co.dereckchamboko.musalasoft.dronemanager.dto.Error;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Dispatch;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Medication;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.DispatchRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.DroneRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.MedicationRepository;
import zw.co.dereckchamboko.musalasoft.dronemanager.util.WeightUtils;

import java.util.Objects;

@Slf4j
@Service
public class DispatchService {

    @Autowired
    DispatchRepository dispatchRepository;

    @Autowired
    MedicationRepository medicationRepository;

    @Autowired
    DroneRepository droneRepository;



    @Autowired
    DroneService droneService;
    public ResponseEntity<Object> LoadDrone(Dispatch dispatch) {
        log.info("Dispatch request {}",dispatch);
        log.info("Retrieving drone with ID:{}",dispatch.getDrone());
        var drone=droneRepository.findById(dispatch.getDrone());
        if(drone.isEmpty()){
            log.error("Could not find drone with ID {}",dispatch.getDrone());
            return ResponseEntity.ok(
                    Error.builder()
                            .statusCode(0)
                            .message("Drone ID is invalid")
                            .build()
            );
        }
        log.info("Retrieved drone :{}",drone);
        log.info("Retrieving medication with ID:{}",dispatch.getMedicationId());

        var medication=medicationRepository.findById(dispatch.getMedicationId());
        if(medication.isEmpty()){
            log.error("Could not find medication with ID {}",dispatch.getMedicationId());
            return ResponseEntity.ok(
                    Error.builder()
                            .statusCode(0)
                            .message("Medication ID is invalid")
                            .build()
            );
        }

        log.info("Retrieved medication :{}",medication);
        if(drone.get().getBatteryCapacity()<25){
            Error error=Error.builder()
                    .message("Drone can only be loaded if its battery level is above "+25+"%, currently the battery level is "+drone.get().getBatteryCapacity()+"%")
                    .build();
            return ResponseEntity.ok(error);
        }

            if(!drone.get().getDroneState().getDroneStateDescription().equals("IDLE")){
                Error error=Error.builder()
                        .message("Drone can only be loaded if it is in an 'IDLE' state, currently the drones state is "+drone.get().getDroneState().getDroneStateDescription())
                        .build();
                return ResponseEntity.ok(error);
            }
        var availableLoadWeight= WeightUtils.getAvailableLoadSpace(drone.get());
        if(availableLoadWeight<(medication.get().getUnitWeight()*dispatch.getQuantity())){
            Error error=Error.builder()
                    .message("Drone can not be loaded with a weight of "+medication.get().getUnitWeight()* dispatch.getQuantity()+"g, available space is only "+availableLoadWeight+"g")
                    .build();
            return ResponseEntity.ok(error);
        }

      return ResponseEntity.ok(dispatchRepository.save(dispatch));

    }




}
