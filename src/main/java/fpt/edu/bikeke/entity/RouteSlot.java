package fpt.edu.bikeke.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RouteSlot")
public class RouteSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "routeId")
    private Route route;
    private String name;
    private Time timeBegin;
    private Time timeEnd;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<DriverTrip> driverList;
    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<CustomerTrip> cusList;
}
