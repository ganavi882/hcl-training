package com.demo.bank2.service;

import com.demo.bank2.entity.Customer;

public interface CustomerService {

	void save(Customer customer, String accounttype, double balance);

}