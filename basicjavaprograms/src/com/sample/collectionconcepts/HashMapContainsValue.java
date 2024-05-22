package com.sample.collectionconcepts;

import java.util.HashMap;

/*
Checks whether the given Value is contained in the HashMap or not.Return type is boolean.
Returns True if the given Value is present in the HashMap, if not returns false.
HashMap ContainsValue method has been implemented from Map interface and overridden from AbstractMap. 
 */

public class HashMapContainsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Age",23);
		hm.put("Pincode", 605602);
		hm.put("ID", 1001);

		System.out.println(hm);

	    boolean a=	hm.containsValue(1001);
		System.out.println(a);
		
		boolean b=hm.containsValue(10);
		System.out.println(b);

	}

}
