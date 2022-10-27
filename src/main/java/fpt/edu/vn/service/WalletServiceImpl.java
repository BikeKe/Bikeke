package fpt.edu.vn.service;

import java.util.List;

import fpt.edu.vn.DTO.AccountDTO;
import fpt.edu.vn.DTO.WalletDTO;
import fpt.edu.vn.entity.Role;

public interface WalletServiceImpl {

	public boolean save(WalletDTO walletDTO);
	
	public WalletDTO createWallet(WalletDTO walletDTO);

	public boolean updateWallet(WalletDTO walletDTO);
	
	public boolean delete(WalletDTO walletDTO);

}
