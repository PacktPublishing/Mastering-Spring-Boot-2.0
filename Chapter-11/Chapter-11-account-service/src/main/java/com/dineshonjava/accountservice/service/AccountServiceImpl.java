package com.dineshonjava.accountservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dineshonjava.accountservice.domain.Account;
import com.dineshonjava.accountservice.repository.AccountRepository;

/**
 * @author Dinesh.Rajput
 *
 */
@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountRepository accountRepository;

	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	@Override
	public Account findAccountByAccountId(Integer accountId) {
		return accountRepository.findAccountByAccountId(accountId);
	}
	
	@Override
	public List<Account> findAllByCustomerId(Integer customerId) {
		return accountRepository.findAllByCustomerId(customerId);
	}

	@Override
	public List<Account> findAllByAccountType(String accountType) {
		return accountRepository.findAllByAccountType(accountType);
	}

	@Override
	public List<Account> findByBank(String bank) {
		return accountRepository.findByBank(bank);
	}

	@Override
	public Account save(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public Iterable<Account> findAll() {
		return accountRepository.findAll();
	}

	@Override
	public void delete(Account account) {
		accountRepository.delete(account);
	}

}
