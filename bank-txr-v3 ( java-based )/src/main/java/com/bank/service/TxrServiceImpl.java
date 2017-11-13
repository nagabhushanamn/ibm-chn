package com.bank.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

//@Component("txrService")
// @Service("txrService")
public class TxrServiceImpl implements TxrService {
	
	private Logger logger=Logger.getLogger("bank-Txr");
	
	
	private AccountRepository accountRepository;
	
	@Autowired
	public TxrServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
		logger.info("TxrService created");
	}

	public boolean txr(double amount, String fromAccNum, String toAccNum) {
//
//		// Load from & to accounts
//		Account fromAccount = accountRepository.findOne(fromAccNum);
//		Account toAccount = accountRepository.findOne(toAccNum);
//
//		// debit & credit
//		fromAccount.setBalance(fromAccount.getBalance() - amount);
//		toAccount.setBalance(toAccount.getBalance() + amount);
//
//		// update accounts
//		accountRepository.save(fromAccount);
//		accountRepository.save(toAccount);

		return true;
	}

}
