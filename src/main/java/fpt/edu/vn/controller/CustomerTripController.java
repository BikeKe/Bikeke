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
import fpt.edu.vn.DTO.CustomerTripDTO;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.CustomerTrip;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.CustomerTripRepository;
import fpt.edu.vn.service.AccountServiceImpl;
import fpt.edu.vn.service.CustomerServiceImpl;
import fpt.edu.vn.service.CustomerTripServiceImpl;

@RestController
@RequestMapping("/customerTrip")
public class CustomerTripController {

	@Autowired
	private CustomerTripServiceImpl customerTripService;
	
	@Autowired
	private CustomerTripRepository customerTripRepository;
	
	@GetMapping("")
	public List<CustomerTrip> get() {
		return customerTripRepository.findAll();
	}
	
	@DeleteMapping("")
	public boolean deleteCustomerTrip(@RequestBody CustomerTripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return customerTripService.delete(model);
	}
	
	@PostMapping("")
	public boolean createCustomerTrip(@RequestBody CustomerTripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return customerTripService.save(model);
	}
	
	@PutMapping("")
	public boolean updateCustomerTrip(@RequestBody CustomerTripDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return customerTripService.update(model);
	}
	
}
