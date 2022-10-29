package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.CustomerDto;
import fpt.edu.bikeke.entity.Account;

public interface ICustomerService {
    Boolean create(Account account);
    CustomerDto findById(Long id);
    CustomerDto findByAccountId(Long accountId);
}
