package zw.co.dereckchamboko.musalasoft.dronemanager.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @Column(name = "droneId",nullable = false)
    @JsonIgnore
    long droneId;
    String serialNumber;


    @ManyToOne
    @JoinColumn(name = "droneModelId", insertable = false, updatable = false)
    DroneModel droneModel;

    int batteryCapacity;

    @ManyToOne
    @JoinColumn(name = "droneStateId", insertable = false, updatable = false)
    DroneState droneState;

    boolean isActive;

    @Column(name = "droneStateId")
    private Long droneStateId;

    @Column(name = "droneModelId")
    private Long droneModelId;

}
