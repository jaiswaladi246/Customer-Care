package io.spring.vo;

import io.spring.entities.Engineer;
import io.spring.entities.Ticket;

public class StatusUpdateByEnggVo {

	private int incidentNo;
	private String currentStatus;
	
	private int ticketId;
	
	
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
	
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	
	
	
	
}
