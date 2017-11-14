package com.example.demo.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.demo.model.Product;

@Component
public class ProductFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return arg0.getName().equals(Product.class);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmpty(errors, "name", "product.name.required");
	}

}
