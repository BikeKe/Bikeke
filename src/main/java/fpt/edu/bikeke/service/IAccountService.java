package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.AccountDto;
import fpt.edu.bikeke.page.PageAccount;
import fpt.edu.bikeke.entity.Account;

public interface IAccountService {
    Boolean exist(String email);
    Boolean create(AccountDto accountDto);
    AccountDto getAccountDtoByEmail(String email);
    Account getAccountByEmail(String email);
    PageAccount findAllbyRole(Long roleId, int page);
}
