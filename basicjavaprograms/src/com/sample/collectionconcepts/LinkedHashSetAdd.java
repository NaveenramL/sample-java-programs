package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Adds the specified element to the LinkedHashSet.
LinkedHashSet Add method is implemented from Collection interface and overridden from AbstractCollection.
LinkedHashSet Add method has been inherited from class java.util.HashSet.
*/

public class LinkedHashSetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet ls=new LinkedHashSet();

		ls.add(10);
		ls.add(100.0f);
		ls.add(90);
		ls.add('A');
		ls.add("Candid");
		ls.add("Java");

		System.out.println(ls);

	}

}
