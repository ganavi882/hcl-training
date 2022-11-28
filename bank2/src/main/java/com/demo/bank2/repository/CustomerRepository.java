package com.demo.bank2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.bank2.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{

}