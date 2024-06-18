package com.walmart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.walmart.model.Product;

public class ProductRepository extends JpaRepository<Product, Long>{

}
