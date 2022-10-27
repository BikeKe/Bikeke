package fpt.edu.vn.service;

import fpt.edu.vn.DTO.CustomerRouteRateDTO;
import fpt.edu.vn.DTO.DriverRouteRateDTO;

public interface DriverRouteRateServiceImpl {

	public boolean save(DriverRouteRateDTO driverRouteRateDTO);

	public DriverRouteRateDTO createDriverrRate(DriverRouteRateDTO driverRouteRateDTO);

	public boolean updateDriverRate(DriverRouteRateDTO driverRouteRateDTO);

}
