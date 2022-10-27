package fpt.edu.vn.service;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.CustomerDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.CustomerRepository;

@Service
public class CustomerService implements CustomerServiceImpl {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		Account account = accountRepository.findById(customerDTO.getAccountId()).get();
		customer = convert.toCustomer(customerDTO, account);
		if (customerRepository.save(customer) != null) {
			return true;
		}
		return false;
	}

	@Override
	public CustomerDTO createCustomer(CustomerDTO customer) {
		return customer;
	}

	@Override
	public boolean updateCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		Account account = accountRepository.findById(customerDTO.getAccountId()).get();
		customer = convert.toCustomer(customerDTO, account);
		if (customerRepository.save(customer) != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer();
		Account account = accountRepository.findById(customerDTO.getAccountId()).get();
		customer = convert.toCustomer(customerDTO, account);
		customer.setStatus("Inactive");
		if (customerRepository.save(customer) != null) {

			return true;
		}
		return false;

	}

}
