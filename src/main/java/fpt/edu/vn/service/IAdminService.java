package fpt.edu.vn.service;

import fpt.edu.vn.dto.AdminDTO;

public interface IAdminService {
    AdminDTO findActiveByAccountId(Long accountId);
}
