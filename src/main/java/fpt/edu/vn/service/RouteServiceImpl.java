package fpt.edu.vn.service;

import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.DTO.RouteDTO;

public interface RouteServiceImpl {

	public boolean save(RouteDTO route);

	public RouteDTO createRoute(RouteDTO route);

	public boolean updateRoute(RouteDTO route);

	public boolean deleteRoute(RouteDTO route);
}
