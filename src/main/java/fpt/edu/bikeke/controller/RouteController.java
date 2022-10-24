package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.repository.RouteRepository;
import fpt.edu.bikeke.entity.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class RouteController {
    @Autowired
    private RouteRepository routeRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Route> get(@PathVariable Long id){
        Route route = routeRepository.findById(id).orElse(null);
        return new ResponseEntity<>(route, HttpStatus.OK);
    }
}
