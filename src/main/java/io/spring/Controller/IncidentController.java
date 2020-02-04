package io.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.Service.IncidentService;
import io.spring.entities.StatusUpdateByEngg;
import io.spring.vo.StatusUpdateByEnggVo;

@RestController
@RequestMapping("/incident")
public class IncidentController {

	@Autowired
	IncidentService incidentService;
	
	@RequestMapping("")
	public List<StatusUpdateByEngg> statusUpdateByEngg(){
		
		return incidentService.getAllStatusUpdateByEngg();
		}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void addStatusUpdateByEngg(StatusUpdateByEnggVo status) {
		
		incidentService.addStatusUpdateByEngg(status);
	}
	
	
	@RequestMapping(value="", method=RequestMethod.PUT)
	public void updateStatusByEngg(StatusUpdateByEnggVo status) {
		
		incidentService.addStatusUpdateByEngg(status);
		
	}
	
}
