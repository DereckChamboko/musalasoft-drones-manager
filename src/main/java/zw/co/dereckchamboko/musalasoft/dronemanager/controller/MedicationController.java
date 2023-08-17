package zw.co.dereckchamboko.musalasoft.dronemanager.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Medication;
import zw.co.dereckchamboko.musalasoft.dronemanager.service.MedicationService;

@Controller
@RequestMapping("/medication")
public class MedicationController {

    @Autowired
    MedicationService medicationService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> findMedicationById(@PathVariable("id") long id){
        return medicationService.getMedicationByID(id);
    }

    @GetMapping("/all")
    public ResponseEntity<Object> findALLMedication(){
        return medicationService.getAllMedication();
    }

    @RequestMapping("/addNew")
    public ResponseEntity<Object> saveNewMedication(@RequestBody Medication medication){

        return medicationService.addNewMedicine(medication);
    }
}
