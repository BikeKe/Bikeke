package fpt.edu.vn.service;

import fpt.edu.vn.dto.AccountDTO;

public interface IAccountService {
    AccountDTO authenticate(String email, String password);
    Object authorize(Long accountId, String role);
    AccountDTO save(AccountDTO accountDTO);
}
