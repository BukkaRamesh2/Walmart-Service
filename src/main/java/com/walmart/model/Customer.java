package com.walmart.model;

public class Customer extends Address{
	
	private Long customerId;
	private String firstName;   // access specifier datatype name 
	private String lastName;
	private String email;
	private Long phoneNumber;
	private int age;
	protected String password;
	//private String address;
	private boolean status;
	
	private Address address; // has a relationship  // aggrregation 
	
	/*
	 * 
	 *   
	 *   access specifiers 
	 *   
	 *   
	 *   public  -- the scope will be entire project level
	 *   private  -- varibale scope will be only inside the class you cant access it from out side the class 
	 *   protected  -- the scope will be entire package level 
	 *   default -- 
	 *   
	 *   
	 *   data types
	 *   
	 *   
	 *   char -- i.e., a single character can be assigned to the variable
	 *   integer  -- you can assign numbers to it
	 *   float -- you can assign decimal values to float
	 *   long  -- you can assign same numbers but the memory is more 
	 *   double -- it accespts the decimal values but memory wil;l be more  
	 *   boolean -- true / false 
	 *   string  -- combination of characters
	 *   
	 *   
	 *   decision making statments 
	 *   
	 *   loops 
	 *   control statments 
	 *   
	 *   
	 *   OOPS 
	 *   Exception handling 
	 *   
	 *   Inheritance --  extends, aggretaion 
	 *   polymorphism --- method overloading , method overriding 
	 *   
	 *   
	 *   checked exceptions  -- 
	 *   unchecked exceptions -- 
	 *   
	 *   
	 *   try{
	 *      // business logic 
	 *   } catch(Exception e){
	 *      e.p
	 *      
	 *   }
	 *   
	 *   throw  // always used inside catch block
	 *   throws  // always used followed by your method signiture
	 *   finally  // block of code we write what ever exception the filany block will exeute by dafault 
	 *   
	 *   customer exceptions
	 *    
	 */
	 
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getCustomerId() {
		return customerId;
	}
	
	
	 
	public void messgae() {
		  System.out.println("this messge is from customner class");
	  }
	  
	
	
	

}
