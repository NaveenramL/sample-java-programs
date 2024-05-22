package com.sample.collectionconcepts;

import java.util.LinkedHashMap;

/*
LinkedHashMap Get method returns the value to which the specified key is mapped,
else null if this map contains no mapping for the key.
LinkedHashMap Get method is implemented from Map interface and overridden from HashMap. 
*/

public class LinkedHashMapGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Float> lm=new LinkedHashMap<String, Float>();
		lm.put("One",1.0f);
		lm.put("Two", 2.0f);
		lm.put("Three", 3.0f);
		lm.put("Four", 4.0f);
		lm.put("Five", 5.0f);
		System.out.println(lm);
		
		float a=lm.get("Three");
		System.out.println(a);

	}

}
