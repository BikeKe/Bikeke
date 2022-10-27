package fpt.edu.vn.service;

import java.util.List;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.RouteSlotDTO;
import fpt.edu.vn.DTO.RouteStationDTO;
import fpt.edu.vn.entity.RouteStation;

public interface RouteStationServiceImpl {

	public boolean save(RouteStationDTO routeStationDTO);
	public RouteStationDTO create(RouteStationDTO routeStationDTO);
	public boolean updateRouteStation(RouteStationDTO routeStationDTO);
	public boolean deleteRouteStation(RouteStationDTO routeStationDTO);
}
