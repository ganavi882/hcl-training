package com.demo.bank2.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatementResponseDto {
	double amount;
	Date date;
	long account;
	String status;

	public StatementResponseDto(double amount, Date date, long account) {
		super();
		this.amount = amount;
		this.date = date;
		this.account = account;
	}

}