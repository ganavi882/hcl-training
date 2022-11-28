package com.demo.bank2.controller;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.bank2.dto.StatementResponseDto;
import com.demo.bank2.service.StatementService;

@RestController
public class StatementController {

	@Autowired
	StatementService statementService;

	@GetMapping("/ShowTransaction")
	public List<StatementResponseDto> getStatement1(@RequestParam("Enter date in formate yyyy-mm-dd") Date date,
			@RequestParam("Enter your account no") long account) throws ParseException {
		return statementService.getStatement2(date, account);
	}

}
