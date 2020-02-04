package io.spring.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "engineer")
public class Engineer {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int eng_id;
	
	private String eng_name;
	
	@ManyToOne
	@JoinColumn(name="categoryId", referencedColumnName="categoryId")
	private Categories categoryId;	
	
	public int getEng_id() {
		return eng_id;
	}
	public void setEng_id(int eng_id) {
		this.eng_id = eng_id;
	}
	public String getEng_name() {
		return eng_name;
	}
	public void setEng_name(String eng_name) {
		this.eng_name = eng_name;
	}
	public Categories getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Categories categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
	
	
}
