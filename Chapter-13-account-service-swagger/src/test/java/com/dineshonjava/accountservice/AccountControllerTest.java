/**
 * 
 */
package com.dineshonjava.accountservice;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.dineshonjava.accountservice.domain.Account;
import com.dineshonjava.accountservice.service.AccountService;

/**
 * @author Dinesh.Rajput
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountControllerTest {
	
	@MockBean
	AccountService accountService;
	
	@Test 
	public void findAllByCustomerId() {
		assertFalse(accountService.findAllByCustomerId(1000).size() == 3);
	}
	@Test
	public void testAddAccount_returnsNewAccount(){
		when(accountService.save(any(Account.class))).thenReturn(new Account(200, 200.20, 1000, "SAVING", "SBIWO111", "SBIW"));
        assertThat(accountService.save(new Account(200, 200.20, 1000, "SAVING", "SBIWO111", "SBIW")), is(notNullValue()));
	}
	
	@Test 
	public void findAccountByAccountId() {
		assertTrue(accountService.findAccountByAccountId(200).getBalance().intValue() == 200);
	}

}
