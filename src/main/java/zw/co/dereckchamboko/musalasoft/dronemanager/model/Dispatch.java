package zw.co.dereckchamboko.musalasoft.dronemanager.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Dispatch")
public class Dispatch {
    @Id
    @JsonIgnore
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    long id;

    @Column(name = "drone")
    long drone;


    @Column(name = "medicationId")
    long medicationId;

    @Column(name = "quantity")
    long quantity;
    @Transient
    private long totalWeight;

    @OneToOne
    @JoinColumn(name = "medicationId", insertable = false, updatable = false)
    Medication medication;

    public long getTotalWeight() {
        if(Objects.isNull(medication) || Objects.isNull(quantity)){
            return 0;
        }
        return medication.unitWeight*quantity;
    }

    public void setTotalWeight(long totalWeight) {
        this.totalWeight = totalWeight;
    }
}
