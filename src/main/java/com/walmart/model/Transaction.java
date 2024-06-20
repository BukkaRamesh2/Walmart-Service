package com.walmart.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Transaction")
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transaction_id;
	
	@Column(name = "receipt_number")
	private int receipt_number;
	
	@Column(name = "customer_id")
	private int customer_id;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "total_amount")
	private int total_amount;
	

	public Long getTransaction_id() {
		return transaction_id;
	}
	
	public void setTransaction_id(Long transaction_id) {
		this.transaction_id =  transaction_id;
	}
	
	public int getReceipt_number() {
		return receipt_number;
	}
	
	public void setReceipt_number(int receipt_number) {
		this.receipt_number= receipt_number;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status= status;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date= date;
	}
	
	public int getTotal_amount() {
		return total_amount;
	}
	
	public void setTotal_amount(int total_amount) {
		this.total_amount= total_amount;
	}
	
	public void message() {
		System.out.println("This message is printed from Transaction class..");
	}
	
	
}
