package fpt.edu.vn.service;

import fpt.edu.vn.dto.CustomerDTO;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.enums.EnumAccountStatus;
import fpt.edu.vn.repository.CustomerRepository;
import fpt.edu.vn.util.ConvertUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerDTO findActiveByAccountId(Long accountId) {
        Customer customer = customerRepository.findByAccountIdStatus(accountId, EnumAccountStatus.ACTIVE.getStatus());
        if (customer != null) {
            return ConvertUtil.customerToCustomerDTO(customer);
        }
        return null;
    }
}
