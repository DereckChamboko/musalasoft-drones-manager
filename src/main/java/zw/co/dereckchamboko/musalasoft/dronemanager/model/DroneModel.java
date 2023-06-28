package zw.co.dereckchamboko.musalasoft.dronemanager.model;

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
@Table(name = "DroneModel")
public class DroneModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "droneModelId",nullable = false)
    long droneModelId;

    @Column(name = "modelName",nullable = false)
    String modelName;

    @Column(name = "payload",nullable = false)
    long payload;

    @Column(name = "isActive",nullable = false)
    boolean isActive;


}
