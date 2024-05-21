package com.sample.collectionconcepts;

import java.util.Vector;

/*
Vector Capacity method returns the Current Capacity of the Vector.
*/

public class VectorCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		   v.add(1);
		   v.add(2);
		   v.add(3);
		   v.add(4);
		   v.add(5);
		   v.add(6);
		   System.out.println("Vector v : "+v);
		   
		   int a=v.capacity();
		   System.out.println("The Capacity of this Vector is  "+a);

	}

}
