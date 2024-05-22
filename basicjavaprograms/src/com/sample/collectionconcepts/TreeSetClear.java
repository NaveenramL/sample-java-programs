package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Removes all of the elements from the TreeSet.The set will be empty after calling this method.
TreeSet clear method has been implemented from Collection interface and overridden from AbstractCollection. 
*/

public class TreeSetClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
	       ts.add(100);
	       ts.add(85);
	       ts.add(12);
	       ts.add(256);
	       ts.add(69);
	       
	       System.out.println(ts);

	       ts.clear();
	       System.out.println(ts);

	}

}
