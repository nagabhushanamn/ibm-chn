package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class RestProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@RequestMapping(method = RequestMethod.GET,produces= {"application/json"})
	public List<Product> listForJSON() {
		List<Product> products = productRepository.findAll(); // Model
		return products;
	}

}
