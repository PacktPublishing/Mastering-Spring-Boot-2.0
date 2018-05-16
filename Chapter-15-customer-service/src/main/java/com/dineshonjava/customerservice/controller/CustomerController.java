package com.dineshonjava.customerservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dineshonjava.customerservice.domain.Account;
import com.dineshonjava.customerservice.domain.Customer;
import com.dineshonjava.customerservice.repository.CustomerRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@RestController
public class CustomerController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	
	//@Autowired
	//AccountService accountService;  
	
	@PostMapping(value = "/customer")
	public Customer save (@RequestBody Customer customer){
		logger.info("Saving Customer information "+customer);
		return customerRepository.save(customer);
	}
	
	@GetMapping(value = "/customer")
	public Iterable<Customer> all (){
		List<Customer> customers = new ArrayList<>();
		for(Customer customer : customerRepository.findAll()){
			//logger.info("All Customers information "+accountService.findByCutomer(customer.getCustomerId()));
		//	customer.setAccount(accountService.findByCutomer(customer.getCustomerId()));
		}
		return customers;
	}
	
	@GetMapping(value = "/customer/{customerId}")
	public Customer findByAccountId (@PathVariable Integer customerId){
		Customer customer = customerRepository.findByCustomerId(customerId);
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		logger.info("Customer's account information by calling account-service ");
		List<Account> list = restTemplate.getForObject("http://localhost:6060/account/customer/"+customerId, List.class, customer);
		//String hii = restTemplate.getForObject("http://localhost:6161/hi", String.class,params);
		customer.setAccount(list);
		logger.info("Find Customer information by id with fetched account info: ");
		return customer;
	}
	
	@PutMapping(value = "/customer")
	public Customer update (@RequestBody Customer customer){
		return customerRepository.save(customer);
	}
	
	@DeleteMapping(value = "/customer")
	public void delete (@RequestBody Customer customer){
		customerRepository.delete(customer);
	}
	
	@GetMapping(value = "/hi")
	public String hi (){
		logger.info("Hi to customer service ");
		return "Hiii";
	}
}
