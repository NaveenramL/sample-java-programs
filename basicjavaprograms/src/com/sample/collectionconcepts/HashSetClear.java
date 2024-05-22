package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Removes all of the elements from the HashSet.The set will be empty after calling this method.
HashSet clear method has been implemented from Collection interface and overridden from AbstractCollection. 
*/

public class HashSetClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("C");
		hs.add("C++");
		hs.add("Java");
		hs.add("Python");
		hs.add("Spring");
		hs.add("Hibernate");
		
		System.out.println(hs);

		hs.clear();
		System.out.println(hs);

	}

}
