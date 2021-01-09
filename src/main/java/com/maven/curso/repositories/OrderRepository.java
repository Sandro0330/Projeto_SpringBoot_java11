package com.maven.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
