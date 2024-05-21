package com.sample.collectionconcepts;

import java.util.Vector;

/*
Set method replaces the element at the specified index position with the specified element in the Vector.
Vector Set method is implemented from List interface and overridden from AbstractList.
*/

public class VectorSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vc=new Vector<Integer>();
		   vc.add(1);
		   vc.add(5);
		   vc.add(40);
		   vc.add(2);
		   vc.add(90);
		   vc.add(99);
		   System.out.println("Vector vc before using set method is : "+vc);
		   
		   vc.set(5, 100);
		   System.out.println("Vector vc after using set method is : "+vc);

	}

}
