package fpt.edu.vn.service;

import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.DTO.StationDTO;

public interface StationServiceImpl {

	public boolean save(StationDTO station);

	public StationDTO createSation(StationDTO stationDTO);

	public boolean updateStation(StationDTO stationDTO);

	public boolean deleteStation(StationDTO stationDTO);
}
