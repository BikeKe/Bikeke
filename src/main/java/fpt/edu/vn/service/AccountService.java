package fpt.edu.vn.service;

import fpt.edu.vn.dto.AccountDTO;
import fpt.edu.vn.dto.AdminDTO;
import fpt.edu.vn.dto.CustomerDTO;
import fpt.edu.vn.dto.DriverDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.enums.EnumGender;
import fpt.edu.vn.enums.EnumRole;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private IAdminService adminService;

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IDriverService driverService;

    @Override
    public AccountDTO authenticate(String email, String password) {
        Account account = accountRepository.findByEmailPassword(email, password);
        if (account != null) {
            return ConvertUtil.accountToAccountDTO(account);
        }
        return null;
    }

    @Override
    public Object authorize(Long accountId, String role) {
        switch (EnumRole.getRoleConst(role)) {
            case ADMIN:
                AdminDTO adminDTO = adminService.findActiveByAccountId(accountId);
                if (adminDTO != null) {
                    return adminDTO;
                }
                break;
            case CUSTOMER:
                CustomerDTO customerDTO = customerService.findActiveByAccountId(accountId);
                if (customerDTO != null) {
                    return customerDTO;
                }
                break;
            case DRIVER:
                DriverDTO driverDTO = driverService.findActiveByAccountId(accountId);
                if (driverDTO != null) {
                    return driverDTO;
                }
                break;
        }
        return null;
    }

    @Override
    public AccountDTO save(AccountDTO accountDTO) {
        if(accountDTO != null){
            Account account = ConvertUtil.accountDTOtoAccount(accountDTO);
            return ConvertUtil.accountToAccountDTO(accountRepository.save(account));
        }
        return null;
    }
}
