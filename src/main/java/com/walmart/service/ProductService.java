package com.walmart.service;

import java.util.List;
import java.util.Set;

import com.walmart.model.Product;

public interface ProductService {
	
	public String getProductDescription(Long productId);
	

	Product getProductById(Long productId);

	Set<Product> getAllProducts();
	
	Product saveProduct(Product product);
	
	Product updateProduct(Product product, Long productId);

	void deleteProduct(Long productId);


}
