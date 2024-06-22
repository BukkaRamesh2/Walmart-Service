package com.walmart.service;

import java.util.List;

import com.walmart.model.Product;

public interface ProductService {
	
	public String getProductDescription(Long productId);
	

	Product getProductById(Long productId);

	List<Product> getAllProducts();

}
