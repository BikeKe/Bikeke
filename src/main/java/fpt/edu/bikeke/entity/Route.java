package fpt.edu.bikeke.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fpt.edu.bikeke.enums.EnumActive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Route")
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String placeFrom;
    private String placeTo;
    private float defaultCost;
    @Enumerated(EnumType.STRING)
    private EnumActive status;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<RouteStation> routeStationList;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<CustomerRouteRate> customerRouteRateList;
}
