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
import fpt.edu.vn.DTO.StationDTO;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.entity.Station;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.repository.StationRepository;
import fpt.edu.vn.service.RouteServiceImpl;
import fpt.edu.vn.service.StationServiceImpl;

@RestController
@RequestMapping("/station")
public class StationController {

	@Autowired
	private StationServiceImpl stationService;

	@Autowired
	private StationRepository stationRepository;

	@GetMapping("")
	public List<Station> get() {
		return stationRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createStation(@RequestBody StationDTO model) {
		return stationService.save(model);
	}
	
	@PutMapping("")
	public boolean updateStation(@RequestBody StationDTO model) {
		return stationService.updateStation(model);
	}
	
	@DeleteMapping("")
	public boolean deleteStation(@RequestBody StationDTO model) {
		return stationService.deleteStation(model);
	}
}
