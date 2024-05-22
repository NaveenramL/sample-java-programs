package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Removes the specified element from the HashSet and shifts the remaining element Left by One Position.
HashSet Remove method has been implemented from Collection interface and overridden from AbstractCollection. 
*/

public class HashSetRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs= new HashSet<Integer>();
		hs.add(1);
		hs.add(100);
		hs.add(400);
		hs.add(500);
		hs.add(900);
		hs.add(1000);
		
		System.out.println(hs);
		
		hs.remove(900);
		System.out.println(hs);

	}

}
