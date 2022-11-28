package com.demo.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.bank2.dto.StatementResponseDto;
import com.demo.bank2.entity.Transaction;

import java.sql.Date;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
//	@Query("SELECT date FROM Transaction where year(date)=?2 and month(date)=?1")
//	List<java.util.Date> Date(int month, int year);

	List<Transaction> findByDateAndToaccount(Date date, long toaccount);

	List<Transaction> findByDateAndFromaccount(Date date, long fromaccount);

	@Modifying
	@Query("SELECT  new  com.demo.bank2.dto.StatementResponseDto(amount,date,fromaccount) from Transaction where toaccount=:toaccount and date=:date")
	List<StatementResponseDto> findByDateAndToaccount1(long toaccount, Date date);

	@Modifying
	@Query("SELECT  new  com.demo.bank2.dto.StatementResponseDto(amount,date,toaccount) from Transaction where fromaccount=:fromaccount and date=:date")
	List<StatementResponseDto> findByDateAndFromaccount1(long fromaccount, Date date);

}



































