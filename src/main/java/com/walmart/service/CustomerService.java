package com.walmart.service;

import java.util.List;

import com.walmart.model.Customer;

public interface CustomerService {

	Customer saveCustomer(Customer customer);

	Customer getCustomerById(Long customerId);

	List<Customer> getAllCustomers();

	Customer updateEmployee(Customer cust, Long customerId);

	void deleteCustomer(Long customerId);

}
