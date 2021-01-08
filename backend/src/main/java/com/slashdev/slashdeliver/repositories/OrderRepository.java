package com.slashdev.slashdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slashdev.slashdeliver.entities.Order;

// JpaRepository allows database requests for product entity
public interface OrderRepository extends JpaRepository<Order, Long> {

}
