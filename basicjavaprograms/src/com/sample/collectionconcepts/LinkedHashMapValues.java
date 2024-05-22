package com.sample.collectionconcepts;

import java.util.LinkedHashMap;

/*
Returns a Collection View of Values contained in the map.
LinkedHashSet Values method is implemented from Map interface and overridden from HashMap.
*/

public class LinkedHashMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> lm=new LinkedHashMap<String, String>();
		lm.put("C","Dennis Ritchie" );
		lm.put("C++", "Bjarne Stroustrup");
		lm.put("Spring", "Rod Johnson");
		lm.put("Java","James Gosling");
		lm.put("Python","Guido van Rossum");
		System.out.println(lm);
		
	    System.out.println("The Values are : "+lm.values());

	}

}
