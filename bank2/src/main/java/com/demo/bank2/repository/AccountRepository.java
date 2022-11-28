package com.demo.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bank2.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{
	Account findByAccountnumber(long accountnumber);
}