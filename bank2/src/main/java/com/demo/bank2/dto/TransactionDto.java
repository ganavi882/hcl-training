package com.demo.bank2.dto;

import java.sql.Date;

import javax.validation.constraints.Min;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDto {

	long fromaccount;

	long toaccount;
	@Min(value = 1, message = "minimum transaction is 1")
	double amount;

	Date date;

}
