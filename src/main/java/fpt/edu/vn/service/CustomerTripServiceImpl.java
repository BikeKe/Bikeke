	package fpt.edu.vn.service;

import fpt.edu.vn.DTO.CustomerTripDTO;

public interface CustomerTripServiceImpl {

	public boolean save(CustomerTripDTO customertripDTO);

	public CustomerTripDTO create(CustomerTripDTO customertripDTO);

	public boolean update(CustomerTripDTO customertripDTO);

	public boolean delete(CustomerTripDTO customertripDTO);
}
