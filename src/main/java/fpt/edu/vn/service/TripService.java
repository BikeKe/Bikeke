package fpt.edu.vn.service;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.RoleDTO;
import fpt.edu.vn.DTO.TripDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.CustomerTrip;
import fpt.edu.vn.entity.DriverTrip;
import fpt.edu.vn.entity.PaymentMethod;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.entity.RouteSlot;
import fpt.edu.vn.entity.Station;
import fpt.edu.vn.entity.Trip;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.CustomerTripRepository;
import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.DriverTripRepository;
import fpt.edu.vn.repository.RoleRepository;
import fpt.edu.vn.repository.TripRepository;

@Service 
public class TripService implements TripServiceImpl{

	@Autowired
	private TripRepository tripRepository;
	
	@Autowired
	private CustomerTripRepository customerTripRepository;
	
	@Autowired
	private DriverTripRepository driverTripRepository;
	
	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(TripDTO tripDTO) {
		Trip trip = new Trip();
		CustomerTrip cus = customerTripRepository.findById(tripDTO.getCustomerTripId()).get();
		DriverTrip driver = driverTripRepository.findById(tripDTO.getDriverTripId()).get();
		trip = convert.toTrip(tripDTO, cus, driver);
		if (tripRepository.save(trip).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public TripDTO createTrip(TripDTO tripDTO) {
		return tripDTO;
	}

	@Override
	public boolean updateTrip(TripDTO tripDTO) {
		Trip trip = new Trip();
		CustomerTrip cus = customerTripRepository.findById(tripDTO.getCustomerTripId()).get();
		DriverTrip driver = driverTripRepository.findById(tripDTO.getDriverTripId()).get();
		trip = convert.toTrip(tripDTO, cus, driver);
		if (tripRepository.save(trip).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteTrip(TripDTO tripDTO) {
		Trip trip = new Trip();
		CustomerTrip cus = customerTripRepository.findById(tripDTO.getCustomerTripId()).get();
		DriverTrip driver = driverTripRepository.findById(tripDTO.getDriverTripId()).get();
		trip = convert.toTrip(tripDTO, cus, driver);
		trip.setStatus("Inactive");
		if (tripRepository.save(trip) != null) {
			return true;
		}
		return false;
	}

	
	


	
}
