package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.DTO.RouteSlotDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.entity.RouteSlot;
import fpt.edu.vn.repository.AccountRepository;

import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.repository.RouteSlotRepository;

@Service
public class RouteSlotService implements RouteSlotServiceImpl {

	@Autowired
	private RouteSlotRepository routeSlotRepository;

	@Autowired
	private RouteRepository routeRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(RouteSlotDTO routeSlotDTO) {
		RouteSlot routeSlot = new RouteSlot();
		Route route = routeRepository.findById(routeSlotDTO.getRouteId()).get();
		routeSlot = convert.toRouteSlot(routeSlotDTO, route);
		if (routeRepository.save(route) != null) {
			return true;
		}
		return false;
	}

	@Override
	public RouteSlotDTO createSlot(RouteSlotDTO routeSlot) {
		return routeSlot;
	}

	@Override
	public boolean updateSlot(RouteSlotDTO routeSlotDTO) {
		RouteSlot routeSlot = new RouteSlot();
		Route route = routeRepository.findById(routeSlotDTO.getRouteId()).get();
		routeSlot = convert.toRouteSlot(routeSlotDTO, route);
		if (routeRepository.save(route) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteSlot(RouteSlotDTO routeSlotDTO) {
		RouteSlot routeSlot = new RouteSlot();
		Route route = routeRepository.findById(routeSlotDTO.getRouteId()).get();
		routeSlot = convert.toRouteSlot(routeSlotDTO, route);
		routeSlotDTO.setStatus("Inactive");
		if (routeRepository.save(route) != null) {
			return true;
		}
		return false;

	}

}
