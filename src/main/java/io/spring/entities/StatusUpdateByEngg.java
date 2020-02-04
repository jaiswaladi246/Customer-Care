package io.spring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="IncidentStatus")
public class StatusUpdateByEngg {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int incidentNo;
	private String currentStatus;
	
	
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ticket", referencedColumnName = "ticketId")
	private Ticket ticket;
	
	
	public int getIncidentNo() {
		return incidentNo;
	}
	public void setIncidentNo(int incidentNo) {
		this.incidentNo = incidentNo;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	
	
	
}
