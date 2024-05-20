package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
Inserts the specified element at the Beginning of the LinkedList.
LinkedList AddFirst method is implemented from Deque interface. 
*/

public class LinkedListAddFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(59);
		l.add(79);
		l.add(10);
		l.add(91);
		l.add(87);
		l.add(178);
		System.out.println("LinkedList l : "+l);
		
		l.addFirst(100);
		System.out.println("LinkedList l after using  addFirst method is : "+l);

	}

}
