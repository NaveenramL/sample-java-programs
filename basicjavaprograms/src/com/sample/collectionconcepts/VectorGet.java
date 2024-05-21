package com.sample.collectionconcepts;

import java.util.Vector;

/*
Get method returns the element at the specified index position in the Vector.
Vector Get method is implemented from List interface.
*/

public class VectorGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<Integer> a=new Vector<Integer>();
	     a.add(10);
	     a.add(20);
	     a.add(40);
	     a.add(70);
	     a.add(30);
	     a.add(100);
	     System.out.println("Vector a : "+a);
	     
	     System.out.println("The element at index position 0 is : "+a.get(0));
	     System.out.println("The element at index position 5 is : "+a.get(5));

	}

}
