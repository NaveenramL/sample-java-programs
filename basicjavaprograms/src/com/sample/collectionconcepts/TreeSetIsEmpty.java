package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Returns True if the Set contains no elements,if not returns False.
TreeSet IsEmpty method is implemented from Collection interface and overridden from AbstractCollection.
*/

public class TreeSetIsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> a=new TreeSet<String>();
		a.add("Server");
		a.add("Thread");
		a.add("Collections");
		a.add("String");
		a.add("File");
		System.out.println(a);
		
		TreeSet<String> b=new TreeSet<String>();
		System.out.println(b);
		
		boolean s=a.isEmpty();
		System.out.println(s);
		
		boolean t=b.isEmpty();
		System.out.println(t);

	}

}
