package com.example.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bank.entity.Customer;
import com.example.bank.sevice.BankServiceImpl;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@Autowired
	public BankServiceImpl bankserviceimp;
	
	@PostMapping("/addCustomer")
	public String newCustomer(@RequestBody Customer customer, @RequestParam String accountType, @RequestParam float balance) {
		return 	bankserviceimp.insertNewCustomer(customer, accountType, balance);
		
		
	}
	
	@PostMapping("/fundTransfer")
	public String fundTransfer(@RequestParam long fromAccNo, long toAccNo, int amount) {
		return bankserviceimp.fundTransfer(fromAccNo,toAccNo,amount);
	}


}