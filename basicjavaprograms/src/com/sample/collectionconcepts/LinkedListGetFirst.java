package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
GetFirst method returns the First element in the LinkedList.
LinkedList GetFirst method is implemented from Deque interface.
*/

public class LinkedListGetFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>	li=new LinkedList<Integer>();
	    li.add(34);
	    li.add(67);
	    li.add(93);
	    li.add(123);
	    li.add(10);
	    System.out.println("LinkedList li : "+li);
	    
	    System.out.println("The First element is "+li.getFirst());

	}

}
