package com.example.bank.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Transaction {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  long transactionid;
	
	private long fromAccNo;
	
	private long toAccNo;
	
private int amount;
	
	@CreationTimestamp
	private Date transactionDateTime;

	public long getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(long transactionid) {
		this.transactionid = transactionid;
	}

	public long getFromAccNo() {
		return fromAccNo;
	}

	public void setFromAccNo(long fromAccNo) {
		this.fromAccNo = fromAccNo;
	}

	public long getToAccNo() {
		return toAccNo;
	}

	public void setToAccNo(long toAccNo) {
		this.toAccNo = toAccNo;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getTransactionDateTime() {
		return transactionDateTime;
	}

	public void setTransactionDateTime(Date transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	

}