package fpt.edu.vn.service;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.DriverTripDTO;
import fpt.edu.vn.DTO.RoleDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.DriverTrip;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.entity.RouteSlot;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.DriverTripRepository;
import fpt.edu.vn.repository.RoleRepository;
import fpt.edu.vn.repository.RouteSlotRepository;

@Service 
public class DriverTripService implements DriveTripServiceImpl{

	@Autowired
	private DriverTripRepository driverTripRepository;
	
	@Autowired
	private RouteSlotRepository routeSlotRepository;
	
	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(DriverTripDTO driverDTO) {
		DriverTrip dt =  new DriverTrip();
		RouteSlot rt = routeSlotRepository.findById(driverDTO.getRouteSlotId()).get();
		dt = convert.toDriverTrip(driverDTO, rt);
		if(driverTripRepository.save(dt).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public DriverTripDTO createDriverTrip(DriverTripDTO driverDTO) {
		return driverDTO;
	}

	@Override
	public boolean updateDriverTrip(DriverTripDTO driverDTO) {
		DriverTrip dt =  new DriverTrip();
		RouteSlot rt = routeSlotRepository.findById(driverDTO.getRouteSlotId()).get();
		dt = convert.toDriverTrip(driverDTO, rt);
		if(driverTripRepository.save(dt).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteDriverTrip(DriverTripDTO driverDTO) {
		DriverTrip dt =  new DriverTrip();
		RouteSlot rt = routeSlotRepository.findById(driverDTO.getRouteSlotId()).get();
		dt = convert.toDriverTrip(driverDTO, rt);
		dt.setStatus("Inactive");
		if(driverTripRepository.save(dt) != null) {
			return true;
		}
		return false;
	}

	
}
