package zw.co.dereckchamboko.musalasoft.dronemanager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import zw.co.dereckchamboko.musalasoft.dronemanager.dto.Error;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Medication;
import zw.co.dereckchamboko.musalasoft.dronemanager.repository.MedicationRepository;

@Service
public class MedicationService {
    @Autowired
    MedicationRepository medicationRepository;

    public ResponseEntity<Object> addNewMedicine(Medication medication){
        if(medication.getName().matches("[^a-zA-Z0-9_-]")){
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Name should only contain letters, numbers, ‘-‘ and ‘_’")
                            .statusCode(0)
                            .build()
            );
        }

        if(medication.getCode().matches("[^a-zA-Z0-9_]")){
            return ResponseEntity.ok(
                    Error.builder()
                            .message("Code should only contain letters, numbers and _")
                            .statusCode(0)
                            .build()
            );
        }
        return ResponseEntity.ok(medicationRepository.save(medication));
    }

    public ResponseEntity<Object> getMedicationByID(long id){
       var results= medicationRepository.findById(id);
       if(results.isEmpty()){
           Error error= Error.builder()
                   .message("Medication not found")
                   .build();
           return ResponseEntity.ok(error);
       }
       return ResponseEntity.ok(results.get());
    }

    public ResponseEntity<Object> getAllMedication(){
        var results= medicationRepository.findAll();
        if(results.isEmpty()){
            Error error= Error.builder()
                    .message("No medication was found")
                    .build();
            return ResponseEntity.ok(error);
        }
        return ResponseEntity.ok( results );

    }
}
