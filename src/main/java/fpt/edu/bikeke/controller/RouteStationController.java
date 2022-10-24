package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.repository.RouteStationRepostiory;
import fpt.edu.bikeke.entity.Route;
import fpt.edu.bikeke.entity.RouteStation;
import fpt.edu.bikeke.entity.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/routeStation")
public class RouteStationController {
    @Autowired
    private RouteStationRepostiory routeStationRepostiory;

    @GetMapping("/{id}")
    public ResponseEntity<RouteStation> get(@PathVariable Long id){
        RouteStation routeStation = routeStationRepostiory.findById(id).orElse(null);
        return new ResponseEntity<>(routeStation, HttpStatus.OK);
    }

    @GetMapping("/findByRoute")
    public ResponseEntity<Iterable<RouteStation>> find(@RequestBody Route route){
        List<RouteStation> routeStationList = routeStationRepostiory.findRouteStationByRoute(route);
        return new ResponseEntity<>(routeStationList, HttpStatus.OK);
    }

    @GetMapping("/findByStation")
    public ResponseEntity<Iterable<RouteStation>> find(@RequestBody Station station){
        List<RouteStation> routeStationList = routeStationRepostiory.findRouteStationByStation(station);
        return new ResponseEntity<>(routeStationList, HttpStatus.OK);
    }
}
