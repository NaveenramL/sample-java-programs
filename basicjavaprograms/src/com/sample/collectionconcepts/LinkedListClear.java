package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
LinkedList Clear method removes all the elements from the LinkedList.
LinkedList Clear method is implemented from Collection interface and overridden from AbstractList.
*/

public class LinkedListClear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> a=new LinkedList<Integer>();
		a.add(97);
		a.add(177);
		a.add(260);
		a.add(10);
		a.add(69);
		a.add(14);
		System.out.println("LinkedList a : "+a);
		
		a.clear();
		System.out.println("LinkedList a after using clear method is : "+a);

	}

}
