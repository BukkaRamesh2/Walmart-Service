package com.walmart.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orderId")
    private Long orderId; //
	
	@Column(name = "customerId")
    private Long customerId;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "status")
    private String status;
	
    @Column(name = "date")
    private Date date;

	@ManyToMany
	private List<Product> productList = new ArrayList<>();

	public void addProduct(Product product) {
		productList.add(product);
	}




	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}




}
