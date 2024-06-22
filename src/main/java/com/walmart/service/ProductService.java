package com.walmart.service;

import java.util.List;

public interface ProductService {
	
	public String getProductDescription(Long productId);

		List<Product> getAllProducts();

}
