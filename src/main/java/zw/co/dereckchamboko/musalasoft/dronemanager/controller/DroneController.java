package zw.co.dereckchamboko.musalasoft.dronemanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;
import zw.co.dereckchamboko.musalasoft.dronemanager.service.DroneService;


@RestController
public class DroneController {

    @Autowired
    DroneService droneService;


    @RequestMapping("drone/addNew")
    public Drone saveNewDrone(@RequestBody Drone drone){

        return droneService.saveDrone(drone);
    }

    @GetMapping("drone/checkBattery/id/{id}")
    public ResponseEntity<Object> checkDroneBattery(@PathVariable("id") int id){

        return droneService.getDroneBatteryPercentageBiID(id);
    }

    @GetMapping("drone/checkBattery/serialNumber/{serial}")
    public ResponseEntity<Object> checkDroneBattery(@PathVariable("serial") String serial){

        return droneService.getDroneBatteryPercentageBySerial(serial);
    }
}
