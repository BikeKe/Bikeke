package fpt.edu.bikeke.service;

import fpt.edu.bikeke.dto.CustomerDto;
import fpt.edu.bikeke.entity.Account;
import fpt.edu.bikeke.entity.Customer;
import fpt.edu.bikeke.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Boolean create(Account account) {
        Customer customer = new Customer();
        customer.setAccount(account);
        customer.setTotalTrip(0);
        if (customerRepository.save(customer) != null)
            return true;
        return false;
    }

    @Override
    public CustomerDto findById(Long id) {
        return null;
    }

    @Override
    public CustomerDto findByAccountId(Long accountId) {
        return null;
    }
}
