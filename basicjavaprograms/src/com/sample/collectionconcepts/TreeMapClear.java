package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Removes all of the mappings from TreeMap.The Map will be Empty after calling this method.
TreeMap clear method has been implemented from Map interface and overridden from AbstractMap.  
*/

public class TreeMapClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("Course", "Java");
		tm.put("Name", "Candid");
		tm.put("Phone","9999");
		tm.put("City", "Chennai");
		System.out.println(tm);
		
		tm.clear();
		System.out.println(tm);

	}

}
