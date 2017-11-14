package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;
// by Nag
@Repository("productRepo")
public class JpaProductRepositoryImpl implements ProductRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Product product) {
		em.persist(product);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> findAll() {
		// using JPQL
		String jpql = "from Product";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public Product findOne(int id) {
		return em.find(Product.class, id);
	}

}
