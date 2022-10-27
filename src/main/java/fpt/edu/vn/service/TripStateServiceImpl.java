package fpt.edu.vn.service;

import fpt.edu.vn.DTO.TripStateDTO;

public interface TripStateServiceImpl {

	public boolean save(TripStateDTO tripStateDTO);

	public TripStateDTO createTripState(TripStateDTO tripStateDTO);

	public boolean updateTripState(TripStateDTO tripStateDTO);

//	public boolean deleteTripState(TripStateDTO tripStateDTO);
}
