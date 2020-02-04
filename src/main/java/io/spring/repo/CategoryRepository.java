package io.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.spring.entities.Categories;

public interface CategoryRepository extends JpaRepository <Categories, Integer> {
	
	
}
