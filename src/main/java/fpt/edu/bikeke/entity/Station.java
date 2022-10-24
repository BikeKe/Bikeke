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
@Table(name = "Station")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String img;
    private float latitude;
    private float longtitude;
    @Enumerated(EnumType.STRING)
    private EnumActive status;

    @OneToMany(fetch = FetchType.LAZY)
    @JsonBackReference
    private List<RouteStation> routeStationList;
}
