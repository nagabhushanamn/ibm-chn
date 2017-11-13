package com.bank;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bank.service.TxrService;

@SpringBootApplication
public class TxrApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxrApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(TxrService txrService) {
		return args -> {
			boolean b=txrService.txr(1000.00, "2", "1");
			System.out.println(b?"Txr success":"Txr Failed");
		};
	}

}
