package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Removes the Last Key and value pair in the Map and displays the remaining mappings,
if the Map is empty it returns null.
TreeMap PollLastEntry method is implemented from NavigableMap interface.
*/

public class TreeMapPollLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> tr=new TreeMap<String, Integer>();
		tr.put("Id", 1001);
		tr.put("Phone", 999999);
		tr.put("Pincode", 600001);
		System.out.println(tr);

	    tr.pollLastEntry();
	    System.out.println(tr);

	}

}
