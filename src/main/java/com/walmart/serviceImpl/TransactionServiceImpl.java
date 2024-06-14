package com.walmart.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.walmart.model.Transaction;
import com.walmart.repository.TransactionRepository;
import com.walmart.service.TransactionService;


public class TransactionServiceImpl implements TransactionService{

	@Autowired
	TransactionRepository transRepo;
	
	public Transaction saveTransaction(Transaction trans) {
		  return transRepo.save(trans);
	}

	public Transaction getTransactionrById(int transaction_id) {
		try {
			
			Optional<Transaction> trans =  transRepo.findById(transaction_id);
	        if(trans.isPresent()){
	            return trans.get();
	        }else {
	            throw new RuntimeException();
	        }
	       //return cust.get();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Finally block executed");
		}
		return null;
	}
// lol yes
	
		public Transaction getTransactionById(int transaction_id, int receipt_number) throws RuntimeException{
		 Optional<Transaction> trans =  transRepo.findById(transaction_id);
	        if(trans.isPresent()){
	            return trans.get();
	        }else {
	            throw new RuntimeException();
	        }
	}
	
	

	public List<Transaction> getAllTransactions() {
		return transRepo.findAll();
	}


	public Transaction updateTransaction(Transaction trans, int transaction_id) {
		Transaction existingTrans = transRepo.findById(transaction_id).get();
		
		    existingTrans.setStatus(trans.getStatus());
		    existingTrans.setDate(trans.getDate());
		    existingTrans.setTotal_amount(trans.getTotal_amount());
	        // save
		    transRepo.save(existingTrans);
	        return existingTrans;
	}

	public void deleteTransaction(int transaction_id) {
		Optional<Transaction> trans = transRepo.findById(transaction_id);
		if(trans.get().getTransactionId() != null) {
			transRepo.deleteById(transaction_id);
		} else {
			System.out.println("Transaction not found");
		}
		
	}

	@Override
	public Transaction getTransactionById(int transaction_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}