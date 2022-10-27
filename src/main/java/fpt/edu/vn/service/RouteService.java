package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;

import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.repository.AccountRepository;

import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.RouteRepository;

@Service
public class RouteService implements RouteServiceImpl {

	@Autowired
	private RouteRepository routeRepository;


	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(RouteDTO routeDTO) {
		Route route = new Route();
		route = convert.toRoute(routeDTO);
		if (routeRepository.save(route) != null) {
			return true;
		}
		return false;
	}

	@Override
	public RouteDTO createRoute(RouteDTO route) {
		return route;
	}

	@Override
	public boolean updateRoute(RouteDTO routeDTO) {
		Route route = new Route();
		route = convert.toRoute(routeDTO);
		if (routeRepository.save(route) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteRoute(RouteDTO routeDTO) {
		Route route = new Route();
		route = convert.toRoute(routeDTO);
		route.setStatus("Inactive");
		route = routeRepository.save(route);
		if (routeRepository.save(route) != null) {
			return true;
		}
		return false;
	}
}
