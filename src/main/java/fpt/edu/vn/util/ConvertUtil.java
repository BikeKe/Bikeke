package fpt.edu.vn.util;

import fpt.edu.vn.dto.AccountDTO;
import fpt.edu.vn.dto.AdminDTO;
import fpt.edu.vn.dto.CustomerDTO;
import fpt.edu.vn.dto.DriverDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Admin;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.Driver;
import fpt.edu.vn.enums.EnumAccountStatus;
import fpt.edu.vn.enums.EnumGender;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

public class ConvertUtil {
    public static Account accountDTOtoAccount(AccountDTO accountDTO) {
        if (accountDTO != null) {
            Long id = accountDTO.getId();
            String email = accountDTO.getEmail();
            String name = accountDTO.getName();
            String phone = accountDTO.getPhone();
            String img = accountDTO.getImg();
            String gender = accountDTO.getGender().getGender();

            return new Account(id, email, name, phone, img, gender, null);
        }
        return null;
    }

    public static AccountDTO accountToAccountDTO(Account account) {
        if (account != null) {
            Long id = account.getId();
            String email = account.getEmail();
            String name = account.getName();
            String phone = account.getPhone();
            String img = account.getImg();
            EnumGender gender = EnumGender.getGenderConst(account.getGender());
            Timestamp createdDate = account.getCreatedDate();

            return new AccountDTO(id, email, phone, name, gender, img, createdDate);
        }
        return null;
    }

    public static AdminDTO adminToAdminDTO(Admin admin) {
        if (admin != null) {
            Long id = admin.getId();
            boolean isSuper = admin.isSuper();
            EnumAccountStatus status = EnumAccountStatus.getStatusConst(admin.getStatus());
            return new AdminDTO(id, isSuper, status);
        }
        return null;
    }

    public static CustomerDTO customerToCustomerDTO(Customer customer) {
        if (customer != null) {
            Long id = customer.getId();
            EnumAccountStatus status = EnumAccountStatus.getStatusConst(customer.getStatus());
            return new CustomerDTO(id, status);
        }
        return null;
    }

    public static DriverDTO driverToDriverDTO(Driver driver) {
        if (driver != null) {
            Long id = driver.getId();
            EnumAccountStatus status = EnumAccountStatus.getStatusConst(driver.getStatus());
            return new DriverDTO(id, status);
        }
        return null;
    }
}
