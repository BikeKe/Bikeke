package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.repository.CustomerRepository;
import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Customer> get(@PathVariable Long id){
        Customer customer = customerRepository.findById(id).orElse(null);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/find")
    public ResponseEntity<Customer> find(@RequestBody Account account){
        Customer customer = customerRepository.findCustomerByAccount(account).orElse(null);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
