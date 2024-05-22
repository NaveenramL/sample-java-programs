package com.sample.collectionconcepts;

import java.util.HashSet;

/*
Checks whether the two Sets are Equal or not. Return type is boolean.
Returns True if the two Sets contains equal number of elements and also the elements in the both Sets must be same,
if not returns false.
HashSet Equals method has been implemented from Collection interface and overridden from Object.
*/

public class HashSetEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs =new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		HashSet<Integer> hs1=new HashSet<Integer>();
		hs1.add(50);
		hs1.add(70);
		hs1.add(80);
		hs1.add(90);
		
		boolean b=hs.equals(hs1);
		System.out.println(b);
		
		HashSet<Integer> hs2= new HashSet<Integer>();
		hs2.add(50);
		hs2.add(70);
		hs2.add(80);
		hs2.add(90);
		
		boolean c=hs1.equals(hs2);
		System.out.println(c);

	}

}
