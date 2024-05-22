package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

/*
Returns an array containing all of the elements in the LinkedHashSet.
LinkedHashSet ToArray method has been implemented from Collection interface.
LinkedHashSet ToArray method has been inherited from class java.util.AbstractCollection.
*/

public class LinkedHashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		 lh.add(77);
		 lh.add(99);
		 lh.add(355);
		 lh.add(790);
		 lh.add(890);
		 System.out.println(lh);
		 
		 Object []a=lh.toArray();
		 
		 for(int i=0;i<a.length;i++)
		 {
			 System.out.println(a[i]);
		 }

	}

}
