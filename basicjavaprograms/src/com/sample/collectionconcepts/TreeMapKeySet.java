package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
KeySet method returns the Set View of the Keys contained in the Map.
TreeMap KeySet method is implemented from Map interface and overridden from AbstractMap.
*/

public class TreeMapKeySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> a=new TreeMap<String, Integer>();
		a.put("One", 1);
		a.put("Two", 2);
		a.put("Ten",10);
		a.put( "Fifty",50);
		a.put("Six",6);
		System.out.println(a);
		
		System.out.println("The Key's are : "+a.keySet());

	}

}
