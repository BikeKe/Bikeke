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

import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.service.AccountServiceImpl;
import fpt.edu.vn.service.CustomerServiceImpl;
import fpt.edu.vn.service.DriverService;
import fpt.edu.vn.service.DriverServiceImpl;

@RestController
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	private DriverServiceImpl driverService;
	
	@Autowired
	private DriverRepository driverRepository;
	
	
	@GetMapping("")
	public List<Driver> get() {
		return driverRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createDriver(@RequestBody DriverDTO model) {
		return driverService.save(model);
		
	}
	
	@PutMapping("")
	public boolean updateDriver(@RequestBody DriverDTO model) {
		return driverService.updateDriver(model);
	}
	
	@DeleteMapping("")
	public boolean deleteDriver(@RequestBody DriverDTO model) {
		return driverService.deleteDriver(model);
	}
}
