package com.example.bank.sevice;

import com.example.bank.entity.Customer;

public interface BankService {

	

	String insertNewCustomer(Customer customer, String accountType, float balance);

	String fundTransfer(long fromAccNo, long toAccNo, int amount);



	

}
