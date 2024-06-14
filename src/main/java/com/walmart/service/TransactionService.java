package com.walmart.service;

import java.util.List;

import com.walmart.model.Transaction;

public interface TransactionService {

	
	Transaction saveTransaction(Transaction trans);
	
	Transaction getTransactionById(int transaction_id);
	
	List<Transaction> getAllTransactions();

	Transaction updateTransaction(Transaction tarns, int transaction_id);

	void deleteTransaction(int transaction_id);

}