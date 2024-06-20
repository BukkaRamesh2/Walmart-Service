package com.walmart.service;

import java.util.List;

import com.walmart.model.Transaction;

public interface TransactionService {

	
	Transaction saveTransaction(Transaction trans);
	
	Transaction getTransactionById(Long transaction_id);
	
	List<Transaction> getAllTransactions();

	Transaction updateTransaction(Transaction tarns, Long transaction_id);

	void deleteTransaction(Long transaction_id);

}