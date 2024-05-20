package com.sample.collectionconcepts;

import java.util.ArrayList;

/*
Returns the Index Position of First occurrence of the given element from the ArrayList.
Returns -1 if the given element is not in the ArrayList. 
 ArrayList IndexOf method is implemented from List interface and overridden from AbstractList.
 */

public class ArrayListIndexOf {

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
		
		int a=al.indexOf(72);
		System.out.println(a);
		
		int b=al.indexOf(1);
		System.out.println(b);

	}

}
