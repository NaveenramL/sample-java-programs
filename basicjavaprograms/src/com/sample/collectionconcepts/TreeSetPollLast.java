package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Removes the Last element in the set and displays the remaining elements in the Set,
if the set is empty it returns null.
TreeSet Polllast method is implemented from NavigableSet interface.
*/

public class TreeSetPollLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<String>();
		t.add("Filter");
		t.add("SQL");
		t.add("Beans");
		t.add("Dispatcher");
		t.add("MongoDB");
		t.add("Array");
		
		System.out.println(t);
	    t.pollLast();
	    System.out.println(t);

	}

}
