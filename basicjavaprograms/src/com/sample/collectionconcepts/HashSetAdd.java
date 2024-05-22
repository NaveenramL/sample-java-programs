package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Adds the specified element to the HashSet.
HashSet Add method is implemented from Collection interface and overridden from AbstractCollection.
*/

public class HashSetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs =new HashSet();
		hs.add(20);
		hs.add(74.10f);
		hs.add("Java");
		hs.add(90);
		hs.add(100);
		hs.add("Programs");
		
		System.out.println(hs);

	}

}
