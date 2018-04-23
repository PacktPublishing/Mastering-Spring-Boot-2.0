/**
 * 
 */
package com.dineshonjava.accountservice.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dineshonjava.accountservice.domain.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	List<Account> findAllByCustomerId(Integer customerId);
	
	List<Account> findAllByAccountType(String accountType);
	
	List<Account> findByBank(String bank);
	
	Account findAccountByAccountId(Integer accountId);
}
