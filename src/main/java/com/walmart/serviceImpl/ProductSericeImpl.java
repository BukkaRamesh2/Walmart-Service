package com.walmart.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.exception.ProductNotFoundException;
import com.walmart.model.Product;
import com.walmart.repository.ProductRepository;
import com.walmart.service.ProductService;

@Service
public class ProductSericeImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;

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
	
	// method 1 with one parameter i.e. ID
	public Product getProductById(Long productId) {
		try {
			
			Optional<Product> product =  productRepo.findById(productId);
            if (product.isPresent()) {
                return product.get();
            } else {
                throw new ProductNotFoundException("Product with ID " + productId + " not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed");
        }
        return null;
    }

		
		// same method but different signature 
	public Product getProductById(Long productId, String name) throws RuntimeException{
		 Optional<Product> product =  productRepo.findById(productId);
	        if(product.isPresent()){
	            return product.get();
	        }else {
	            throw new RuntimeException();
	        }
	}
		
		

	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
	

}
