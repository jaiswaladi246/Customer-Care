package io.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import io.spring.entities.StatusUpdateByEngg;

public interface IncidentRepository extends JpaRepository<StatusUpdateByEngg, Integer> {

	
	
}
