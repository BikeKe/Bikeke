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
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.service.RouteServiceImpl;

@RestController
@RequestMapping("/route")
public class RouteController {

	@Autowired
	private RouteServiceImpl routeService;

	@Autowired
	private RouteRepository routeRepository;

	@GetMapping("")
	public List<Route> get() {
		return routeRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createRoute(@RequestBody RouteDTO model) {
		return routeService.save(model);
	}
	
	@PutMapping("")
	public boolean updateRoute(@RequestBody RouteDTO model) {
		return routeService.updateRoute(model);
	}
	
	@DeleteMapping("")
	public boolean deleteRoute(@RequestBody RouteDTO model) {
		return routeService.deleteRoute(model);
	}
}
