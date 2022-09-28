package fpt.edu.vn.service;

import fpt.edu.vn.dto.AdminDTO;
import fpt.edu.vn.entity.Admin;
import fpt.edu.vn.enums.EnumAccountStatus;
import fpt.edu.vn.repository.AdminRepository;
import fpt.edu.vn.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements IAdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public AdminDTO findActiveByAccountId(Long accountId) {
        Admin admin = adminRepository.findByAccountIdStatus(accountId, EnumAccountStatus.ACTIVE.getStatus());
        if (admin != null) {
            return ConvertUtil.adminToAdminDTO(admin);
        }
        return null;
    }
}
