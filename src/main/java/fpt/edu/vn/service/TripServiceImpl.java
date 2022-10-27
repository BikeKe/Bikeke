package fpt.edu.vn.service;

import fpt.edu.vn.DTO.TripDTO;

public interface TripServiceImpl {

	public boolean save(TripDTO tripDTO);

	public TripDTO createTrip(TripDTO tripDTO);

	public boolean updateTrip(TripDTO tripDTO);

	public boolean deleteTrip(TripDTO tripDTO);
}
