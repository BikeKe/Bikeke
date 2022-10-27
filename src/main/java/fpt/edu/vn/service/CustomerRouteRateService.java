package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.CustomerRouteRateDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.CustomerRouteRate;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRateRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.RouteRepository;

@Service
public class CustomerRouteRateService implements CustomerRouteRateServiceImpl {

	@Autowired
	private CustomerRateRepository cusRateRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private ConvertUtil convert;
	
	
	@Override
	public boolean save(CustomerRouteRateDTO customerRouteRateDTO) {
		CustomerRouteRate customerRate = new CustomerRouteRate();
		Customer cus = customerRepository.findById(customerRouteRateDTO.getCustomerId()).get();
		Route route = routeRepository.findById(customerRouteRateDTO.getRouteId()).get();
		customerRate = convert.toCusRate(customerRouteRateDTO, cus, route);
		if (cusRateRepository.save(customerRate).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public CustomerRouteRateDTO createCustomerRate(CustomerRouteRateDTO customerRouteRateDTO) {
		return customerRouteRateDTO;
	}

	@Override
	public boolean updateCustomerRate(CustomerRouteRateDTO customerRouteRateDTO) {
		CustomerRouteRate customerRate = new CustomerRouteRate();
		Customer cus = customerRepository.findById(customerRouteRateDTO.getCustomerId()).get();
		Route route = routeRepository.findById(customerRouteRateDTO.getRouteId()).get();
		customerRate = convert.toCusRate(customerRouteRateDTO, cus, route);
		if (cusRateRepository.save(customerRate).getId() != null) {
			return true;
		}
		return false;
	}

}
