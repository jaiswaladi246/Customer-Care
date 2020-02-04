package io.spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.entities.Categories;
import io.spring.repo.CategoryRepository;
import io.spring.vo.CategoriesVo;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepo; 
	
	
	public List<Categories> getAllCategories() {
		
		List<Categories> allCategories = new ArrayList<Categories>();
		
		categoryRepo.findAll().forEach(k -> allCategories.add(k));
		return allCategories;
		
		}
	
	public void addCategory(CategoriesVo categoryVo) {
		
		Categories category = new Categories();
		
		category.setCategory(categoryVo.getCategory());
		categoryRepo.save(category);
		
	}
	
}
