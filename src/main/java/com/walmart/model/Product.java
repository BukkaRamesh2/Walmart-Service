package com.walmart.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productid;
	
	@Column(name = "name")
	 private String name;
	 
	@Column(name = "description")
	 private String description;
	 
	@Column(name = "price")
	 private float price;
	 
	@Column(name = "quantity")
	 private int quantity;

	@ManyToMany(mappedBy = "productList")
	@Transient
	List<Order> orderList;

	public void addOrder(Order order) {
		orderList.add(order);
	}

	public Long getProductid() {
		return productid;
	}
	public void setProductid(Long productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
