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

import fpt.edu.vn.DTO.BikeBrandDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.BikeBrandRepository;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.service.BikeBrandServiceImpl;
import fpt.edu.vn.service.RouteServiceImpl;

@RestController
@RequestMapping("/bikeBrand")
public class BikeBrandController {

	@Autowired
	private BikeBrandServiceImpl bikeBrandService;

	@Autowired
	private BikeBrandRepository bikeBrandRepository;
	
	@GetMapping("")
	public List<BikeBrand> get() {
		return bikeBrandRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createBrand(@RequestBody BikeBrandDTO model) {
		return bikeBrandService.save(model);
	}
	
	@PutMapping("")
	public boolean updateRoute(@RequestBody BikeBrandDTO model) {
		return bikeBrandService.updateBrand(model);
	}
	
	@DeleteMapping("")
	public boolean deleteRoute(@RequestBody BikeBrandDTO model) {
		return bikeBrandService.deleteBrand(model);
	}
	
	
}
