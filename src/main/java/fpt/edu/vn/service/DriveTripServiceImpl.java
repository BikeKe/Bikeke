package fpt.edu.vn.service;

import fpt.edu.vn.DTO.DriverTripDTO;

public interface DriveTripServiceImpl {

	public boolean save(DriverTripDTO driverDTO);

	public DriverTripDTO createDriverTrip(DriverTripDTO driverDTO);

	public boolean updateDriverTrip(DriverTripDTO driverDTO);

	public boolean deleteDriverTrip(DriverTripDTO driverDTO);

}
