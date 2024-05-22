package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Returns the number of elements present in the HashSet.
HashSet Size method has been implemented from Collection interface.
*/

public class HashSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(101);
		hs.add(102);
		hs.add(200);
		hs.add(250);
		
		int a=hs.size();
		System.out.println(a);

	}

}
