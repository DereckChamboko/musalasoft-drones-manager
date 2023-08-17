package zw.co.dereckchamboko.musalasoft.dronemanager.util;

import zw.co.dereckchamboko.musalasoft.dronemanager.model.Dispatch;
import zw.co.dereckchamboko.musalasoft.dronemanager.model.Drone;

public class WeightUtils {

    public static long getAvailableLoadSpace(Drone drone){
        var maxPayload=drone.getDroneModel().getPayload();
        var loadedWeight=0;
        for(Dispatch loadedItems:drone.getDispatch()){
            loadedWeight+=loadedItems.getTotalWeight();
        }
        return maxPayload-loadedWeight;
    }
}
