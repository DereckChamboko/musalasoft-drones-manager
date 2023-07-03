package zw.co.dereckchamboko.musalasoft.dronemanager.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DroneState")
public class DroneState {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "droneStateId",nullable = false)
    long droneStateId;
    String droneStateDescription;
    @JsonIgnore
    boolean isActive;

}
