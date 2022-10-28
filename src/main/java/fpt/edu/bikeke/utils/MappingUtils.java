package fpt.edu.bikeke.utils;

import fpt.edu.bikeke.dto.AccountDto;
import fpt.edu.bikeke.dto.RoleDto;
import fpt.edu.bikeke.entity.Account;
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
}
