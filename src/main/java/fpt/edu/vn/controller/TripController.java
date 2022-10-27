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
import fpt.edu.vn.DTO.TripDTO;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.entity.DriverTrip;
import fpt.edu.vn.entity.Trip;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.DriverTripRepository;
import fpt.edu.vn.repository.TripRepository;
import fpt.edu.vn.service.AccountServiceImpl;
import fpt.edu.vn.service.CustomerServiceImpl;
import fpt.edu.vn.service.DriveTripServiceImpl;
import fpt.edu.vn.service.DriverService;
import fpt.edu.vn.service.DriverServiceImpl;
import fpt.edu.vn.service.TripServiceImpl;

@RestController
@RequestMapping("/trip")
public class TripController {

	@Autowired
	private TripServiceImpl tripService;
	
	@Autowired
	private TripRepository tripRepository;
	
	
	@GetMapping("")
	public List<Trip> get() {
		return tripRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createDriverTrip(@RequestBody TripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		model.setPickedUpTime(new Timestamp(System.currentTimeMillis()));
		model.setArrivedTime(new Timestamp(System.currentTimeMillis()));
		return tripService.save(model);
		
	}
	
	@PutMapping("")
	public boolean updateDriverTrip(@RequestBody TripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		model.setPickedUpTime(new Timestamp(System.currentTimeMillis()));
		model.setArrivedTime(new Timestamp(System.currentTimeMillis()));;
		return tripService.updateTrip(model);
	}
	
	@DeleteMapping("")
	public boolean deleteDriverTrip(@RequestBody TripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		model.setPickedUpTime(new Timestamp(System.currentTimeMillis()));
		model.setArrivedTime(new Timestamp(System.currentTimeMillis()));
		return tripService.deleteTrip(model);
	}
}
