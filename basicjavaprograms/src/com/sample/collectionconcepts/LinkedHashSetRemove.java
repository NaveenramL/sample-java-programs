package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Removes the specified element from the LinkedHashSet and shifts the remaining element Left by One Position.
LinkedHashSet Remove method has been implemented from Collection interface and overridden from AbstractCollection.
LinkedHashSet Remove method has been inherited from class java.util.HashSet.  
*/

public class LinkedHashSetRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> a=new LinkedHashSet<String>();
	     a.add("Candid");
	     a.add("Java");
	     a.add("Angular");
	     a.add("Hibernate");
	     a.add("Inheritance");
	     
	     System.out.println(a);
	     
	     a.remove("Hibernate");
	     System.out.println(a);

	}

}
