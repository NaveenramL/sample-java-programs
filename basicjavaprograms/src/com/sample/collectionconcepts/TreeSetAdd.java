package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Adds the specified element to the TreeSet.
TreeSet Add method is implemented from Collection interface and overridden from AbstractCollection.
*/

public class TreeSetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<Integer>();
	    t.add(10);
	    t.add(256);
	    t.add(87);
	    t.add(167);
	    t.add(60);
	    
	    System.out.println(t);

	}

}
