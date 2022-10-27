package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.DriverRouteRateDTO;
import fpt.edu.vn.convert.ConvertUtil;

import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.entity.DriverRouteRate;
import fpt.edu.vn.entity.Route;

import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.DriverrRateRepository;
import fpt.edu.vn.repository.RouteRepository;

@Service
public class DriverRouteRateService implements DriverRouteRateServiceImpl {

	@Autowired
	private DriverrRateRepository driverRateRepository;

	@Autowired
	private DriverRepository driverRepository;

	@Autowired
	private RouteRepository routeRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(DriverRouteRateDTO driverRouteRateDTO) {
		DriverRouteRate driverRate = new DriverRouteRate();
		Driver driver = driverRepository.findById(driverRouteRateDTO.getDriverId()).get();
		Route route = routeRepository.findById(driverRouteRateDTO.getRouteId()).get();
		driverRate = convert.toDriverRate(driverRouteRateDTO, driver, route);
		if (driverRateRepository.save(driverRate).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public DriverRouteRateDTO createDriverrRate(DriverRouteRateDTO driverRouteRateDTO) {
		return driverRouteRateDTO;
	}

	@Override
	public boolean updateDriverRate(DriverRouteRateDTO driverRouteRateDTO) {
		DriverRouteRate driverRate = new DriverRouteRate();
		Driver driver = driverRepository.findById(driverRouteRateDTO.getDriverId()).get();
		Route route = routeRepository.findById(driverRouteRateDTO.getRouteId()).get();
		driverRate = convert.toDriverRate(driverRouteRateDTO, driver, route);
		if (driverRateRepository.save(driverRate).getId() != null) {
			return true;
		}
		return false;
	}

}
