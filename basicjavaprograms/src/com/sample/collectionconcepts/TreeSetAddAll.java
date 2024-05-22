package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Adds all of the elements in the specified collection to the new collection in the TreeSet.
TreeSet AddAll method has been implemented from Collection interface.
*/

public class TreeSetAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Interface");
		ts.add("Inheritance");
		ts.add("Polymorphism");
		ts.add("Constructor");
		
		System.out.println(ts);
		
		TreeSet<String> ts1=new TreeSet<String>();
		ts1.add("Method");
		ts1.add("Abstract");
		ts1.addAll(ts);
		System.out.println(ts1);

	}

}
