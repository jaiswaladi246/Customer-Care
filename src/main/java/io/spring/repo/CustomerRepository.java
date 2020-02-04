package io.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import io.spring.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
