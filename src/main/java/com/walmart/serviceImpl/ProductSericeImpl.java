package com.walmart.serviceImpl;

public class ProductSericeImpl {

	public String getProductDescription(int productId) {		
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
