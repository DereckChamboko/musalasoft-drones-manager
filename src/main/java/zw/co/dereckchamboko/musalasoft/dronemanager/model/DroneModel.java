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
@Table(name = "DroneModel")
public class DroneModel {

    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "droneModelId",nullable = false)
    long droneModelId;

    @Column(name = "modelName",nullable = false)
    String modelName;

    @Column(name = "payload",nullable = false)
    long payload;


    @JsonIgnore
    @Column(name = "isActive",nullable = false)
    boolean isActive;


}
