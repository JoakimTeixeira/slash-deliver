package com.slashdev.slashdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slashdev.slashdeliver.dto.OrderDTO;
import com.slashdev.slashdeliver.entities.Order;
import com.slashdev.slashdeliver.repositories.OrderRepository;

// Annotation to register component in Spring Boot
@Service
public class OrderService {
	
//	Applies dependency injection for class constructor
	@Autowired
	private OrderRepository repository;
	
//	Transform Order items to OrderDTO items (JSON), using lambda expressions
//	Annotation to prevent write lock in the database (increases transaction speed)
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findAll();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
}
