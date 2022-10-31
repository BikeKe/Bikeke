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
@Table(name = "DriverTrip")
public class DriverTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "routeSlotId")
    private RouteSlot routeSlot;
    private Timestamp createdDate;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Trip> tripList;
}
