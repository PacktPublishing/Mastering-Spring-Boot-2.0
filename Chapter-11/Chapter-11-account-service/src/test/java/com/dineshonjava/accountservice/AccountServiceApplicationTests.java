package com.dineshonjava.accountservice;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.dineshonjava.accountservice.service.AccountService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceApplicationTests {
	
	@Autowired
	AccountService accountService;
	
	@Test 
	public void findAccountByAccountId() {
		assertTrue(accountService.findAccountByAccountId(100).getBalance().intValue() == 3502);
	}
	
	@Test 
	public void findAllByCustomerId() {
		assertFalse(accountService.findAllByCustomerId(1000).size() == 3);
	}

}
