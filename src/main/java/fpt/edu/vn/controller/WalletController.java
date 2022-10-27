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
import fpt.edu.vn.DTO.WalletDTO;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Wallet;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.WalletRepository;
import fpt.edu.vn.service.AccountService;
import fpt.edu.vn.service.AccountServiceImpl;
import fpt.edu.vn.service.WalletServiceImpl;

@RestController
@RequestMapping("/wallet")
public class WalletController {

	@Autowired
	private WalletServiceImpl walletService;

	@Autowired
	private WalletRepository walletRepository;

	@GetMapping("")
	public List<Wallet> view() {
		return walletRepository.findAll();
	}

	@PostMapping("")
	public boolean createWallet(@RequestBody WalletDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return walletService.save(model);

	}

	@PutMapping("")
	public boolean updateWallet(@RequestBody WalletDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return walletService.updateWallet(model);
	}

	@DeleteMapping("")
	public boolean deleteWallet(@RequestBody WalletDTO model) {
		model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
		return walletService.delete(model);
	}
}
