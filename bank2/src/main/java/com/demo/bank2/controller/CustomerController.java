package com.demo.bank2.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bank2.entity.Customer;
import com.demo.bank2.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@PostMapping("/CreateAccount")
	public ResponseEntity<Customer> save(@Valid @RequestBody Customer customer,
			@RequestParam("Account type(*)") @NotBlank String accounttype,
			@RequestParam("Balance[Minimum 500 balance]") @Min(499) double balance) {
		customerService.save(customer, accounttype, balance);
		return new ResponseEntity<Customer>(HttpStatus.CREATED);
	}

}
