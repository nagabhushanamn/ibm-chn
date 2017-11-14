package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Controller
@RequestMapping("/products")
public class ProductsController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView list() {
		List<Product> products = productRepository.findAll(); // Model
		ModelAndView mav = new ModelAndView();
		mav.addObject("products", products);
		mav.setViewName("pm");
		return mav;
	}
	

	@RequestMapping(method = RequestMethod.GET,produces= {"application/json"})
	public @ResponseBody List<Product> listForJSON() {
		List<Product> products = productRepository.findAll(); // Model
		return products;
	}
	
	@RequestMapping(value="/{productId}", method = RequestMethod.GET,produces= {"application/json"})
	public @ResponseBody Product get(@PathVariable int productId) {
		Product product = productRepository.findOne(productId); // Model
		if(product==null) {
			throw new ProductNotFoundException();
		}
		return product;
	}
	
	
	

}
