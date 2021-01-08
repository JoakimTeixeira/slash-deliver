package com.slashdev.slashdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slashdev.slashdeliver.dto.ProductDTO;
import com.slashdev.slashdeliver.entities.Product;
import com.slashdev.slashdeliver.repositories.ProductRepository;

// Annotation to register component in Spring Boot
@Service
public class ProductService {
	
//	Applies dependency injection for class constructor
	@Autowired
	private ProductRepository repository;
	
//	Transform Product items to ProductDTO items, using lambda expressions
//	Annotation to prevent write lock in the database (increases transaction speed)
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll() {
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
