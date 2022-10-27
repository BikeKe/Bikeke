package fpt.edu.vn.service;

import fpt.edu.vn.DTO.CustomerRouteRateDTO;

public interface CustomerRouteRateServiceImpl {

	public boolean save(CustomerRouteRateDTO customerRouteRateDTO);

	public CustomerRouteRateDTO createCustomerRate(CustomerRouteRateDTO customerRouteRateDTO);

	public boolean updateCustomerRate(CustomerRouteRateDTO customerRouteRateDTO);

}
