package com.sample.collectionconcepts;

import java.util.Stack;

/*
Push method pushes the given element to the top of the Stack.
*/

public class StackPush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>  s=new Stack<String>();
		s.add("Hibernate");
		s.add("MicroServices");
		s.add("Angular");
		s.add("HTML");
		s.add("CSS");
		System.out.println("Stack s before using push method is : "+s);
		
		s.push("Java");
		System.out.println("Stack s after using push method is : "+s);

	}

}
