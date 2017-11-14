package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductRepository {

	void save(Product product);

	List<Product> findAll();

	Product findOne(int id);

}
