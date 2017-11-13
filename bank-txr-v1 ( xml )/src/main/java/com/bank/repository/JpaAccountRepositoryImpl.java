package com.bank.repository;

import org.apache.log4j.Logger;

import com.bank.model.Account;

public class JpaAccountRepositoryImpl implements AccountRepository {

	private Logger logger=Logger.getLogger("bank-Txr");
		
	public JpaAccountRepositoryImpl() {
		logger.info("AccountRepository created");
	}
	
	public Account findOne(String num) {
		return null;
	}

	public void save(Account account) {
		
	}

}
