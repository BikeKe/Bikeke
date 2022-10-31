package fpt.edu.bikeke.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "DriverRouteRate")
public class DriverRouteRate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "driverId")
    private Driver driver;
    @ManyToOne
    @JoinColumn(name = "routeId")
    private Route route;
    private int totalTrip;
}
