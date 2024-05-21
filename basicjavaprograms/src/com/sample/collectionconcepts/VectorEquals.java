package com.sample.collectionconcepts;

import java.util.Vector;

/*
Checks whether the two Vectors are equal or not.Return type is boolean.
Returns true if two Vector contains equal number of elements and also the
elements in both the Vectors must be same,if not returns false.
Vector Equals method is implemented from Collection interface and overridden from AbstractList. 
*/

public class VectorEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> a=new Vector<Integer>();
	    a.add(100);
	    a.add(150);
	    a.add(200);
	    
	    Vector<Integer> b=new Vector<Integer>();
	    b.add(200);
	    b.add(10);
	    b.add(1);
	    
	    Vector<Integer> c=new Vector<Integer>();
	    c.add(200);
	    c.add(10);
	    c.add(1);
	    
	    boolean v=a.equals(b);
	    System.out.println(v);
	    
	    boolean v1=b.equals(c);
	    System.out.println(v1);

	}

}
