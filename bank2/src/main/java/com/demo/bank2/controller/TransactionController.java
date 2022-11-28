package com.demo.bank2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bank2.dto.TransactionDto;
import com.demo.bank2.service.TransactionService;

@RestController
public class TransactionController {

	@Autowired
	TransactionService transactionService;

	@PostMapping("/MakeATransaction")
	public String transfer(@Valid @RequestBody TransactionDto transactionDto) {

		return transactionService.transfer(transactionDto);
	}

}
