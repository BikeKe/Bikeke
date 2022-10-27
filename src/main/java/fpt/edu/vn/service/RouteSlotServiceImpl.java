package fpt.edu.vn.service;

import java.util.List;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.RouteSlotDTO;

public interface RouteSlotServiceImpl {

	public boolean save(RouteSlotDTO routeSlot);
	public RouteSlotDTO createSlot(RouteSlotDTO routeSlot);
	public boolean updateSlot(RouteSlotDTO routeSlot);
	public boolean deleteSlot(RouteSlotDTO routeSlot);
}
