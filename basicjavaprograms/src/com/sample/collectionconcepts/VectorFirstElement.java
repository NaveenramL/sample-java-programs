package com.sample.collectionconcepts;

import java.util.Vector;

/*
FirstElement method returns the First element present in the Vector.
*/

public class VectorFirstElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<Integer>();
		   v.add(50);
		   v.add(60);
		   v.add(90);
		   v.add(100);
		   v.add(1);
		   System.out.println("Vector v : "+v);
		   
		   System.out.println("The First Element in the Vector is "+v.firstElement());

	}

}
