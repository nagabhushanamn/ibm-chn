package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@SpringBootApplication
public class SpringDataJpaLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaLearnApplication.class, args);
	}

	@Bean
	public CommandLineRunner name(ProductRepository prodRepo) {
		return args -> {

			// long count = prodRepo.count();
			// System.out.println(count);

			// boolean productExist=prodRepo.exists(20);
			// System.out.println(productExist);

			// List<Product> products=prodRepo.findAll();
			// products.forEach(p->System.out.println(p));

			// Product product=new Product();
			// product.setName("New Item");
			//
			// prodRepo.save(product);

			//
			// Product product = prodRepo.findOne(23);
			// product.setPrice(5000.00);
			// prodRepo.save(product);
			
			
			//List<Product> products=prodRepo.findByPrice(1000.00);
			List<Product> products=prodRepo.loadHavingReviews();
			products.forEach(p->System.out.println(p));
			

		};
	}

}
