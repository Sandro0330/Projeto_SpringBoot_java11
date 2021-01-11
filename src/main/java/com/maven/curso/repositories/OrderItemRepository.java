package com.maven.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
