package com.slashdev.slashdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slashdev.slashdeliver.entities.Product;

// JpaRepository allows database requests for product entity
public interface ProductRepository extends JpaRepository<Product, Long> {

//	Order all products by name
	List<Product> findAllByOrderByNameAsc();
}
