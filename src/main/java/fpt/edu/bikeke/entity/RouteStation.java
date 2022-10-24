package fpt.edu.bikeke.entity;

import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RouteStation")
public class RouteStation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "routeId")
    private Route route;
    @ManyToOne
    @JoinColumn(name = "stationId")
    private Station station;
    private float previousStationDistance;
    private int orderIndex;
    @Enumerated(EnumType.STRING)
    private EnumActive status;
}
