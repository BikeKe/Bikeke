package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.repository.StationRepository;
import fpt.edu.bikeke.entity.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/station")
public class StationController {
    @Autowired
    private StationRepository stationRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Station> get(@PathVariable Long id){
        Station station = stationRepository.findById(id).orElse(null);
        return new ResponseEntity<>(station, HttpStatus.OK);
    }
}
