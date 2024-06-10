package com.walmart.model;

public class Staff {
	private int id;
	private String name;
	private String position;
	private String department;
	private double hours;
	private String email; 
	private String phoneNumber;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int newId)
	{
		id = newId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}

	public String getPosition()
	{
		return position;
	}
	
	public void setPosition(String newPosition)
	{
		position = newPosition;	
	}
	
	public String getDepartment()
	{ 
		return department;	
	}
	
	public void setDepartment(String newDepartment)
	{
		department = newDepartment;
	}
	
	public double getHours()
	{
		return hours;
	}
	
	public void setHours(double newHours)
	{
		hours = newHours;
	}
	
	public String getEmail()
	{
		return email; 
	}
	
	public void setEmail(String newEmail)
	{
		email = newEmail;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public void setPhoneNumber(String newPhoneNumber)
	{ 
		phoneNumber = newPhoneNumber;
	}
	
}

