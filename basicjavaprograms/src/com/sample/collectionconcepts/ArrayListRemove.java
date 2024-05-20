package com.sample.collectionconcepts;

import java.util.ArrayList;

/*Removes the element corresponding to the specified index position from the ArrayList and shifts the remaining element
Left by One Position.
ArrayList Remove method is implemented from List interface and overridden from AbstractList.

*/

public class ArrayListRemove {

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
		
		al.remove(4);
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);

	}

}
