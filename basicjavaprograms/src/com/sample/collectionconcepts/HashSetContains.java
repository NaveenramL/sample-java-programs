package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Checks whether the given element is present in the HashSet or not.Return type is boolean.
Returns true if the given element is present in the HashSet, if not returns false.
HashSet Contains method has been implemented from Collection interface and overridden from AbstractCollection.
*/

public class HashSetContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs =new HashSet<Integer>();
		hs.add(25);
		hs.add(55);
		hs.add(70);
		hs.add(80);
		hs.add(120);
		hs.add(200);
		hs.add(290);
		
		System.out.println(hs);
		
		boolean a=hs.contains(120);
		System.out.println(a);
		
		boolean c=hs.contains(75);
		System.out.println(c);

	}

}
