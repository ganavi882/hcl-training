package com.demo.bank2.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StatementRequestDto {

	String date;
	long accountno;
}
