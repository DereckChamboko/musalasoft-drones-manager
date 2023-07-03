package zw.co.dereckchamboko.musalasoft.dronemanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Dispatch;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.DroneModel;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.DroneState;

import java.util.Collection;
@Data
@Builder
public class AvailableDrone {



    long droneId;
    String serialNumber;

    DroneModel droneModel;

    int batteryCapacity;

    DroneState droneState;

    private Long availableSpace;

}
