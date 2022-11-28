package com.demo.bank2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;

	long accountnumber = (long) (Math.floor(Math.random() * 98988998) + 787887878);

	@NotBlank
	@Pattern(regexp = "^(?:Business|Savings|Current)$", message = "Please enter valid account type")
	@Size(min = 4, message = "size minimum 4")
	String accounttype;

	private long cid;

	@Min(value = 499)
	double balance;

}