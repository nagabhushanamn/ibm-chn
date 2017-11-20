package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.ServiceAConfig;

@SpringBootApplication
@RestController
public class SpringMicroServiceAApplication {

	@Autowired
	private ServiceAConfig config;

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServiceAApplication.class, args);
	}

	@GetMapping
	public String pringConfit() {
		return config.toString();
	}

}
