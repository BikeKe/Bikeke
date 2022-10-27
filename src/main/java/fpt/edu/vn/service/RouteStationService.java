package fpt.edu.vn.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.RouteStationDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.repository.RouteRepository;

import fpt.edu.vn.repository.RouteStationRepository;
import fpt.edu.vn.repository.StationRepository;

@Service
public class RouteStationService implements RouteStationServiceImpl {

	@Autowired
	private RouteStationRepository routeStationRepository;

	@Autowired
	private RouteRepository routeRepository;
	
	@Autowired
	private StationRepository stationRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(RouteStationDTO routeStationDTO) {
//		RouteStation routeStation = new RouteStation();
//		Route route = routeRepository.findById(routeStationDTO.getRouteId()).get();
//		Station station = stationRepository.findById(routeStationDTO.getStationId()).get();
//		routeStation = convert.toRouteStation(routeStationDTO, route, station);
//		if (routeStationRepository.save(route) != null || routeStationRepository.save(station) != null) {
//			return true;
//		}
		return false;
	}

	@Override
	public RouteStationDTO create(RouteStationDTO routeStationDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRouteStation(RouteStationDTO routeStationDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteRouteStation(RouteStationDTO routeStationDTO) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
