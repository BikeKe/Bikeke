package fpt.edu.vn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.DriverDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;

import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.repository.AccountRepository;

import fpt.edu.vn.repository.DriverRepository;

@Service
public class DriverService implements DriverServiceImpl {

	@Autowired
	private DriverRepository driverRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(DriverDTO driverDTO) {
		Driver driver = new Driver();
		Account account = accountRepository.findById(driverDTO.getAccountId()).get();
		driver = convert.toDriver(driverDTO, account);
		if (driverRepository.save(driver) != null) {
			return true;
		}
		return false;
	}

	@Override
	public DriverDTO createDriver(DriverDTO driver) {
		return driver;
	}

	@Override
	public boolean updateDriver(DriverDTO driverDTO) {
		Driver driver = new Driver();
		Account account = accountRepository.findById(driverDTO.getAccountId()).get();
		driver = convert.toDriver(driverDTO, account);
		if (driverRepository.save(driver) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteDriver(DriverDTO driverDTO) {
		Driver driver = new Driver();
		Account account = accountRepository.findById(driverDTO.getAccountId()).get();
		driver = convert.toDriver(driverDTO, account);
		driver.setStatus("Inactive");
		driver = driverRepository.save(driver);
		if (driverRepository.save(driver) != null) {
			return true;
		}
		return false;

	}
}
