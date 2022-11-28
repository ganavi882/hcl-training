package com.demo.bank2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bank2.entity.Account;
import com.demo.bank2.entity.Customer;
import com.demo.bank2.repository.AccountRepository;
import com.demo.bank2.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Override
	public void save(Customer customer, String accounttype, double balance) {
		// TODO Auto-generated method stub
		customerRepository.save(customer);
		Account account = new Account();
		account.setAccounttype(accounttype);
		account.setBalance(balance);
		account.setCid(customer.getId());
		accountRepository.save(account);
	}

}