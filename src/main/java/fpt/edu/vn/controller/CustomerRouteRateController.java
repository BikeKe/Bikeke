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
import fpt.edu.vn.DTO.CustomerRouteRateDTO;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.CustomerRouteRate;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRateRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.service.AccountServiceImpl;
import fpt.edu.vn.service.CustomerRouteRateServiceImpl;
import fpt.edu.vn.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customerRate")
public class CustomerRouteRateController {

	@Autowired
	private CustomerRouteRateServiceImpl customerRateService;
	
	@Autowired
	private CustomerRateRepository customerRateRepository;
	
	@GetMapping("")
	public List<CustomerRouteRate> get() {
		return customerRateRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createCusRate(@RequestBody CustomerRouteRateDTO model) {
		return customerRateService.save(model);
	}
	
	@PutMapping("")
	public boolean updateCuRate(@RequestBody CustomerRouteRateDTO model) {
		return customerRateService.updateCustomerRate(model);
	}
	
}
