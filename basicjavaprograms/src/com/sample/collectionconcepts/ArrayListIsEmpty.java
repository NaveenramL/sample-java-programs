package com.sample.collectionconcepts;

import java.util.ArrayList;

/*
Checks whether the ArrayList is Empty or Not. Returns True if the given ArrayList is Empty. 
 Returns False if the ArrayList contains elements.
 ArrayList ISEmpty method is implemented from Collection Interface and overridden from AbstractCollection.
 */

public class ArrayListIsEmpty {

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
		
		boolean b=al.isEmpty();
		System.out.println(b);
		
		
		ArrayList<Integer> bl=new ArrayList<Integer>();

		boolean c=bl.isEmpty();
		System.out.println(c);

	}

}
