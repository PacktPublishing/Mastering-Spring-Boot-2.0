/**
 * 
 */
package com.dineshonjava.customerservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.dineshonjava.customerservice.domain.Customer;

/**
 * @author Dinesh.Rajput
 *
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	Customer findByCustomerId(Integer customerId);
	
}
