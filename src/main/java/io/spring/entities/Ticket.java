package io.spring.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ticketId;
	@Column(name = "summary")
	private String summary;
	@Column(name = "issue_description")
	private String issue;
	
	@ManyToOne
	@JoinColumn(name = "categoryId", referencedColumnName="categoryId")
	private Categories categoryId;
	
	@OneToOne
	@JoinColumn(name="engineer", referencedColumnName="eng_id") 
	private Engineer engineer;
	
	
	public Engineer getEngineer() {
		return engineer;
	}

	public void setEngineer(Engineer engineer) {
		this.engineer = engineer;
	}

	@ManyToOne
	@JoinColumn(name = "customerId")
	private Customer customerId;

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}
	
	public Categories getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Categories categoryId) {
		this.categoryId = categoryId;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getIssue() {
		return issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

}
