package io.spring.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.spring.repo.CustomerRepository;
import io.spring.vo.CustomerVo;
import io.spring.entities.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepo;
	
	public List<Customer> getAllCustomer(){
		List<Customer> allCustomer = new ArrayList<Customer>();
		
		customerRepo.findAll().forEach(c -> allCustomer.add(c));
		return allCustomer;
		
	}
	public void addCustomer(CustomerVo customerVo) {
		
		Customer customer = new Customer();
		
		customer.setCustomerId(customerVo.getCustomerId());
		customer.setCustomerMail(customerVo.getCustomerMail());
		customer.setCustomerPhone(customerVo.getCustomerPhone());
		customer.setName(customerVo.getName());
	    customerRepo.save(customer);	
		
	}
	
	
}
