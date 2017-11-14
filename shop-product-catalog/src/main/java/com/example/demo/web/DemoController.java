package com.example.demo.web;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Product;

@Controller
public class DemoController {
	
//	@Autowired
//	private ProductFormValidator validator;

//	@RequestMapping(value = "/ex/products", method = RequestMethod.GET)
//	public @ResponseBody String m1() {
//		return "GET: /ex/products";
//	}
//
//	@RequestMapping(value = "/ex/products", method = RequestMethod.POST)
//	public @ResponseBody String m2() {
//		return "POST: /ex/products";
//	}

	// --------------------------------------------------------------

//	@RequestMapping(value = "/ex/products", method = RequestMethod.GET, params = { "price" })
//	public @ResponseBody String m3() {
//		return "GET: /ex/products  with price  param";
//	}
//
//	@RequestMapping(value = "/ex/products", method = RequestMethod.GET, params = { "!price" })
//	public @ResponseBody String m4() {
//		return "GET: /ex/products  without price param";
//	}

	// --------------------------------------------------------------
	
//	@RequestMapping(value = "/ex/products", method = RequestMethod.GET, headers= {"x-header=y-value"})
//	public @ResponseBody String m5() {
//		return "GET: /ex/products  with x-header";
//	}
	
	// --------------------------------------------------------------
//	
//	@RequestMapping(value = "/ex/products", method = RequestMethod.POST)
//	public @ResponseBody String m6(@RequestParam(name="prodName") String name,@RequestParam(required=false,defaultValue="10.00") double price) {
//		return name +" - "+ price;
//	}
	
	
	// --------------------------------------------------------------
	

//	@RequestMapping(value = "/ex/products", method = RequestMethod.POST)
//	public @ResponseBody String m6(@Valid @ModelAttribute Product product,BindingResult result) {
//		//validator.validate(product, result);
//		if(result.hasErrors()) {
//			return result.toString();
//		}
//		return product.toString();
//	}
	
	// --------------------------------------------------------------
	
//	@RequestMapping(value = "/ex/products", method = RequestMethod.POST,consumes= {"application/json","application/xml"})
//	public @ResponseBody String m6(@Valid @RequestBody Product product,BindingResult result) {
//		//validator.validate(product, result);
//		if(result.hasErrors()) {
//			return result.toString();
//		}
//		return product.toString();
//	}
	
	// --------------------------------------------------------------
	
//	@RequestMapping(value="/req")
//	public String m7() {
//		System.out.println("req..");
//		return "redirect:index.html";
//	}
	

	// --------------------------------------------------------------
	

//	@RequestMapping(value="/req")
//	public String m7(Model model) {
//		model.addAttribute("message", "Welcome to Spring MVC");
//		return "pm";
//	}
	
	
//	@RequestMapping(value="/req")
//	public String m7(Map<String,String> model) {
//		model.put("message", "Welcome to Spring MVC");
//		return "pm";
//	}
	
	@RequestMapping(value="/req")
	public void m7(Model model) {
		model.addAttribute("message", "Welcome to Spring MVC");
	}
	
	
}
