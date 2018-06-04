/**
 * 
 */
package com.dineshonjava.accountservice.service;

import java.util.List;

import com.dineshonjava.accountservice.domain.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public interface AccountService {
	
	
	List<Account> findAllByCustomerId(Integer customerId);
	
	List<Account> findAllByAccountType(String accountType);
	
	List<Account> findByBank(String bank);
	
	Account findAccountByAccountId(Integer accountId);

	Account save(Account account);

	Iterable<Account> findAll();

	void delete(Account account);
}
