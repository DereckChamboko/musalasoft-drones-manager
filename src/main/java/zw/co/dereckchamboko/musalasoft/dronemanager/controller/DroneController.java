package zw.co.dereckchamboko.musalasoft.dronemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Dispatch;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;
import zw.co.dereckchamboko.musalasoft.dronemanager.service.DispatchService;
import zw.co.dereckchamboko.musalasoft.dronemanager.service.DroneService;


@RestController
@RequestMapping("/drone")
public class DroneController {

    @Autowired
    DroneService droneService;

    @Autowired
    DispatchService dispatchService;

    @RequestMapping("/addNew")
    public ResponseEntity<Object> saveNewDrone(@RequestBody Drone drone){

        return droneService.saveDrone(drone);
    }

    @GetMapping("/checkBattery/id/{id}")
    public ResponseEntity<Object> checkDroneBattery(@PathVariable("id") int id){

        return droneService.getDroneBatteryPercentageBiID(id);
    }

    @GetMapping("/checkBattery/serialNumber/{serial}")
    public ResponseEntity<Object> checkDroneBattery(@PathVariable("serial") String serial){

        return droneService.getDroneBatteryPercentageBySerial(serial);
    }


    @GetMapping("/checkLoaded/id/{id}")
    public ResponseEntity<Object> checkLoadedByDroneID(@PathVariable("id") int id){

        return droneService.getDroneLoadedByDroneID(id);

    }
    @GetMapping("/checkLoaded/serialNumber/{serial}")
    public ResponseEntity<Object> checkLoadedBySerial(@PathVariable("serial") String serial){

        return droneService.getDroneLoadedByIDBySerialID(serial);

    }


    @PostMapping("/load")
    public ResponseEntity<Object> loadDrone(@RequestBody Dispatch dispatch){
        return dispatchService.LoadDrone(dispatch);
    }

    @GetMapping("/available")
    public ResponseEntity<Object> getAllDronesAvailableForLoading(){
        return droneService.getAllDronesAvailableForLoading();
    }



}
