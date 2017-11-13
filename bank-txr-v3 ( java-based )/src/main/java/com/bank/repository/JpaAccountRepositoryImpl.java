package com.bank.repository;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

//@Component
//@Repository
public class JpaAccountRepositoryImpl implements AccountRepository {

	private Logger logger = Logger.getLogger("bank-Txr");

	public JpaAccountRepositoryImpl() {
		logger.info("AccountRepository created");
	}

	public Account findOne(String num) {
		return null;
	}

	public void save(Account account) {

	}

}
