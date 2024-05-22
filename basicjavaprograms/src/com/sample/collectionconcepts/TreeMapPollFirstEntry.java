package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Removes the First Key and value pair in the Map and displays the remaining mappings,
if the Map is empty it returns null.
TreeMap PollFirstEntry method is implemented from NavigableMap interface.
*/

public class TreeMapPollFirstEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> t=new TreeMap<String, String>();
		t.put("C", "Dennis Ritchie");
		t.put("C++", "Bjarne Stroustrup");
		t.put("Java", "James Gosling");
		System.out.println(t);
		
		t.pollFirstEntry();
		System.out.println(t);

	}

}
