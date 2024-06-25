package com.walmart.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {
	
	/*
	 * 
	 *  Collection interface
	 * 
	 *   List  -- arraylist , lionkedlist, stack  -- arrays 
	 *   Set  -- hashset, linkedhasset, treeset  -- wont have duplicates
	 *   Map  -- hashmap, linkedhashmpa, treemap  -- key value pair data
	 *   
	 *   java.util package 
	 *   
	 *   
	 *   
	 *   
	 * 
	 */
	
	public static void main(String[] args) {
		
		//List<datatype> dataList = new ArrayList<datatype>();
		//Map<key, value> userMap = new HashMap<key, value>();
		//Set<datattype> data = new HashMap<datattype>();
		
		//Time before process
		
		List<String> userList = new LinkedList<String>();
		
		
		userList.add("Maneesh");
		userList.add("Harish");
		userList.add("Karthik");
		userList.add("Sreedath");
		userList.add("Mythili");
		userList.add("Mythili");
		userList.add("Mythili");
		userList.add("Mythili");
		userList.add("Mythili");
		userList.add("Mythili");
		userList.add("Mythili");
		userList.add("Mythili");
		userList.add("Mythili");


		for(int i=0; i<userList.size(); i++){
			//String[] user;
			//System.out.println(userList.get(i));	
					//System.out.println(i);
			
			
		}
		
		// time after process
		//caliciute the difference
		
		for(String name: userList) {
			//System.out.println(name);
		}
		
		userList.forEach(u -> System.out.println(u));
		
		System.out.println("List completed ********* ");
		
		Set<String> userSet = new TreeSet<String>(userList);
		
		userSet.forEach(u -> System.out.println(u));

		Map<Integer, String> user =  new HashMap<Integer, String>();
		
		user.put(1, "Harish");
		
		
		
	}

}
