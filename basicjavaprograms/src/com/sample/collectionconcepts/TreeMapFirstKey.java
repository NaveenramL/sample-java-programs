package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Returns the First  key  in the given map.
TreeMap FirstKey method is implemented from SortedMap interface.
*/

public class TreeMapFirstKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> t=new TreeMap<String, Integer>();
		t.put("One", 1);
		t.put("Ten",10);
		t.put("Five", 5);
		t.put("Nine", 9);
		System.out.println(t);
		
		System.out.println("The First Key is : "+t.firstKey());

	}

}
