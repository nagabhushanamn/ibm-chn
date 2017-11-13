package com.bank.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
public class JpaAccountRepositoryImpl implements AccountRepository {

	@PersistenceContext
	private EntityManager em;

	public Account findOne(String num) {
		return em.find(Account.class, num);
	}

	public void update(Account account) {
		em.merge(account);
	}

}
