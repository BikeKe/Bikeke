package fpt.edu.bikeke.repository;

import fpt.edu.bikeke.entity.Route;
import fpt.edu.bikeke.entity.RouteStation;
import fpt.edu.bikeke.entity.Station;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteStationRepostiory extends JpaRepository<RouteStation, Long> {
    List<RouteStation> findRouteStationByRoute(Route route);

    List<RouteStation> findRouteStationByStation(Station station);
}
