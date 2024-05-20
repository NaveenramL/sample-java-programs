package com.sample.collectionconcepts;

import java.util.ArrayList;

/* Checks Whether the given element is present in the ArrayList or not. Return type is boolean. 
Returns true if the given element is present in the ArrayList, if not returns false.
ArrayList Contains method has been implemented from Collection Interface and overridden from AbstractCollection.
*/

public class ArrayListContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();

		al.add(23);
		al.add(47);
		al.add(72);
		al.add(10);
		al.add(7);
		al.add(92);
		al.add(58);
		al.add(69);
		al.add(92); 
		
		
		System.out.println(al);
		
		boolean a=al.contains(92);
		System.out.println(a);
		
		boolean b=al.contains(01);
		System.out.println(b);

	}

}
