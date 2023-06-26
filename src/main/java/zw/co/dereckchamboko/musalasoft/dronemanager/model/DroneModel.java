package zw.co.dereckchamboko.musalasoft.dronemanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DroneModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    long id;

    String modelName;

    int payload;

    boolean isActive;


}
