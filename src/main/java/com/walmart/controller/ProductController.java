package com.walmart.controller;


import com.walmart.controller.GetMapping;
import com.walmart.controller.List;
import com.walmart.controller.RequestMapping;
import com.walmart.controller.RestController;
import com.walmart.model.Product;

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
	
@GetMapping
public String getProductDetailsById(int productId)
{
	
	String productDescription;
    ProductService productService = new ProductService();

    if(productId != null) {
    productDescription = productService.getProductDescription(productId);
    }else
    {
    	productDescription = "Check the Product ID";
    }
    
    return productDescription;
    
}
}