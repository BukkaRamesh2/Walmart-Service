package com.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.walmart.model.Transaction;
import com.walmart.service.TransactionService;

@RestController
public class TransactionController {

/*
 * save
 * get
 * delete
 * update
 */
	
	@Autowired
	private TransactionService transService;
	
	
	@PostMapping("/save")
	public ResponseEntity<Transaction> saveTransaction(@RequestBody Transaction trans) {
		
		trans.message();
		return new ResponseEntity<Transaction>(transService.saveTransaction(trans),HttpStatus.CREATED);
	}
	
	@GetMapping("/getById/{transactionId}")
	   public ResponseEntity<Transaction> getTransactionById(@PathVariable("id") Long transaction_id){
		   return new ResponseEntity<Transaction>(transService.getTransactionById(transaction_id), HttpStatus.OK);

	   }
	   
	   @GetMapping("/getAllTransactions")
	   public List<Transaction> getTransactionList(){
		   return transService.getAllTransactions();
	   }
	   
	   @PutMapping("/updateTransaction/{transaction_id}")
	   public ResponseEntity<Transaction>  updateTransaction(@RequestBody Transaction trans, @PathVariable("id") Long transaction_id){
	       return new ResponseEntity<Transaction>(transService.updateTransaction(trans,transaction_id),HttpStatus.OK);
	   }
	   
	   @DeleteMapping("/deleteTransaction/{transaction_id}")
	   ResponseEntity<String> deleteTransaction(@PathVariable("id") Long transaction_id){
		   transService.deleteTransaction(transaction_id);
	       return new ResponseEntity<String>("Transaction deleted Successfully.",HttpStatus.OK);
	   
	   }
	
}
