package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

}
