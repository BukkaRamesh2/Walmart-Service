package com.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.RestController;

import com.walmart.model.Customer;
import com.walmart.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
   @Autowired
   private CustomerService custService;
   
   
   
   /*
    * 
    * 
    *  {
    *   
    *   firstName: value
    *   lastname: vlaue
    *   address {
    *     street: value,
    *     state: value,
    *     
    *   }
    *  
    *  }
    *  
    *  
    * 
    */
   @PostMapping("/save")
   public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
	   
	   //customer.getAddress().getCountry();
	   customer.messgae();  // what's the output
	   
	   return new ResponseEntity<Customer>(custService.saveCustomer(customer), HttpStatus.CREATED);
   }
   
   @GetMapping("/getById/{customerId}")
   public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Long customerId){
	   return new ResponseEntity<Customer>(custService.getCustomerById(customerId), HttpStatus.OK);

   }
   
   @GetMapping("/getAllCustomers")
   public List<Customer> getCustomerList(){
	   return custService.getAllCustomers();
   }
   
   @PutMapping("/updateCustomer/{id}")
   public ResponseEntity<Customer>  updateCustomer(@RequestBody Customer cust, @PathVariable("id") long customerId){
       return new ResponseEntity<Customer>(custService.updateEmployee(cust,customerId),HttpStatus.OK);
   }
   
   @DeleteMapping("/deleteCustomer/{customerId}")
   ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId){
	   custService.deleteCustomer(customerId);
       return new ResponseEntity<String>("Employee deleted Successfully.",HttpStatus.OK);
   
   }
   


}
