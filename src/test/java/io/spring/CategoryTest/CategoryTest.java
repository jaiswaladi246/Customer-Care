package io.spring.CategoryTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import io.spring.Service.CategoryService;
import io.spring.entities.Categories;
import io.spring.repo.CategoryRepository;
import io.spring.vo.CategoriesVo;


@RunWith(MockitoJUnitRunner.class)
public class CategoryTest {
	
	@Mock
	CategoryRepository categoryRepo;
	
	@InjectMocks
	private CategoryService categoryService;
	
    @Test
    public  void getCategoryTest() {
    	
    	List<Categories> list = new ArrayList<Categories>();
    	Categories cvo = new Categories();
    	Categories cvo1 = new Categories();
   
    	cvo.setCategory("network");
    	cvo1.setCategory("access");
    	
    	list.add(cvo);
    	list.add(cvo1);
    	
    	when(categoryService.getAllCategories()).thenReturn(list);
    	List<Categories> ctgList = categoryService.getAllCategories();
    	assertEquals(2, ctgList.size());
    
    }
    
    @Test
    public void addCategoryTest() {
    	CategoriesVo  categ1 = new CategoriesVo();
    	CategoriesVo categ2 = new CategoriesVo();
    	
    	categ1.setCategory("project");
    	categ2.setCategory("training");
    	
    	categoryService.addCategory(categ1);
    	categoryService.addCategory(categ2);
    	
    	assertEquals("project", categ1.getCategory());
    	assertEquals("training", categ2.getCategory());
    	
    }
    
    
}
