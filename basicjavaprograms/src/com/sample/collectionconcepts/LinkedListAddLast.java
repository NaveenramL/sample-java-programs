package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
Appends the specified element at the end of the LinkedList.
LinkedList AddLast method is implemented from Deque interface. 
*/

public class LinkedListAddLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>	list=new LinkedList<Integer>();
		list.add(100);
		list.add(56);
		list.add(77);
		list.add(49);
		list.add(181);
	    System.out.println("LinkedList ll : "+list);
	    
	    list.addLast(200);
	   System.out.println("LinkedList ll after using addLast method is : "+list);

	}

}
