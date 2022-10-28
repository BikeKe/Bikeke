package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.AccountDto;

public interface IAccountService {
    Boolean exist(String email);
    Boolean create(AccountDto accountDto);
    AccountDto getByEmail(String email);
}
