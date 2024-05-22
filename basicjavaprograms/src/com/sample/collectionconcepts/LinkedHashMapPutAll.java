package com.sample.collectionconcepts;

import java.util.LinkedHashMap;

/*
PutAll method copies all of the mappings from the specified map to the given map.
LinkedHashSet PutAll method is implemented from Map interface and overridden from AbstractMap.
*/

public class LinkedHashMapPutAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, String> hm=new LinkedHashMap<String, String>();
		hm.put("Name", "Jack");
		hm.put("Age", "25");
		hm.put("Course","Java");
		hm.put("City", "Chennai");
		System.out.println(hm);
		
		LinkedHashMap<String, String> hm1=new LinkedHashMap<String, String>();
		hm1.putAll(hm);
	    System.out.println(hm1);

	}

}
