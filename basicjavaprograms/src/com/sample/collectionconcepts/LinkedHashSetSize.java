package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Returns the number of elements present in the LinkedHashSet.
LinkedHashSet Size method has been implemented from Collection interface.
LinkedHashSet Size method has been inherited from class java.util.HashSet.
*/

public class LinkedHashSetSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
	     lhs.add("Apache");
	     lhs.add("Maven");
	     lhs.add("Bootstrap");
	     lhs.add("JSON");
	     lhs.add("Gradle");
	     
	     System.out.println(lhs);
	     
	     int a=lhs.size();
	     System.out.println(a);

	}

}
