package fpt.edu.vn.service;

import fpt.edu.vn.dto.CustomerDTO;

public interface ICustomerService {
    CustomerDTO findActiveByAccountId(Long accountId);
}
