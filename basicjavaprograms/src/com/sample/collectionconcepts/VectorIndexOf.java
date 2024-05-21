package com.sample.collectionconcepts;

import java.util.Vector;

/*
IndexOf method returns the first occurrence of the index position of the specified element in the Vector.
Vector IndexOf method is implemented from List interface and overridden from AbstractList.  
*/

public class VectorIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> ve=new Vector<Integer>();
		   ve.add(10);
		   ve.add(20);
		   ve.add(30);
		   ve.add(40);
		   ve.add(50);
		   ve.add(10);
		   System.out.println("Vector ve : "+ve);

		int a=ve.indexOf(10);
		System.out.println("The indexOf element 10 in the Vector ve is : "+a);

	}

}
