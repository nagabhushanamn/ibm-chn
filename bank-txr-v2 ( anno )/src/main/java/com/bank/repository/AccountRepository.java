package com.bank.repository;

import com.bank.model.Account;

public interface AccountRepository {

	Account findOne(String num);
	void save(Account account);

}
