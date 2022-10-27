package fpt.edu.vn.controller;

import java.sql.Timestamp;
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
import fpt.edu.vn.DTO.DriverTripDTO;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.entity.DriverTrip;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.DriverTripRepository;
import fpt.edu.vn.service.AccountServiceImpl;
import fpt.edu.vn.service.CustomerServiceImpl;
import fpt.edu.vn.service.DriveTripServiceImpl;
import fpt.edu.vn.service.DriverService;
import fpt.edu.vn.service.DriverServiceImpl;

@RestController
@RequestMapping("/driverTrip")
public class DriverTripController {

	@Autowired
	private DriveTripServiceImpl driverTripService;
	
	@Autowired
	private DriverTripRepository driverTripRepository;
	
	
	@GetMapping("")
	public List<DriverTrip> get() {
		return driverTripRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createDriverTrip(@RequestBody DriverTripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return driverTripService.save(model);
		
	}
	
	@PutMapping("")
	public boolean updateDriverTrip(@RequestBody DriverTripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return driverTripService.updateDriverTrip(model);
	}
	
	@DeleteMapping("")
	public boolean deleteDriverTrip(@RequestBody DriverTripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return driverTripService.deleteDriverTrip(model);
	}
}
