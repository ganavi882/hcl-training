package com.example.bank.sevice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bank.entity.Account;
import com.example.bank.entity.Transaction;
import com.example.bank.entity.Customer;

import com.example.bank.repository.AccountRepository;
import com.example.bank.repository.CustomerRepository;
import com.example.bank.repository.TransactionRepository;

@Service
public class BankServiceImpl implements BankService {
	
	
	@Autowired
	private AccountRepository accRepo;
	@Autowired
	private CustomerRepository custRepo;
	@Autowired
	TransactionRepository transactionRepository;
//	@Autowired
//	Account account1, account2;
//	@Autowired
//	Transaction transaction;	

	@Override
	public String insertNewCustomer(Customer customer, String accountType, float balance) {
		custRepo.save(customer);
	Account	account1=new Account();
	account1.setCustId(customer.getCustid());
		account1.setAccType(accountType);
		account1.setBalance(balance);
		
		accRepo.save(account1);
		return "new customer added successfully";
		
	
		
	}

	@Override
	public String fundTransfer(long fromAccNo, long toAccNo, int amount) {
		
	Account	account1= accRepo.findAccountByAccNo(fromAccNo);	 
	Account	account2= accRepo.findAccountByAccNo(toAccNo);
	Transaction transaction=new Transaction();
	 if(account1.getBalance()-amount>0) {
		 account1.setBalance(account1.getBalance() - amount);
			
		 account2.setBalance(account2.getBalance() + amount);
	
		accRepo.save(account1);
		accRepo.save(account2);
	 
		transaction.setFromAccNo(fromAccNo);
		transaction.setToAccNo(toAccNo);
		transaction.setAmount(amount);
		
		transactionRepository.save(transaction);
		
		return "sucess";
	 }
	 	
		
	return "not sucessfull";
		
	
	}
	
	

	

}
