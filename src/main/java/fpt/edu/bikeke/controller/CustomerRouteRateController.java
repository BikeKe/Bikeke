package fpt.edu.bikeke.controller;

import fpt.edu.bikeke.repository.CustomerRouteRateRepository;
import fpt.edu.bikeke.entity.CustomerRouteRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customerRouteRate")
public class CustomerRouteRateController {
    @Autowired
    private CustomerRouteRateRepository customerRouteRateRepository;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerRouteRate> get(@PathVariable Long id){
        CustomerRouteRate customerRouteRate = customerRouteRateRepository.findById(id).orElse(null);
        return new ResponseEntity<>(customerRouteRate, HttpStatus.OK);
    }
}
