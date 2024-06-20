package com.walmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
	

}
