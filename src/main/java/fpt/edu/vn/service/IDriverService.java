package fpt.edu.vn.service;

import fpt.edu.vn.dto.DriverDTO;

public interface IDriverService {
    DriverDTO findActiveByAccountId(Long accountId);
}
