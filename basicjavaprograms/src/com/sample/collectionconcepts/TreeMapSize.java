package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Size Method returns the number of Maps present in the TreeMap.
TreeMap Size method is implemented from Map interface and overridden from AbstractMap. 
*/

public class TreeMapSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> mp=new TreeMap<String, String>();
		mp.put("Name", "Candid");
		mp.put("Course", "Angular");
		mp.put("City", "Chennai");
		
		System.out.println(mp);
		
	    int a=mp.size();
	    System.out.println("The Size of this TreeMap is : "+a);

	}

}
