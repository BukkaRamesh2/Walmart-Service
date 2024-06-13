package com.walmart.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.model.Customer;
import com.walmart.repository.CustomerRepository;
import com.walmart.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	CustomerRepository custRepo;
	
	public Customer saveCustomer(Customer customer) {
		  return custRepo.save(customer);
	}

	
	public Customer getCustomerById(Long customerId) {
		 Optional<Customer> cust =  custRepo.findById(customerId);
	        if(cust.isPresent()){
	            return cust.get();
	        }else {
	            throw new RuntimeException();
	        }
	}


	public List<Customer> getAllCustomers() {
		return custRepo.findAll();
	}


	public Customer updateEmployee(Customer cust, Long customerId) {
		Customer existingCust = custRepo.findById(customerId).get();//orElseThrow(() -> new RuntimeException());
		
		    existingCust.setFirstName(cust.getFirstName());
		    existingCust.setLastName(cust.getLastName());
		    existingCust.setEmail(cust.getEmail());
	        // save
		    custRepo.save(existingCust);
	        return existingCust;
	}

	public void deleteCustomer(Long customerId) {
		Optional<Customer> cust =  custRepo.findById(customerId);//.orElseThrow(() -> new RuntimeException());
		if(cust.get().getCustomerId() != null) {
		custRepo.deleteById(customerId);
		} else {
			System.out.println("Customer not found");
		}
		
	}

}
