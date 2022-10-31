package fpt.edu.bikeke.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customerTripId")
    private CustomerTrip customerTrip;

    @ManyToOne
    @JoinColumn(name = "driverTripId")
    private DriverTrip driverTrip;
    private Float amount;
    private String driverComment;
    private int driverRate;
    private String customerComment;
    private int customerRate;
    private Timestamp createdDate;
    private Timestamp pickedUpTime;
    private Timestamp arrivedTime;
    @Enumerated(EnumType.STRING)
    private EnumActive status;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Payment> payList;

}
