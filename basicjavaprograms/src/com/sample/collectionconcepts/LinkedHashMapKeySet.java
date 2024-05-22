package com.sample.collectionconcepts;

import java.util.LinkedHashMap;
import java.util.Set;

/*
Returns the Set view of Values contained in the Map.
LinkedHashSet keySet method is implemented from Map interface and overridden from HashMap.
*/

public class LinkedHashMapKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> lm=new LinkedHashMap<String, Integer>();
		lm.put("One", 1);
		lm.put("Two", 2);
		lm.put("Three", 3);
		lm.put("Four", 4);
		lm.put("Five", 5);
		
		System.out.println(lm);
		
		Set keySet=lm.keySet();
		System.out.println("The Key's are : "+keySet);

	}

}
