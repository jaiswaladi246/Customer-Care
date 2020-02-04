package io.spring.entities;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Categories")
public class Categories {

	@Id
	@GeneratedValue
	private int categoryId;
	private String category;
	
	@OneToMany(mappedBy = "categoryId")
	private List<Engineer> engineer;
	
	@OneToMany(mappedBy="categoryId")
	private List<Ticket> tickets;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}
