package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Values method returns Collection view of the values contained in the Map.
TreeMap Values method is implemented from Map interface and overridden from AbstractMap.
*/

public class TreeMapValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Float> tp=new TreeMap<String, Float>();
	     tp.put("One", 1.0f);
	     tp.put("Two", 2.0f);
	     tp.put("Three", 3.0f);
	     tp.put("Four", 4.0f);
	     tp.put("Five", 5.0f);
	     System.out.println(tp);
	     
	     System.out.println(tp.values());

	}

}
