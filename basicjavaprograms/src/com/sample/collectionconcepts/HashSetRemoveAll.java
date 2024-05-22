package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Removes all the elements from the HashSet.The Set will be empty after after calling this method.
HashSet RemoveAll method has been implemented from Collection interface and overridden from Abstract Collection.
*/

public class HashSetRemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> a=new HashSet<String>();
		a.add("Apache");
		a.add("Boolean");
		a.add("Char");
		a.add("Loop");
		a.add("Splendor");
		
		System.out.println(a);
		
		a.removeAll(a);
		System.out.println(a);

	}

}
