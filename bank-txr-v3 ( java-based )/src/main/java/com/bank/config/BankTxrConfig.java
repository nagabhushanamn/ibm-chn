package com.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bank.repository.AccountRepository;
import com.bank.repository.JpaAccountRepositoryImpl;
import com.bank.service.TxrService;
import com.bank.service.TxrServiceImpl;

@Configuration
@ComponentScan(basePackages = { "com.bank" })
public class BankTxrConfig {

	@Bean
	public TxrService txrService() {
		TxrService service = new TxrServiceImpl(accRepo());
		return service;
	}

	@Bean(name = "accRepo")
	public AccountRepository accRepo() {
		JpaAccountRepositoryImpl accountRepository = new JpaAccountRepositoryImpl();
		return accountRepository;
	}

}
