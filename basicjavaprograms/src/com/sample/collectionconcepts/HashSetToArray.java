package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Returns an array containing all of the elements in the HashSet.
HashSet ToArray method has been implemented from Collection interface.
*/

public class HashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(30);
		hs.add(50);
		hs.add(60);
		hs.add(80);
		hs.add(100);
		
		
		System.out.println(hs);
		
		Object[] a= hs.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
