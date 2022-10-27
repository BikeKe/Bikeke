package fpt.edu.vn.service;

import java.util.List;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.CustomerDTO;

public interface CustomerServiceImpl {

	public boolean save(CustomerDTO customer);
	
	public CustomerDTO createCustomer(CustomerDTO customer);

	public boolean updateCustomer(CustomerDTO customer);

//	public List<AccountDTO> findAllAccounts();

	public boolean deleteCustomer(CustomerDTO customer);
}
