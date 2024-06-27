package com.walmart.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walmart.model.Customer;
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
   public Set<Product> getProductList(){ 
	   return productService.getAllProducts(); 
	   } 
   
   @PostMapping("/save")
   public ResponseEntity<Product> saveCustomer(@RequestBody Product product) {
		return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
	}
   
	@PutMapping("/updateProduct/{productId}")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, @PathVariable("id") Long productId) {
		return new ResponseEntity<Product>(productService.updateProduct(product, productId), HttpStatus.OK);
	}

	@DeleteMapping("/deleteProduct/{productId}")
	ResponseEntity<String> deleteProduct(@PathVariable("id") Long productId) {
		productService.deleteProduct(productId);
		return new ResponseEntity<String>("Product deleted Successfully.", HttpStatus.OK);

	}

}