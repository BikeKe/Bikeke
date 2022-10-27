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

import fpt.edu.vn.DTO.BikeBrandDTO;
import fpt.edu.vn.DTO.PaymentDTO;
import fpt.edu.vn.DTO.PaymentMethodDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.Payment;
import fpt.edu.vn.entity.PaymentMethod;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.BikeBrandRepository;
import fpt.edu.vn.repository.PaymentMethodRepository;
import fpt.edu.vn.repository.PaymentRepository;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.service.BikeBrandServiceImpl;
import fpt.edu.vn.service.PaymentMethodServiceImpl;
import fpt.edu.vn.service.PaymentServiceImpl;
import fpt.edu.vn.service.RouteServiceImpl;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentServiceImpl payService;

	@Autowired
	private PaymentRepository payRepository;
	
	@GetMapping("")
	public List<Payment> get() {
		return payRepository.findAll();
	}
	
	
	@PostMapping("")
	public Payment create(@RequestBody Payment model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return payRepository.save(model);
	}
	
	@PutMapping("")
	public boolean update(@RequestBody PaymentDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return payService.updatePayment(model);
	}
	
	@DeleteMapping("")
	public boolean delete(@RequestBody PaymentDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return payService.deletePayment(model);
	}
	
	
}
