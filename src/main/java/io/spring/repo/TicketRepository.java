package io.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.spring.entities.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
