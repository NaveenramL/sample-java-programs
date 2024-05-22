package com.sample.collectionconcepts;

import java.util.HashMap;

/*
Returns the HashCode of the HashMap. The hash code of a map is defined to be the sum of the hash codes 
of each entry in the map's entrySet() view.
HashMap HashCode method has been implemented from Map interface and overridden from Object. 
*/

public class HashMapHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("One", 1);
		hm.put("Two",2);
		hm.put("Three", 3);
		
		System.out.println(hm);
		
	    int a=hm.hashCode();
		System.out.println("HashCode of this HashMap is "+a);

	}

}
