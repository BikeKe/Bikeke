package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.AccountDto;
import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Role;
import fpt.edu.bikeke.repository.AccountRepository;
import fpt.edu.bikeke.repository.RoleRepostiory;
import fpt.edu.bikeke.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements IAccountService{
    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private RoleRepostiory roleRepostiory;

    @Override
    public Boolean exist(String email) {
        return accountRepository.existsAccountByEmail(email);
    }

    @Override
    public Boolean create(AccountDto accountDto) {
        Role role = roleRepostiory.findById(accountDto.getRoleId()).get();
        Account account = MappingUtils.toAccount(accountDto, role);
        if(accountRepository.save(account) != null){
            return true;
        }
        return false;
    }

    @Override
    public AccountDto getByEmail(String email) {
        return null;
    }
}
