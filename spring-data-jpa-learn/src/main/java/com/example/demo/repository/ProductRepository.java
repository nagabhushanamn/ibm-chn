package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.model.Product;

@RepositoryRestController
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByPrice(@Param("price") double price);
	
	@Query(value="from Product p where p.reviews.size > 0")
	List<Product> loadHavingReviews();

	
	
}
