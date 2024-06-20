package com.walmart.serviceImpl;

import org.springframework.stereotype.Service;

@Service
public class ProductSericeImpl {

	public String getProductDescription(Long productId) {		
		if(productId == 1) {
			return "Product Description 1";
		}else if(productId == 2) {
			return "Product Description 2";
		}else if(productId == 3) {
			return "Product Description 3";
		}else {
			return "Product Description for other products";
		}		
	};

}
