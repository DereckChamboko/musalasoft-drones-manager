package zw.co.dereckchamboko.musalasoft.dronemanager.model;


import com.fasterxml.jackson.annotation.JsonProperty;
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
@Table(name = "Medication")
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicationId",nullable = false)
    long medicationId;
    String Name;
    @JsonProperty("unit_weight")
    @Column(name="weight")
    int unitWeight;
    String code;
    String image;



}
