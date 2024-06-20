package com.walmart.serviceImpl;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.exception.ArrayExcepions;
import com.walmart.model.Customer;
import com.walmart.repository.CustomerRepository;
import com.walmart.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	CustomerRepository custRepo;
	
	
	/*
	 *  Exceptions
	 * 
	 *   Compile time // checked 
	 *   
	 *   
	 *   
	 *   Run Time // unchecked
	 *   
	 *   
	 *   Object 
	 *   
	 *   Throwable 
	 *   1. Errors
	 *   2. Exceptions ---- Runtime  and compiloe time 
	 *   
	 *  String getMessage()
	 *  
	 *  void printStackTrace();
	 *  
	 *  
	 *  try{
	 *   // protetct code
	 *  } catch( ExceptionName e){
	 *     e.printStackTrace();
	 *  }
	 *  finally 
	 *  
	 *  
	 *  throw 
	 *  throws  -- its a keyword appears at end of method signiture 
	 *  
	 * 
	 */
	

	
	public Customer saveCustomer(Customer customer) {
		  return custRepo.save(customer);
	}

	// method 1 with one paramater i.e. ID
	public Customer getCustomerById(Long customerId) {
		try {
			
			Optional<Customer> cust =  custRepo.findById(customerId);
	        if(cust.isPresent()){
	            return cust.get();
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

	
	// same method but different signiture 
	public Customer getCustomerById(Long customerId, String firstName) throws FileNotFoundException{
		
		
		
		try {
		FileReader fr = new FileReader("C:\test.txt");	
		
		try {
		int a[] = new int[2];  // size of array  2 
		System.out.println(a[5]);  // which element  elememt 5 
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int b = 10;
		System.out.println(b);  // whic  
		
		
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			
			//
			//throw new ArrayExcepions("hey the data you are proccesisng is not in a scope of array");
		} finally {
			//fr.close();
		}
		
		
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
