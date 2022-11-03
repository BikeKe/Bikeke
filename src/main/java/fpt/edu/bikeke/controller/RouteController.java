package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.constant.UrlConst;
import fpt.edu.bikeke.dto.RouteDto;
import fpt.edu.bikeke.service.IRouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RouteController {
    @Autowired
    private IRouteService routeService;

    @GetMapping(UrlConst.ROUTE_FIND_ALL)
    public ResponseEntity<Iterable<RouteDto>> getAll(){
        List<RouteDto> routeDtoList = routeService.findAll();
        if(routeDtoList == null){
            return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
        }
        return new ResponseEntity<>(routeDtoList, HttpStatus.OK);
    }

    @PostMapping(UrlConst.ROUTE_CREATE)
    public ResponseEntity<Boolean> create(@RequestBody RouteDto routeDto){
        if (routeService.create(routeDto)){
            return new ResponseEntity<>(true, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(false, HttpStatus.OK);
    }

    @PutMapping(UrlConst.ROUTE_UPDATE)
    public ResponseEntity<Boolean> update(@RequestBody RouteDto routeDto){
        if(routeService.update(routeDto)){
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.OK);
    }

    @DeleteMapping(UrlConst.ROUTE_DELETE)
    public ResponseEntity<Boolean> delete(@PathVariable Long id){
        return new ResponseEntity<>(routeService.delete(id), HttpStatus.OK);
    }
}
