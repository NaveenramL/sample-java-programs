package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Returns the least element in the TreeSet greater than or equal to the given element, 
or null if there is no such element.
TreeSet Ceiling method is implemented from NavigableSet Interface.
*/

public class TreeSetCeiling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> s=new TreeSet<Integer>();
		s.add(52);
		s.add(89);
		s.add(63);
		s.add(10);
		s.add(78);
		s.add(100);
		System.out.println(s);
		
		int a=s.ceiling(15);
		System.out.println(a);
		
		int b=s.ceiling(80);
		System.out.println(b);

	}

}
