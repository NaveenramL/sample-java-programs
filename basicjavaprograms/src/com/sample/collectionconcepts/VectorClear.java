package com.sample.collectionconcepts;

import java.util.Vector;

/*
Clear method removes all the elements from the Vector.
Vector Clear method is implemented from Collection interface and overridden from AbstractList. 
*/

public class VectorClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vt=new Vector<String>();
		   vt.add("Abstract");
		   vt.add("Interface");
		   vt.add("Static");
		   vt.add("Final");
		   System.out.println("Vector vt : "+vt);
		   
		   vt.clear();
		   System.out.println("Vector vt after using clear method : "+vt);

	}

}
