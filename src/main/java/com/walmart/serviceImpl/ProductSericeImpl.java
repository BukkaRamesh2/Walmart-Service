package com.walmart.serviceImpl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walmart.exception.ProductException;
import com.walmart.model.Customer;
import com.walmart.model.Product;
import com.walmart.repository.ProductRepository;
import com.walmart.service.ProductService;

@Service
public class ProductSericeImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepo;
	
    private HashMap<Long, Product> productMap = new HashMap<>();


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
                throw new ProductException("Product with ID " + productId + " not found.");
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
		
		

	public Set<Product> getAllProducts() {
	    Set<Product> productSet = new HashSet<>();

	    //Convert list to set to avoid any duplicates
	    productSet = productRepo.findAll().stream().collect(Collectors.toSet());
		return productSet;
	}

	@Override
	public Product saveProduct(Product product) {
	   return productRepo.save(product);
	}
	
	public Product updateProduct(Product product, Long productId) {
		Product existingProduct = productRepo.findById(productId).get();//orElseThrow(() -> new RuntimeException());
		
		existingProduct.setName(product.getName());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setDescription(product.getDescription());

		productRepo.save(existingProduct);
	    return existingProduct;
	}

	public void deleteProduct(Long productId) {
		Optional<Product> product =  productRepo.findById(productId);//.orElseThrow(() -> new RuntimeException());
		if(product.get().getProductid() != null) {
			productRepo.deleteById(productId);
		} else {
			System.out.println("Product not found");
		}
		
	}

}
