package com.walmart.serviceImpl;

import com.walmart.model.Staff;

public class StaffServiceImpl {
	
	public void assignDepartment(Staff staff)
		    throws Exception
		{
		    String department = staff.getDepartment();
		    
		    if (department.equals("Groceries"))
		    {
		        staff.setDepartment("Groceries"); 
		    }
		    else if (department.equals("Clothing"))
		    {
		        staff.setDepartment("Clothing");  
		    } 		
		    else if (department.equals("Electronics"))
		    {
		        staff.setDepartment("Electronics");
		    }
		    else if (department.equals("Sports"))
		    {
		    	staff.setDepartment("Sports");
		    }
		    else if (department.equals("Home"))
		    {
		    	staff.setDepartment("Home");
		    }
		    else if (department.equals("Beauty"))
		    {
		    	staff.setDepartment("Beauty");
		    }
		    else if (department.equals("Pharmacy"))
		    {
		        staff.setDepartment("Pharmacy");
		    }
		    else if (department.equals("Auto"))
		    {
		        staff.setDepartment("Auto");
		    }
		    else
		    {
		        throw new Exception("Invalid Department");
		    }
		}
	
	public void printPhoneNumber(Staff staff)
	{
		String phoneNum = "";
		
		try
		{
			phoneNum = staff.getPhoneNumber();
		}
		catch (NullPointerException e)
		{
			System.out.print("No Phone Number");
		}
		
		System.out.print(phoneNum);
	}

}
