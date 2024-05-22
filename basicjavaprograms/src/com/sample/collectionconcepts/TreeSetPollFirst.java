package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Removes the First element in the set and displays the remaining elements in the Set,
if the set is empty it returns null.
TreeSet Pollfirst method is implemented from NavigableSet interface.
*/

public class TreeSetPollFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(93);
		ts.add(179);
		ts.add(87);
		ts.add(71);
		ts.add(267);
		ts.add(393);
		System.out.println(ts);
		
	    ts.pollFirst();
	    System.out.println(ts);

	}

}
