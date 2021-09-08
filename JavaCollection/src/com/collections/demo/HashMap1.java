package com.collections.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");
	      System.out.println( map.entrySet());
	    for(Map.Entry<Integer,String> m:map.entrySet()){  
	    	   System.out.println(m.getKey()+" "+m.getValue());  
	    }   
	    	       map.entrySet()  
	    	      //Returns a sequential Stream with this collection as its source  
	    	      .stream()  
	    	      //Sorted according to the provided Comparator  
	    	      .sorted(Map.Entry.comparingByValue())  
	    	      //Performs an action for each element of this stream  
	    	      .forEach(System.out::println);  
	    	  }  
	     
	      }
	

