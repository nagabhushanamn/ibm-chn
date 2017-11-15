package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class HelloClientServiceApplication {

	@Autowired
	private EurekaClient eurekaClient;

	public static void main(String[] args) {
		SpringApplication.run(HelloClientServiceApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("hello-service", false);
		String baseUrl = instance.getHomePageUrl();
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity(baseUrl, String.class).getBody();
	}

}
