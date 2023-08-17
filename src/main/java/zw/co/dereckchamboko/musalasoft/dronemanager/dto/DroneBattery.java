package zw.co.dereckchamboko.musalasoft.dronemanager.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class DroneBattery {
    int batteryPercentage;
}
