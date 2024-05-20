package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
RemoveFirst method removes and return the First Element from the LinkedList.
LinkedList RemoveFirst method is implemented from Deque interface.
*/

public class LinkedListRemoveFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lt=new LinkedList<Integer>();
		lt.add(300);
		lt.add(599);
		lt.add(320);
		lt.add(188);
		lt.add(876);
		lt.add(677);
		System.out.println("LinkedList lt : "+lt);
		
	    System.out.println(lt.removeFirst());
	    System.out.println("LinkedList lt after using removeFirst method is : "+lt);

	}

}
