package com.sample.collectionconcepts;

import java.util.Vector;

/*
Add method inserts the specified element at the specified index position in the Vector.
Vector Add method is implemented from the Collection interface and overridden from AbstractList.
*/

public class VectorAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> a=new Vector<String>();
		   a.add("MongoDB");
		   a.add("Table");
		   a.add("Records");
		   a.add("Update");
		   a.add("Delete");
		   System.out.println("Vector a before using add method : "+a);
		   
		   a.add(3, "Insert");
		   System.out.println("Vector a after using add method : "+a);

	}

}
