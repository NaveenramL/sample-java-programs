package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
ToArray returns an array containing all of the elements in the Linkedlist.
LinkedList ToArray method is implemented from collection interface and overridden from AbstractCollection.
*/

public class LinkedListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(19);
		a.add(61);
		a.add(1);
		a.add(82);
		a.add(134);
		a.add(178);
		System.out.println("LinkedList a :"+a);
		
		Object[] o=a.toArray();
		System.out.println("LinkedList a after using toArray method is :");
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}

	}

}
