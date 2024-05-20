package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
Peek method retrieves the First element from the LinkedList.
LinkedList Peek method is implemented from Deque interface.
*/

public class LinkedListPeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(100);
		ls.add(189);
		ls.add(57);
		ls.add(76);
		ls.add(255);
		ls.add(164);
		System.out.println("LinkedList ls : "+ls);
		
		System.out.println("LinkedList ls after using peek method is : "+ls.peek());

	}

}
