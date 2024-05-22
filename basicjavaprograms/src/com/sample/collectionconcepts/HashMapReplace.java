package com.sample.collectionconcepts;

import java.util.HashMap;

/*
Replaces the Old value with the New value for the specified Key in the HashMap.
HashMap Replace method has been implemented from Map interface.
*/

public class HashMapReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Float> hm=new HashMap<String, Float>();
		hm.put("One", 1.0f);
		hm.put("Two", 2.0f);
		hm.put("Three",3.0f);
		hm.put("Four", 4.0f);
		hm.put("Five", 5.0f);
		
		System.out.println(hm);
		
		hm.replace("One", 1.0f, 10.0f);
		System.out.println(hm);

	}

}
