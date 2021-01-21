package com.slashdev.slashdeliver.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.slashdev.slashdeliver.dto.OrderDTO;
import com.slashdev.slashdeliver.dto.ProductDTO;
import com.slashdev.slashdeliver.entities.Order;
import com.slashdev.slashdeliver.entities.OrderStatus;
import com.slashdev.slashdeliver.entities.Product;
import com.slashdev.slashdeliver.repositories.OrderRepository;
import com.slashdev.slashdeliver.repositories.ProductRepository;

// Annotation to register component in Spring Boot
@Service
public class OrderService {
	
//	Applies dependency injection for class constructor
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
//	Transform Order items to OrderDTO items (JSON), using lambda expressions
//	Annotation to prevent write lock in the database (increases transaction speed)
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll() {
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
//	Save new order to database
	@Transactional
	public OrderDTO insert(OrderDTO dto) {
		Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), 
				Instant.now(), OrderStatus.PENDING);
		
//		Associate products to each order
		for(ProductDTO p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		
//		Save to database
		order = repository.save(order);
		return new OrderDTO(order);
	}	
	
//	Update order to delivered
	@Transactional
	public OrderDTO setDelivered(Long id) {
		Order order = repository.getOne(id);
		order.setStatus(OrderStatus.DELIVERED);
		order = repository.save(order);
		
		return new OrderDTO(order);
	}
}
