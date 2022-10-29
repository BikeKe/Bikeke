package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.AccountDto;
import fpt.edu.bikeke.dto.PageAccount;
import fpt.edu.bikeke.entity.Account;

import java.util.List;

public interface IAccountService {
    Boolean exist(String email);
    Boolean create(AccountDto accountDto);
    AccountDto getAccountDtoByEmail(String email);
    Account getAccountByEmail(String email);
    PageAccount findAllbyRole(Long roleId, int page);
}
