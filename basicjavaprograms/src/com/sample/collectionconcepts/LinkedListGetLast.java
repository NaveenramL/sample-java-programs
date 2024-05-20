package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
GetLast method returns the Last element in the LinkedList.
LinkedList GetLast method is implemented from Deque interface.
*/

public class LinkedListGetLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lt=new LinkedList<Integer>();
		lt.add(23);
		lt.add(45);
		lt.add(69);
		lt.add(98);
		lt.add(2);
		lt.add(70);
		System.out.println("LinkedList lt : "+lt);
		
		System.out.println("The Last element is "+lt.getLast());

	}

}
