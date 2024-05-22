package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Returns the Last (highest) element currently in the TreeSet.
TreeSet Last method is implemented from SortedSet Interface.
*/

public class TreeSetLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> s=new TreeSet<Integer>();
		s.add(200);
		s.add(95);
		s.add(168);
		s.add(356);
		s.add(700);
		System.out.println(s);
		
		int a=s.last();
		System.out.println(a);

	}

}
