package com.demo.bank2.service;

import java.text.ParseException;
import java.sql.Date;
import java.util.List;

import com.demo.bank2.dto.StatementResponseDto;

public interface StatementService {

	List<StatementResponseDto> getStatement2(Date date, long account) throws ParseException;

}