package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Returns the Map in the reversed ordered view.
TreeMap DescendingMap method is implemented from NavigableMap interface.
*/

public class TreeMapDescendingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> m=new TreeMap<String, Integer>();
		m.put("C", 1);
		m.put("C++",2);
		m.put("Java", 10);
		m.put("Html",5);
		System.out.println(m);
		
		System.out.println(m.descendingMap());

	}

}
