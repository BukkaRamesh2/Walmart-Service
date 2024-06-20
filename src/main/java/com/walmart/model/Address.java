package com.walmart.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long addressId;
	
	@Column(name = "street")
  private String street;
	
	@Column(name = "state")
  private String state;
	
	@Column(name = "city")
  private String city;
	
	@Column(name = "country")
  private String country;
	
	@Column(name = "zipcode")
  private Long zipcode;
	
	
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Long getZipcode() {
	return zipcode;
}
public void setZipcode(Long zipcode) {
	this.zipcode = zipcode;
}
  
  
  public void messgae() {
	  System.out.println("this messge is from address class");
  }
  
  

}
