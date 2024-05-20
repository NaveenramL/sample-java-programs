package com.sample.collectionconcepts;

import java.util.ArrayList;

/* Returns the number of elements present in the ArrayList.
ArrayList Size method is implemented from Collection interface.

*/

public class ArrayListSize {

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
		
		int a=al.size();
		System.out.println(a);

	}

}
