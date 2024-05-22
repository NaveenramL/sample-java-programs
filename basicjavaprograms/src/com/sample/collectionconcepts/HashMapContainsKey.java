package com.sample.collectionconcepts;

import java.util.HashMap;

/*
Checks whether the given Key is contained in the HashMap or not.Return type is boolean.
Returns true if the given Key is present in the HashMap, if not returns false.
HashMap ContainsKey method has been implemented from Map interface and overridden from AbstractMap. 
*/

public class HashMapContainsKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Float> hm =new HashMap<String, Float>();
		 hm.put("One", 1.0f);
		 hm.put("Two",2.0f);
		 hm.put("Three", 3.0f);
		 
		 boolean a=hm.containsKey("One");
		 System.out.println(a);
		 
		 boolean b=hm.containsKey("one");
		 System.out.println(b);

	}

}
