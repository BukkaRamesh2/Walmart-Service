package com.walmart.model;

import java.util.Date;

public class Transaction {

	private int transaction_id;
	private int receipt_number;
	private int customer_id;
	private String status;
	private Date date;
	private int total_amount;
	

	public int getTransaction_id() {
		return transaction_id;
	}
	
	public void setTransaction_id(int transaction_id) {
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
	
	
}
