package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bank.model.Account;
import com.bank.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	@Autowired
	private AccountRepository accountRepository;

	@Transactional
	public boolean txr(double amount, String fromAccNum, String toAccNum) {

		// Load from & to accounts
		Account fromAccount = accountRepository.findOne(fromAccNum);
		Account toAccount = accountRepository.findOne(toAccNum);

		// debit & credit
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);

		// update accounts
		accountRepository.update(fromAccount);
		accountRepository.update(toAccount);

		return true;
	}

}
