package com.sample.collectionconcepts;

import java.util.Vector;

/*
Contains method returns True if the Vector contains the specified element. Return type is boolean.
Returns true if the Vector contains the specified element, else returns false.
Vector Contains method is implemented from Collection interface and overridden from AbstractCollection. 
*/

public class VectorContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Vector<Integer> vr=new Vector<Integer>();
		    vr.add(25);
		    vr.add(55);
		    vr.add(45);
		    vr.add(75);
		    vr.add(97);
		    vr.add(1);
		    System.out.println("Vector vr : "+vr);
		    
		    boolean a=vr.contains(10);
		    System.out.println(a);
		    
		    boolean b=vr.contains(97);
		    System.out.println(b);

	}

}
