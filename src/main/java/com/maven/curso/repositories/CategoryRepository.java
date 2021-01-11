package com.maven.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
