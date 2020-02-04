package io.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.Service.EngineerService;
import io.spring.entities.Engineer;
import io.spring.repo.EngineerRepository;
import io.spring.vo.EngineerVo;

@RestController
@RequestMapping("/engineer")
public class EngineerController {

	@Autowired
	EngineerService engineerService;
	
	@RequestMapping("")
	public List<Engineer> engineer(){
		return engineerService.getAllEngineer();
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void addEngineer(@RequestBody EngineerVo engineer) {
		
		engineerService.addEngineer(engineer);
	}
}
