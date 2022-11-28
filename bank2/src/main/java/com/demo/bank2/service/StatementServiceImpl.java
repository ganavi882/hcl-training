package com.demo.bank2.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bank2.dto.StatementResponseDto;

import com.demo.bank2.repository.TransactionRepository;

@Service
public class StatementServiceImpl implements StatementService {

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public List<StatementResponseDto> getStatement2(Date date1, long account) throws ParseException {
		// TODO Auto-generated method stub

		List<StatementResponseDto> crediteStatements = new ArrayList<>();
		List<StatementResponseDto> debitStatements = new ArrayList<>();

		crediteStatements.addAll(transactionRepository.findByDateAndToaccount1(account, date1));
		for (StatementResponseDto c1 : crediteStatements)
			c1.setStatus("Credited");
		debitStatements.addAll(transactionRepository.findByDateAndFromaccount1(account, date1));
		for (StatementResponseDto c1 : debitStatements)
			c1.setStatus("Debited");

		crediteStatements.addAll(debitStatements);

		return crediteStatements;
	}

}
