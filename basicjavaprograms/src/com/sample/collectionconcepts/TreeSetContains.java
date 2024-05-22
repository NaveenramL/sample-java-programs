package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Checks whether the given element is present in the TreeSet or not.Return type is boolean.
Returns true if the given element is present in the TreeSet, if not returns false.
TreeSet Contains method has been implemented from Collection interface and overridden from AbstractCollection.
*/

public class TreeSetContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Float> a=new TreeSet<Float>();
		a.add(12.14f);
		a.add(3.14566f);
		a.add(50.32498f);
		a.add(90.36f);
		a.add(75.75f);
		System.out.println(a);
		
		boolean t=a.contains(90.36f);
		System.out.println(t);
		
		boolean s=a.contains(12.12f);
		System.out.println(s);

	}

}
