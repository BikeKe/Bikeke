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
import fpt.edu.vn.DTO.TripStateDTO;
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
import fpt.edu.vn.entity.TripState;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.repository.CustomerTripRepository;
import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.DriverTripRepository;
import fpt.edu.vn.repository.RoleRepository;
import fpt.edu.vn.repository.TripRepository;
import fpt.edu.vn.repository.TripStateRepository;

@Service
public class TripStateService implements TripStateServiceImpl {

	@Autowired
	private TripStateRepository tripStateRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private TripRepository tripRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(TripStateDTO tripStateDTO) {
		TripState tripState = new TripState();
		Account a = accountRepository.findById(tripStateDTO.getAccountId()).get();
		Trip trip = tripRepository.findById(tripStateDTO.getTripId()).get();
		tripState = convert.toTrip(tripStateDTO, trip, a);
		if (tripStateRepository.save(tripState).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public TripStateDTO createTripState(TripStateDTO tripStateDTO) {
		return tripStateDTO;
	}

	@Override
	public boolean updateTripState(TripStateDTO tripStateDTO) {
		TripState tripState = new TripState();
		Account a = accountRepository.findById(tripStateDTO.getAccountId()).get();
		Trip trip = tripRepository.findById(tripStateDTO.getTripId()).get();
		tripState = convert.toTrip(tripStateDTO, trip, a);
		if (tripStateRepository.save(tripState).getId() != null) {
			return true;
		}
		return false;
	}

//	@Override
//	public boolean deleteTripState(TripStateDTO tripStateDTO) {
//		TripState tripState = new TripState();
//		Account a = accountRepository.findById(tripStateDTO.getAccountId()).get();
//		Trip trip = tripRepository.findById(tripStateDTO.getTripId()).get();
//		tripState = convert.toTrip(tripStateDTO, trip, a);
//		if (tripStateRepository.save(tripState) != null) {
//			return true;
//		}
//		return false;
//	}

}
