package com.bank;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bank.service.TxrService;

public class TxrApplication {

	public static void main(String[] args) {

		// init
		ConfigurableApplicationContext applicationContext = null;
		applicationContext = new ClassPathXmlApplicationContext("application-layer.xml");
		System.out.println("-----------------------------------------");

		// use
		TxrService txrService = applicationContext.getBean("txrService", TxrService.class);
		txrService.txr(100.00, "1", "2");

		System.out.println("-----------------------------------------");
		// destroy
		applicationContext.close();

	}

}
