package com.maven.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
