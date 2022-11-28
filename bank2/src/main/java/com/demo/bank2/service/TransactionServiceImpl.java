package com.demo.bank2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.bank2.dto.TransactionDto;
import com.demo.bank2.entity.Account;
import com.demo.bank2.entity.Transaction;
import com.demo.bank2.repository.AccountRepository;
import com.demo.bank2.repository.TransactionRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	AccountRepository accountRepository;

	@Autowired
	TransactionRepository transactionRepository;

	@Override
	public String transfer(TransactionDto transactionDto) {
		// TODO Auto-generated method stub
		if (transactionDto.getFromaccount() != transactionDto.getToaccount()) {

			Account creditAccount = accountRepository.findByAccountnumber(transactionDto.getToaccount());
			Account debitAccount = accountRepository.findByAccountnumber(transactionDto.getFromaccount());
			if ((debitAccount.getBalance() - transactionDto.getAmount()) > 500) {
				Transaction transaction = new Transaction();

				creditAccount.setBalance(transactionDto.getAmount() + creditAccount.getBalance());
				debitAccount.setBalance(debitAccount.getBalance() - transactionDto.getAmount());

				transaction.setFromaccount(transactionDto.getFromaccount());
				transaction.setToaccount(transactionDto.getToaccount());
				transaction.setAmount(transactionDto.getAmount());
				transaction.setDate(transactionDto.getDate());

				accountRepository.save(creditAccount);
				accountRepository.save(debitAccount);

				transactionRepository.save(transaction);

				return "Successfully Transaction";
			}
		}
		return "Transaction failed!..";
	}

}