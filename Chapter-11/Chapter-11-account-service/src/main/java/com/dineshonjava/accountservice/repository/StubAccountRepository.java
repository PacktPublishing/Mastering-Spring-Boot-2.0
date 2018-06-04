/**
 * 
 */
package com.dineshonjava.accountservice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.dineshonjava.accountservice.domain.Account;

/**
 * @author Dinesh.Rajput
 *
 */
public class StubAccountRepository implements AccountRepository {

	@Override
	public Account findAccountByAccountId(Integer accountId) {
		return new Account(100, 121.31, 1000, "SAVING", "HDFC121", "HDFC");
	}
	
	@Override
	public List<Account> findAllByCustomerId(Integer customerId) {
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(100, 121.31, 1000, "SAVING", "HDFC121", "HDFC"));
		accounts.add(new Account(200, 221.31, 1000, "CURRENT", "ICIC121", "ICICI"));
		return accounts;
	}

	@Override
	public List<Account> findAllByAccountType(String accountType) {
		return null;
	}

	@Override
	public List<Account> findByBank(String bank) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(Account arg0) {

	}

	@Override
	public void deleteAll() {

	}

	@Override
	public void deleteAll(Iterable<? extends Account> arg0) {

	}

	@Override
	public void deleteById(Integer arg0) {

	}

	@Override
	public boolean existsById(Integer arg0) {
		return false;
	}

	@Override
	public Iterable<Account> findAll() {
		return null;
	}

	@Override
	public Iterable<Account> findAllById(Iterable<Integer> arg0) {
		return null;
	}

	@Override
	public Optional<Account> findById(Integer arg0) {
		return null;
	}

	@Override
	public <S extends Account> S save(S arg0) {
		return null;
	}

	@Override
	public <S extends Account> Iterable<S> saveAll(Iterable<S> arg0) {
		return null;
	}

}
