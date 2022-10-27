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
import fpt.edu.vn.DTO.WalletDTO;
import fpt.edu.vn.convert.ConvertUtil;
import fpt.edu.vn.entity.Account;
import fpt.edu.vn.entity.Customer;
import fpt.edu.vn.entity.Role;
import fpt.edu.vn.entity.Wallet;
import fpt.edu.vn.repository.AccountRepository;
import fpt.edu.vn.repository.RoleRepository;
import fpt.edu.vn.repository.WalletRepository;

@Service 
public class WalletService implements WalletServiceImpl{

	@Autowired
	private WalletRepository walletRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private ConvertUtil convert;

	@Override
	public boolean save(WalletDTO walletDTO) {
		Wallet wallet =  new Wallet();
		Account account = accountRepository.findById(walletDTO.getAccountId()).get();
		wallet = convert.toWallet(walletDTO, account);
		if(walletRepository.save(wallet).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public WalletDTO createWallet(WalletDTO walletDTO) {
		return walletDTO;
	}

	@Override
	public boolean updateWallet(WalletDTO walletDTO) {
		Wallet wallet =  new Wallet();
		Account account = accountRepository.findById(walletDTO.getAccountId()).get();
		wallet = convert.toWallet(walletDTO, account);
		if(walletRepository.save(wallet).getId() != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(WalletDTO walletDTO) {
		Wallet wallet =  new Wallet();
		Account account = accountRepository.findById(walletDTO.getAccountId()).get();
		wallet = convert.toWallet(walletDTO, account);
		wallet.setStatus("Inactive");
		if (walletRepository.save(wallet) != null) {
			return true;
		}
		return false;
	}

	

	


	
	
	


	
}
