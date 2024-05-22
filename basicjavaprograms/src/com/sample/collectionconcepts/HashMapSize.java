package com.sample.collectionconcepts;

import java.util.HashMap;

/*
Returns the number of Maps present in the HashMap.
HashMap Size method is implemented from Map interface and overridden from AbstractMap. 
*/

public class HashMapSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Float> hm=new HashMap<String, Float>();
		hm.put("One", 1.0f);
		hm.put("Two", 2.0f);
		hm.put("Three",3.0f);
		hm.put("Four", 4.0f);
		hm.put("Five", 5.0f);
		
		
		
		System.out.println(hm);
		
		int a=hm.size();
		System.out.println(a);

	}

}
