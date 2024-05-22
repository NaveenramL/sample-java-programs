package com.sample.collectionconcepts;

import java.util.LinkedHashMap;

/*
Returns True if the map contains no Key-Value mappings, else return False.
Return type is boolean.
If the map contains no Key-Value mappings it returns true,if the map contains key-value pairs it returns false.
LinkedHashMap IsEmpty method is implemented from Map interface and overridden from AbstractMap.
LinkedHashMap IsEmpty method has been inherited from class java.util.HashMap.
*/

public class LinkedHashMapIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>();
		lhm.put(1, "C");
		lhm.put(2,"C++");
		lhm.put(3, "Java");
		lhm.put(4, "Angular");
		lhm.put(5, "Spring");
		
		
		
		LinkedHashMap<Integer, String> lhm1=new LinkedHashMap<Integer, String>();
	    
	    
	    boolean a=lhm.isEmpty();
	    System.out.println(a);
	    
	    boolean b=lhm1.isEmpty();
	    System.out.println(b);

	}

}
