package fpt.edu.vn.service;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.annotation.JsonBackReference;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.CustomerTripDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.CustomerTrip;
import fpt.edu.vn.entity.PaymentMethod;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.entity.RouteSlot;
import fpt.edu.vn.entity.Station;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.CustomerTripRepository;
import fpt.edu.vn.repository.PaymentMethodRepository;
import fpt.edu.vn.repository.RouteSlotRepository;
import fpt.edu.vn.repository.StationRepository;

@Service
public class CustomerTripService implements CustomerTripServiceImpl {

	@Autowired
	private CustomerTripRepository cusTripRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private RouteSlotRepository routeSlotRepository;

	@Autowired
	private StationRepository stationRepository;

	@Autowired
	private PaymentMethodRepository payRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(CustomerTripDTO customertripDTO) {
		CustomerTrip customerTrip = new CustomerTrip();
		Customer cus = customerRepository.findById(customertripDTO.getCustomerId()).get();
		RouteSlot route = routeSlotRepository.findById(customertripDTO.getRouteSlotId()).get();
		Station pickupStation = stationRepository.findById(customertripDTO.getPickupStationId()).get();
		Station headtostation = stationRepository.findById(customertripDTO.getHeadtoStationId()).get();
		PaymentMethod pay = payRepository.findById(customertripDTO.getPaymentMethodId()).get();
		customerTrip = convert.toCusTrip(customertripDTO, cus, route, headtostation, pay);
		if (cusTripRepository.save(customerTrip).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public CustomerTripDTO create(CustomerTripDTO customertripDTO) {
		return customertripDTO;
	}

	@Override
	public boolean update(CustomerTripDTO customertripDTO) {
		CustomerTrip customerTrip = new CustomerTrip();
		Customer cus = customerRepository.findById(customertripDTO.getCustomerId()).get();
		RouteSlot route = routeSlotRepository.findById(customertripDTO.getRouteSlotId()).get();
		Station pickupStation = stationRepository.findById(customertripDTO.getPickupStationId()).get();
		Station headtostation = stationRepository.findById(customertripDTO.getHeadtoStationId()).get();
		PaymentMethod pay = payRepository.findById(customertripDTO.getPaymentMethodId()).get();
		customerTrip = convert.toCusTrip(customertripDTO, cus, route, headtostation, pay);
		if (cusTripRepository.save(customerTrip).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(CustomerTripDTO customertripDTO) {
		CustomerTrip customerTrip = new CustomerTrip();
		Customer cus = customerRepository.findById(customertripDTO.getCustomerId()).get();
		RouteSlot route = routeSlotRepository.findById(customertripDTO.getRouteSlotId()).get();
		Station pickupStation = stationRepository.findById(customertripDTO.getPickupStationId()).get();
		Station headtostation = stationRepository.findById(customertripDTO.getHeadtoStationId()).get();
		PaymentMethod pay = payRepository.findById(customertripDTO.getPaymentMethodId()).get();
		customerTrip = convert.toCusTrip(customertripDTO, cus, route, headtostation, pay);
		customerTrip.setStatus("Inactive!");
		if (cusTripRepository.save(customerTrip) != null) {
			return true;
		}
		return false;
	}

}
