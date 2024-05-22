package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Removes all of the elements from the LinkedHashSet.The set will be empty after calling this method.
LinkedHashSet clear method has been implemented from Collection interface and overridden from AbstractCollection.
LinkedHashSet Clear method has been inherited from class java.util.HashSet.
*/

public class LinkedHashSetClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("CSS");
		lhs.add("Angular");
		lhs.add('C');
		lhs.add(75);
		lhs.add(10.1234f);
		
		System.out.println(lhs);

	    lhs.clear();
	    System.out.println(lhs);

	}

}
