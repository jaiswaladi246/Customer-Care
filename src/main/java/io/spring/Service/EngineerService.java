package io.spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.entities.Categories;
import io.spring.entities.Engineer;
import io.spring.repo.CategoryRepository;
import io.spring.repo.EngineerRepository;
import io.spring.vo.EngineerVo;

@Service
public class EngineerService {

	@Autowired
	EngineerRepository engineerRepo;
	
    @Autowired
    CategoryRepository categoryRepo;
    
	public List<Engineer> getAllEngineer(){
		List<Engineer> allEngineer = new ArrayList<Engineer>();
		
		engineerRepo.findAll().forEach(e -> allEngineer.add(e) );
		return allEngineer;
	}
	
	public void addEngineer(EngineerVo engineerVo) {
		
		Engineer engineer = new Engineer();
		
		engineer.setEng_id(engineerVo.getEng_id());
		engineer.setEng_name(engineerVo.getEng_name());
		engineer.setCategoryId(categoryRepo.findById(engineerVo.getCategoryId()).get());
		engineerRepo.save(engineer);
	}
}
