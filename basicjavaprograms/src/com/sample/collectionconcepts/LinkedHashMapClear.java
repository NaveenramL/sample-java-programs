package com.sample.collectionconcepts;

import java.util.LinkedHashMap;

/*
Removes all of the mappings from LinkedHashMap.The Map will be Empty after calling this method.
LinkedHashMap clear method has been implemented from Map interface and overridden from HashMap.  
*/

public class LinkedHashMapClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Integer> lh=new LinkedHashMap<String, Integer>();
		lh.put("One", 1);
		lh.put("Two", 2);
		lh.put("Three",3);
		lh.put("Four", 4);
		lh.put("Five", 5);
		
		System.out.println(lh);
		lh.clear();
		System.out.println(lh);

	}

}
