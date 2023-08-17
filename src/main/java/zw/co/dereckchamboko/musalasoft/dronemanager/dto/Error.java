package zw.co.dereckchamboko.musalasoft.dronemanager.dto;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Error {
    long statusCode;
    String message;
}
