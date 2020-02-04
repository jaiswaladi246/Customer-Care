package io.spring.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.entities.StatusUpdateByEngg;
import io.spring.entities.Ticket;
import io.spring.repo.EngineerRepository;
import io.spring.repo.IncidentRepository;
import io.spring.repo.TicketRepository;
import io.spring.vo.StatusUpdateByEnggVo;

@Service
public class IncidentService {
	
	@Autowired
	IncidentRepository incidentRepo;
	
	@Autowired
	TicketRepository ticketRepo;
	
	@Autowired
	EngineerRepository engineerRepo;
	
	
	
	public List<StatusUpdateByEngg> getAllStatusUpdateByEngg(){
		
		List <StatusUpdateByEngg> allStatusUpdateByEngg =new ArrayList<StatusUpdateByEngg>();
		incidentRepo.findAll().forEach(i -> allStatusUpdateByEngg.add(i));
		return allStatusUpdateByEngg;
		
	}
	
	public void addStatusUpdateByEngg(StatusUpdateByEnggVo statusVo) {
		
		StatusUpdateByEngg statusUpdateByEngg = new StatusUpdateByEngg();
		
		statusUpdateByEngg.setCurrentStatus(statusVo.getCurrentStatus());
		statusUpdateByEngg.setIncidentNo(statusVo.getIncidentNo());
		statusUpdateByEngg.setTicket(ticketRepo.findById(statusVo.getTicketId()).get());
		
		
	}

}
