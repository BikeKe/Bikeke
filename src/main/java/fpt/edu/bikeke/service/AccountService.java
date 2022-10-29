package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.AccountDto;
import fpt.edu.bikeke.dto.PageAccount;
import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Role;
import fpt.edu.bikeke.repository.AccountRepository;
import fpt.edu.bikeke.repository.RoleRepostiory;
import fpt.edu.bikeke.utils.MappingUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {
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
        if (accountRepository.save(account) != null) {
            return true;
        }
        return false;
    }

    @Override
    public AccountDto getAccountDtoByEmail(String email) {
        Optional<Account> accountOptional = accountRepository.findAccountByEmail(email);
        if (accountOptional.get() != null) {
            return MappingUtils.toAccountDto(accountOptional.get());
        }
        return null;
    }

    @Override
    public Account getAccountByEmail(String email) {
        Optional<Account> accountOptional = accountRepository.findAccountByEmail(email);
        return accountOptional.orElse(null);
    }

    @Override
    public PageAccount findAllbyRole(Long roleId, int page) {
        Role role = roleRepostiory.findById(roleId).get();
        Page<Account> pageAccount = accountRepository.findAllByRole(role, PageRequest.of(page, 10));
//        List<Account> accountList = accountRepository.findAllByRole(role, PageRequest.of(page, 10));
        if (pageAccount.getContent() != null) {
            List<AccountDto> accountDtoList = new ArrayList<>();
            for (Account account : pageAccount.getContent()) {
                accountDtoList.add(MappingUtils.toAccountDto(account));
            }
            return new PageAccount(pageAccount.getSize(), pageAccount.getTotalElements(), pageAccount.getTotalPages(), accountDtoList);
        }
        return null;
    }
}
