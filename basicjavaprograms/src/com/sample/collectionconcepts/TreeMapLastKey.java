package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
LastKey method returns the Last Key in the given Map.
TreeMap LastKey method is implemented SortedMap interface.
*/

public class TreeMapLastKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> a=new TreeMap<Integer, String>();
		a.put(1, "One");
		a.put(10, "Ten");
		a.put(5, "Five");
		a.put(100, "Hundred");
		a.put(7, "Seven");
		System.out.println(a);
		
		System.out.println("The Last Key is : "+a.lastKey());

	}

}
