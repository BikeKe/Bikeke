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
import fpt.edu.vn.DTO.PaymentMethodDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.PaymentMethod;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.BikeBrandRepository;
import fpt.edu.vn.repository.PaymentMethodRepository;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.service.BikeBrandServiceImpl;
import fpt.edu.vn.service.PaymentMethodServiceImpl;
import fpt.edu.vn.service.RouteServiceImpl;

@RestController
@RequestMapping("/paymentMethod")
public class PaymentMethodController {

	@Autowired
	private PaymentMethodServiceImpl payService;

	@Autowired
	private PaymentMethodRepository payRepository;
	
	@GetMapping("")
	public List<PaymentMethod> get() {
		return payRepository.findAll();
	}
	
	@PostMapping("")
	public boolean create(@RequestBody PaymentMethodDTO model) {
		return payService.save(model);
	}
	
	@PutMapping("")
	public boolean update(@RequestBody PaymentMethodDTO model) {
		return payService.updatePaymentMethod(model);
	}
	
	@DeleteMapping("")
	public boolean delete(@RequestBody PaymentMethodDTO model) {
		return payService.deletePaymentMethod(model);
	}
	
	
}
