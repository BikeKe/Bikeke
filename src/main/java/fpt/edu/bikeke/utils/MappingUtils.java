package fpt.edu.bikeke.utils;

import fpt.edu.bikeke.dto.AccountDto;
import fpt.edu.bikeke.dto.CustomerDto;
import fpt.edu.bikeke.dto.RoleDto;
import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Customer;
import fpt.edu.bikeke.entity.Role;
import fpt.edu.bikeke.repository.RoleRepostiory;
import fpt.edu.bikeke.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MappingUtils {

    public static RoleDto toRoleDto(Role role) {
        if (role != null) {
            RoleDto roleDto = new RoleDto();
            roleDto.setId(role.getId());
            roleDto.setName(role.getName());
            roleDto.setStatus(role.getStatus());
            return roleDto;
        }
        return null;
    }

    public static Account toAccount(AccountDto accountDto, Role role) {
        Account account = new Account();
        account.setId(accountDto.getId());
        account.setEmail(accountDto.getEmail());
        account.setPassword(accountDto.getPassword());
        account.setPhone(accountDto.getPhone());
        account.setGender(accountDto.getGender());
        account.setImg(accountDto.getImg());
        account.setCreatedDate(accountDto.getCreatedDate());
        account.setStatus(accountDto.getStatus());
        account.setGender(accountDto.getGender());
        account.setRole(role);
        return account;
    }

    public static AccountDto toAccountDto(Account account){
        if(account != null){
            AccountDto accountDto = new AccountDto();
            accountDto.setId(account.getId());
            accountDto.setEmail(account.getEmail());
            accountDto.setPassword(account.getPassword());
            accountDto.setPhone(account.getPhone());
            accountDto.setRoleId(account.getRole().getId());
            accountDto.setImg(account.getImg());
            accountDto.setGender(account.getGender());
            accountDto.setName(account.getName());
            accountDto.setCreatedDate(account.getCreatedDate());
            accountDto.setStatus(account.getStatus());

            return accountDto;
        }
        return null;
    }

    public static Customer toCustomer(CustomerDto customerDto, Account account){
        if(customerDto != null){
            Customer customer = new Customer();
            customer.setId(customerDto.getId());
            customer.setAccount(account);
            customer.setTotalTrip(customer.getTotalTrip());

            return customer;
        }
        return null;
    }
}
