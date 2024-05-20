package com.sample.collectionconcepts;

import java.util.LinkedList;

/*
RemoveLast method removes and will return the Last element from the LinkedList.
LinkedList RemoveLast method is implemented from Deque interface.
*/

public class LinkedListRemoveLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ld=new LinkedList<Integer>();
		ld.add(76);
		ld.add(15);
		ld.add(47);
		ld.add(89);
		ld.add(100);
		ld.add(133);
		System.out.println("LinkedList ld : "+ld);
		
		System.out.println(ld.removeLast());
		System.out.println("LinkedList ld after using removeLast method is : "+ld);

	}

}
