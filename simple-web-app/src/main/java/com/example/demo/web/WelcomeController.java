package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	// resource
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("/welcome req processed..");
		return "Welcome to world";
	}

}
