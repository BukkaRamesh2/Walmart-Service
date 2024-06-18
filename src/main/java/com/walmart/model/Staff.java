package com.walmart.model;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
	
	public void makeList(Staff[] array)
	{
		Staff[] newArray = Arrays.copyOf(array, array.length);
		List<Staff> staff = new ArrayList<>();
		
		for (int i = 0; i < newArray.length; i++)
		{
			if (newArray[i] != null)
			{
				staff.add(newArray[i]);
				newArray[i] = null;
			}
		}
	}
}


