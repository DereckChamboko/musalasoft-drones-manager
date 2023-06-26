package zw.co.dereckchamboko.musalasoft.dronemanager.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Drone")
public class Drone {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    long id;
    String serialNumber;

    long modelId;

    int batteryCapacity;

    long droneState;

    boolean isActive;

}
