package com.walmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
