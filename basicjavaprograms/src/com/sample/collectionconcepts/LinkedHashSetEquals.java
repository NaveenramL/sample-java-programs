package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Checks whether the two Sets are Equal or not. Return type is boolean.
Returns True if the two Sets contains equal number of elements and also the elements in the both Sets must be same,
if not returns false.
LinkedHashSet Equals method has been implemented from Collection interface and overridden from Object.
LinkedHashSet Equals method has been inherited from class java.util.AbstractSet.
*/

public class LinkedHashSetEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs=new LinkedHashSet<Integer>();
		hs.add(100);
		hs.add(199);
		hs.add(500);
		hs.add(900);
		hs.add(1000);
		
		LinkedHashSet<Integer> hs1=new LinkedHashSet<Integer>();
	      hs1.add(200);
	      hs1.add(50);
	      hs1.add(199);
	      hs1.add(900);
	      hs1.add(100);
	      
	  	LinkedHashSet<Integer> hs2=new LinkedHashSet<Integer>();   
	      hs2.add(1000);
	      hs2.add(100);
	      hs2.add(500);
	      hs2.add(199);
	      hs2.add(900);
	      
	      boolean a=hs.equals(hs1);
	      System.out.println(a);
	      
	      boolean b=hs.equals(hs2);
	      System.out.println(b);

	}

}
