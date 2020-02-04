package io.spring.repo;



import org.springframework.data.jpa.repository.JpaRepository;


import io.spring.entities.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Integer> {

	
	
}
