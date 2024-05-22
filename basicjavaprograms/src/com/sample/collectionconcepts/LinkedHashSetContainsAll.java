package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Checks whether the given collection contains all the elements of the specified collection or not.
Return type is boolean.
Returns True if the given collection contains all the elements of the specified collection, if not returns False.
LinkedHashSet ContainsAll method has been implemented from Collection interface.
LinkedHashSet ContainsAll method has been inherited from class java.util.AbstractCollection. 
*/

public class LinkedHashSetContainsAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
	     ls.add(40);
	     ls.add(50);
	     ls.add(65);
	     ls.add(79);
	     System.out.println(ls);

	    LinkedHashSet<Integer> ls1=new LinkedHashSet<Integer>();
	     ls1.add(100);
	     ls1.add(40);
	     ls1.add(65);
	     ls1.add(50);
	     ls1.add(79);
	     System.out.println(ls1);
	     
	     LinkedHashSet<Integer> ls2=new LinkedHashSet<Integer>();
	      ls2.add(40);
	      ls2.add(79);
	      ls2.add(200);
	      ls2.add(50);
	     System.out.println(ls2);
	     
	     boolean a=ls1.containsAll(ls);
	     System.out.println(a);

	     boolean b=ls2.containsAll(ls);
	     System.out.println(b);

	}

}
