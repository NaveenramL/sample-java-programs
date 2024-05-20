package com.sample.collectionconcepts;

import java.util.ArrayList;

/* Replaces the  element in the specified index position in the ArrayList with the given element.
ArrayList Set method is implemented from List interface and overridden from AbstractList.  
*/

public class ArrayListSet {

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
		
		al.set(0, 55);
		System.out.println(al);

	}

}
