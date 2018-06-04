/**
 * 
 */
package com.dineshonjava.webapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dineshonjava.webapplication.domain.Account;
import com.dineshonjava.webapplication.exception.AccountNotFoundException;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class WebAccountsService {
	
	@Autowired
    @LoadBalanced
    protected RestTemplate restTemplate;
	
	protected String serviceUrl = "http://ACCOUNT-SERVICE"; 
	
    public Account getByNumber(String accountNumber) {
        Account account = restTemplate.getForObject(serviceUrl
                + "/account/{accountId}", Account.class, accountNumber);
        if (account == null)
            throw new AccountNotFoundException(accountNumber);
        else
            return account;
    }
    
    public List<Account> getAllAccounts(){
    	return restTemplate.getForObject(serviceUrl+ "/account", List.class);
    }
}
