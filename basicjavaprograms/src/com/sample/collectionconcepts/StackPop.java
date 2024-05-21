package com.sample.collectionconcepts;

import java.util.Stack;

/*
Pop method removes and return the element at the top of the Stack. 
*/

public class StackPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> sk=new Stack<String>();
		   sk.add("Java");
		   sk.add("Candid");
		   sk.add("Spring");
		   sk.add("Maven");
		   sk.add("Methods");
		   System.out.println("Stack sk before using pop method is : "+sk);
		   
		   System.out.println(sk.pop());
		   System.out.println("Stack sk after using pop method is : "+sk);

	}

}
