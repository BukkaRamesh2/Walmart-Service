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
		this.id = newId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		this.name = newName;
	}

}
