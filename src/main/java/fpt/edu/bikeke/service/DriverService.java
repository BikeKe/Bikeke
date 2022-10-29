package fpt.edu.bikeke.service;

import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Driver;
import fpt.edu.bikeke.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService implements IDriverService {
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public Boolean create(Account account) {
        Driver driver = new Driver();
        driver.setAccount(account);
        if (driverRepository.save(driver) != null)
            return true;
        return null;
    }
}
