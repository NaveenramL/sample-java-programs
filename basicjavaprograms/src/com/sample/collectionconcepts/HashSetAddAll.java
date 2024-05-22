package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Adds all of the elements in the specified collection to the new collection in the HashSet.
HashSet AddAll method has been implemented from Collection interface.
*/

public class HashSetAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		
		System.out.println("HashSet hs= "+hs);
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.addAll(hs);
		
		System.out.println("HashSet hs1= "+hs1);

	}

}
