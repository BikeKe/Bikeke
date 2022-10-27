package fpt.edu.vn.service;

import java.util.List;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.entity.Role;

public interface AccountServiceImpl {

	public boolean save(AccountDTO account);
	
	public AccountDTO createAccount(AccountDTO account);

	public boolean updateAccount(AccountDTO account);

}
