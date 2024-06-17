package com.walmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.walmart.service.ProductService;

/*
 * @RestController
 * 
 * @RequestMapping("/product") public class ProductController { Product
 * product=new Product();
 * 
 * @GetMapping("/getAllProducts") public List<Product> getProductList(){ return
 * productService.getAllProducts(); } }
 */

public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping
	public String getProductDetailsById(int productId) {

		String productDescription;

		productDescription = productService.getProductDescription(productId);

		return productDescription;

	}

}