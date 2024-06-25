package com.walmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.model.Customer;

public interface PaymentsRepository extends JpaRepository<Customer, Long>{

}
