package com.walmart.model;

public class Address {
	
	
  private String street;
  private String state;
  private String city;
  private String country;
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
