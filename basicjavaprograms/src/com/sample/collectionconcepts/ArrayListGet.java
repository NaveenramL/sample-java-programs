package com.sample.collectionconcepts;

import java.util.ArrayList;

/*Get method returns the element at the specified index position from the ArrayList. 
ArrayList Get method has been implemented from List Interface.

*/

public class ArrayListGet {

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
		
		int a=al.get(3);
		System.out.println(a);
		
		int b=al.get(6);
		System.out.println(b);

	}

}
