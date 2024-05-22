package com.sample.collectionconcepts;

import java.util.LinkedHashMap;

/*
Checks whether the two maps are Equal or not. Return type is boolean.
 Returns True if the two maps contains equal number of key and value pairs and also the key and value pair of both the maps must 
 be same, if not returns false.
 LinkedHashMap Equals method has been implemented from Map interface and overridden from Object.
 LinkedHashMap Equals method has been inherited from class java.util.AbstractMap.
*/

public class LinkedHashMapEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();
		lh.put(1,"One");
		lh.put(2, "Two");
		lh.put(3, "Three");
		lh.put(4, "Four");
		lh.put(5, "Five");
		
		LinkedHashMap<Integer, String> lh1=new LinkedHashMap<Integer, String>();	
		lh1.put(11, "Eleven");
		lh1.put(3,"Three");
		lh1.put(100, "Hundred");
		lh1.put(5,"Five");
		lh1.put(50, "Fifty");
		
		LinkedHashMap<Integer, String> lh2=new LinkedHashMap<Integer, String>();
		lh2.put(1,"One");
		lh2.put(2, "Two");
		lh2.put(3, "Three");
		lh2.put(4, "Four");
		lh2.put(5, "Five");

		boolean a=lh.equals(lh1);
		System.out.println(a);
		
		boolean b=lh.equals(lh2);
		System.out.println(b);

	}

}
