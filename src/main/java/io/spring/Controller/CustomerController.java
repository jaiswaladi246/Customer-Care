package io.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.spring.Service.CustomerService;
import io.spring.entities.Customer;
import io.spring.repo.CustomerRepository;
import io.spring.vo.CustomerVo;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("")
	public List<Customer> customer(){
		
		return customerService.getAllCustomer();
		
	}

	
	@RequestMapping(value="", method=RequestMethod.POST)
	public void addCustomer(@RequestBody CustomerVo customer) {
		
		customerService.addCustomer(customer);
	}
}
