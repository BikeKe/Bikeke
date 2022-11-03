package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.dto.StationDto;
import fpt.edu.bikeke.page.PageStation;
import fpt.edu.bikeke.service.IStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StationController {
    @Autowired
    private IStationService stationService;

    @GetMapping(UrlConst.STATION_FIND_ALL)
    public ResponseEntity<?> findAll(@RequestParam int page) {
        page -= 1;
        PageStation stationList = stationService.findAll(page);
        if (stationList == null) {
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
        }
        return new ResponseEntity<>(stationList, HttpStatus.OK);
    }

    @PostMapping(UrlConst.STATION_CREATE)
    public ResponseEntity<Boolean> create(@RequestBody StationDto stationDto) {
        return new ResponseEntity<>(stationService.create(stationDto), HttpStatus.OK);
    }

    @PutMapping(UrlConst.STATION_UPDATE)
    public ResponseEntity<Boolean> update(@RequestBody StationDto stationDto) {
        return new ResponseEntity<>(stationService.update(stationDto), HttpStatus.OK);
    }

    @DeleteMapping(UrlConst.STATION_DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return new ResponseEntity<>(stationService.delete(id), HttpStatus.OK);
    }
}
