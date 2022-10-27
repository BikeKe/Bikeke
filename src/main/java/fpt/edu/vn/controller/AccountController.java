package fpt.edu.vn.controller;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.service.AccountService;
import fpt.edu.vn.service.AccountServiceImpl;




@RestController
@RequestMapping("/account")
public class AccountController {	
	
	
	@Autowired
	private AccountServiceImpl accountService;
	
	@Autowired
	private AccountRepository accountRepository;


	@GetMapping("")
	public List<Account> view() {
		return accountRepository.findAll();
	}
	
	@PostMapping("")
	public boolean createAccount(@RequestBody AccountDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return accountService.save(model);
		
	}
	
	@PutMapping("")
	public boolean updateAccount(@RequestBody AccountDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return accountService.updateAccount(model);
	}
	
//	@DeleteMapping("/delete-account")
//	public void deleteAccount(@RequestBody AccountDTO model) {
//		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
//		return accountService.updateAccount(model);
//	}
}
