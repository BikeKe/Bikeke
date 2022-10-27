package fpt.edu.vn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.DTO.RouteSlotDTO;
import fpt.edu.vn.DTO.RouteStationDTO;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.entity.RouteSlot;
import fpt.edu.vn.entity.RouteStation;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.repository.RouteSlotRepository;
import fpt.edu.vn.repository.RouteStationRepository;
import fpt.edu.vn.service.RouteServiceImpl;
import fpt.edu.vn.service.RouteSlotServiceImpl;
import fpt.edu.vn.service.RouteStationServiceImpl;

@RestController
@RequestMapping("/routeStation")
public class RouteStationController {

	@Autowired
	private RouteStationServiceImpl routeStationService;

	@Autowired
	private RouteStationRepository routeStationRepository;

	@GetMapping("")
	public List<RouteStation> get() {
		return routeStationRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createRouteSlot(@RequestBody RouteStationDTO model) {
		return routeStationService.save(model);
	}
	
	@PutMapping("")
	public boolean updateRoute(@RequestBody RouteStationDTO model) {
		return routeStationService.updateRouteStation(model);
	}
	
	@DeleteMapping("")
	public boolean deleteRoute(@RequestBody RouteStationDTO model) {
		return routeStationService.deleteRouteStation(model);
	}
}
