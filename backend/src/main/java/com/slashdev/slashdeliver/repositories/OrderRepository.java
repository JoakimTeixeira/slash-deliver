package com.slashdev.slashdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.slashdev.slashdeliver.entities.Order;

// JpaRepository allows database requests for product entity
public interface OrderRepository extends JpaRepository<Order, Long> {
	
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products"
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrdersWithProducts();
}
