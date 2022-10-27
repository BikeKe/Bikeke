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
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.entity.RouteSlot;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.repository.RouteSlotRepository;
import fpt.edu.vn.service.RouteServiceImpl;
import fpt.edu.vn.service.RouteSlotServiceImpl;

@RestController
@RequestMapping("/routeSlot")
public class RouteSlotController {

	@Autowired
	private RouteSlotServiceImpl routeSlotService;

	@Autowired
	private RouteSlotRepository routeSlotRepository;

	@GetMapping("")
	public List<RouteSlot> get() {
		return routeSlotRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createRouteSlot(@RequestBody RouteSlotDTO model) {
		return routeSlotService.save(model);
	}
	
	@PutMapping("")
	public boolean updateRoute(@RequestBody RouteSlotDTO model) {
		return routeSlotService.updateSlot(model);
	}
	
	@DeleteMapping("")
	public boolean deleteRoute(@RequestBody RouteSlotDTO model) {
		return routeSlotService.deleteSlot(model);
	}
}
