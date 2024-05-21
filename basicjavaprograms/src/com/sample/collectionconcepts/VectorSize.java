package com.sample.collectionconcepts;

import java.util.Vector;

/*
Size method returns the number of elements present in the Vector.
Vector Size method is implemented from Collection interface and overridden from AbstractCollection.
*/

public class VectorSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> vt=new Vector<Integer>();
	     vt.add(25);
	     vt.add(10);
	     vt.add(1);
	     vt.add(70);
	     vt.add(90);
	     vt.add(50);
	     System.out.println("Vector vt : "+vt);
	     
	     int a=vt.size();
	     System.out.println("The size of this Vector is "+a);

	}

}
