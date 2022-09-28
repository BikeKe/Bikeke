package fpt.edu.vn.service;

import fpt.edu.vn.dto.DriverDTO;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.enums.EnumAccountStatus;
import fpt.edu.vn.repository.DriverRepository;
import fpt.edu.vn.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService implements IDriverService{
    @Autowired
    private DriverRepository driverRepository;

    @Override
    public DriverDTO findActiveByAccountId(Long accountId) {
        Driver driver = driverRepository.findByAccountIdStatus(accountId, EnumAccountStatus.ACTIVE.getStatus());
        if (driver != null){
            return ConvertUtil.driverToDriverDTO(driver);
        }
        return null;
    }
}
