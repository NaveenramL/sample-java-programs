package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
Appends all of the elements in the specified collection at the end of this LinkedList.
LinkedList AddAll method has been implemented from Collection interface and overridden from AbstractCollection.
*/

public class LinkedListAddAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a=new LinkedList<String>();
		a.add("Java");
		a.add("Interface");
		a.add("Polymorphism");
		a.add("Spring");
		a.add("Inheritance");
		a.add("JDBC");
		System.out.println("LinkedList a : "+a);

		LinkedList<String> b=new LinkedList<String>();
		b.add("HTML");
		b.add("CSS");
		System.out.println("LinkedList b : "+b);
		b.addAll(a);
		System.out.println("LinkedList b after adding a : "+b);

	}

}
