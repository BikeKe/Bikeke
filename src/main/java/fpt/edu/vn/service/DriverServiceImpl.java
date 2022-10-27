package fpt.edu.vn.service;

import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.DTO.DriverDTO;

public interface DriverServiceImpl {

	public boolean save(DriverDTO driver);

	public DriverDTO createDriver(DriverDTO driver);

	public boolean updateDriver(DriverDTO driver);

	public boolean deleteDriver(DriverDTO driver);
}
