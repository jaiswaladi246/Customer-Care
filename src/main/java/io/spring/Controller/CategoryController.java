package io.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.Service.CategoryService;
import io.spring.entities.Categories;

import io.spring.repo.CategoryRepository;
import io.spring.vo.CategoriesVo;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("")
	public List<Categories> category(){
		
		return categoryService.getAllCategories();
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void addCategory(@RequestBody CategoriesVo category ) {
		
		categoryService.addCategory(category);
		
	}
	
}
