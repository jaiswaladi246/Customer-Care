package io.spring.vo;

import io.spring.entities.Categories;

public class EngineerVo {

	private int eng_id;
	private String eng_name;
	private int categoryId;
	

	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
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
	
	
	
	
	
}
