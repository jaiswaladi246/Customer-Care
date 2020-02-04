package io.spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.entities.Ticket;
import io.spring.repo.CustomerRepository;
import io.spring.repo.EngineerRepository;
import io.spring.repo.TicketRepository;
import io.spring.vo.TicketVo;

@Service
public class TicketService {

	@Autowired
	TicketRepository ticketRepo;
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	EngineerRepository engineerRepo;
	
	public List<Ticket> getAllTicket(){
		List<Ticket> allTicket = new ArrayList<Ticket>();
	
		ticketRepo.findAll().forEach(t -> allTicket.add(t));
		return allTicket;
		
	}
	
	public void addTicket(TicketVo ticketVo) {
		
		Ticket ticket = new Ticket();
	
		ticket.setTicketId(ticketVo.getTicketId());
		ticket.setIssue(ticketVo.getIssueDescription());
		ticket.setCustomerId(customerRepo.findById(ticketVo.getCustomerId()).get());
		ticket.setEngineer(engineerRepo.findById(ticketVo.getEngineer()).get());
		ticketRepo.save(ticket);
		
	}
	
}
