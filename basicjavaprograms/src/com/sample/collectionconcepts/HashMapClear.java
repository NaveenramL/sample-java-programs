package com.sample.collectionconcepts;

import java.util.HashMap;

/*
Removes all of the mappings from HashMap.The Map will be Empty after calling this method.
HashMap clear method has been implemented from Map interface and overridden from AbstractMap.  
*/

public class HashMapClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Name", "Kalam");
		hm.put("Course", "Java");
		hm.put("Phone", "9999999");
		hm.put("City", "Chennai");
		
		
	    System.out.println(hm);

	    hm.clear();
	    System.out.println(hm);

	}

}
