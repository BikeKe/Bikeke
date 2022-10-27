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
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.service.AccountServiceImpl;
import fpt.edu.vn.service.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerServiceImpl customerService;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@GetMapping("")
	public List<Customer> get() {
		return customerRepository.findAll();
	}
	
	@DeleteMapping("")
	public boolean deleteAccount(@RequestBody CustomerDTO model) {
		return customerService.deleteCustomer(model);
	}
	
	@PostMapping("")
	public boolean createCustomer(@RequestBody CustomerDTO model) {
		return customerService.save(model);
	}
	
	@PutMapping("")
	public boolean updateCustomer(@RequestBody CustomerDTO model) {
		return customerService.updateCustomer(model);
	}
	
}
