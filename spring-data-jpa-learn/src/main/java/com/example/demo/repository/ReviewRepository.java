package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.example.demo.model.Review;

@RepositoryRestController
public interface ReviewRepository extends JpaRepository<Review, Integer>{

}
