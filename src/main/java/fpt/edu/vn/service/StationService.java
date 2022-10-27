package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.DTO.RouteDTO;
import fpt.edu.vn.DTO.StationDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.BikeBrand;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.entity.Route;
import fpt.edu.vn.entity.Station;
import fpt.edu.vn.repository.AccountRepository;

import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.repository.RouteRepository;
import fpt.edu.vn.repository.StationRepository;

@Service
public class StationService implements StationServiceImpl {

	@Autowired
	private StationRepository stationRepository;

	
	@Autowired
	private ConvertUtil convert;


	@Override
	public boolean save(StationDTO stationDTO) {
		Station station = new Station();
		station = convert.toStation(stationDTO);
		if (stationRepository.save(station) != null) {
			return true;
		}
		return false;
	}


	@Override
	public StationDTO createSation(StationDTO stationDTO) {
		return stationDTO;
	}


	@Override
	public boolean updateStation(StationDTO stationDTO) {
		Station station = new Station();
		station = convert.toStation(stationDTO);
		if (stationRepository.save(station) != null) {
			return true;
		}
		return false;
	}


	@Override
	public boolean deleteStation(StationDTO stationDTO) {
		Station station = new Station();
		station = convert.toStation(stationDTO);
		station.setStatus("Inactive");
		station = stationRepository.save(station);
		if (stationRepository.save(station) != null) {
			return true;
		}
		return false;
	}

	
}
