package fpt.edu.vn.service;

import java.sql.Timestamp;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.RoleDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.RoleRepository;

@Service
public class AccountService implements AccountServiceImpl {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(AccountDTO accountDTO) {
		Account account = new Account();
		Role role = roleRepository.findById(accountDTO.getRoleId()).get();
		account = convert.toAccount(accountDTO, role);
		if (accountRepository.save(account).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public AccountDTO createAccount(AccountDTO account) {
		return account;
	}

	@Override
	public boolean updateAccount(AccountDTO accountDTO) {
		Account account = new Account();
		Role role = roleRepository.findById(accountDTO.getRoleId()).get();
		account = convert.toAccount(accountDTO, role);
		if (accountRepository.save(account).getId() != null) {
			return true;
		}
		return false;
	}

}
