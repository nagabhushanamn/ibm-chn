package com.example.demo.web;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ControllerAdvisor {

	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = ProductNotFoundException.class)
	public void handleEx(Throwable e, Model model) {
		//
	}

}
