package io.spring.vo;

import io.spring.entities.Engineer;

public class TicketVo {

	private int ticketId;
	private String issueDescription;
	private String summary;
	private String categoryId;
	private int customerId;
	private int engineer;
	
	
	
	public int getEngineer() {
		return engineer;
	}
	public void setEngineer(int engineer) {
		this.engineer = engineer;
	}
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getIssueDescription() {
		return issueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	

}
