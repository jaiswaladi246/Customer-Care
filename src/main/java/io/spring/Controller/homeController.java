package io.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.Service.TicketService;
import io.spring.entities.Ticket;
import io.spring.vo.TicketVo;

@RestController
@RequestMapping("/ticket")
public class homeController {

	
	@Autowired
	TicketService ticketService;
	
	@RequestMapping("")
	public List<Ticket> ticket() {
		return ticketService.getAllTicket();
			
		}
		
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void addTicket(@RequestBody TicketVo ticket) {
		

		ticketService.addTicket(ticket);
		
	    }
	}


