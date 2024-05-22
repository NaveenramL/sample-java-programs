package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Adds all of the elements in the specified collection to the new collection in the LinkedHashSet.
LinkedHashSet AddAll method has been implemented from Collection interface.
LinkedHashSet AddAll method has been inherited from class java.util.AbstractCollection.
*/

public class LinkedHashSetAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("Core Java");
		lh.add("Servlet");
		lh.add("HTML");
		lh.add("Database");
		lh.add("Spring");
		System.out.println("LinkedHashSet lh = "+lh);
		
		LinkedHashSet lh2=new LinkedHashSet();
		lh2.addAll(lh);
		System.out.println("LinkedHashSet lh2 = "+lh2);

	}

}
