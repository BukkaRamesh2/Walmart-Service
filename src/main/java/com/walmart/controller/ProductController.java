package com.walmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.model.Product;
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
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@GetMapping
	public String getProductDetailsById(Long productId) {

		String productDescription;

		productDescription = productService.getProductDescription(productId);

		return productDescription;

	}
	
   @GetMapping("/getById/{productId}")
   public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId){
	   return new ResponseEntity<Product>(productService.getProductById(productId), HttpStatus.OK);

   }
   
   @GetMapping("/getAllProducts") 
   public List<Product> getProductList(){ 
	   return productService.getAllProducts(); 
	   } 

}