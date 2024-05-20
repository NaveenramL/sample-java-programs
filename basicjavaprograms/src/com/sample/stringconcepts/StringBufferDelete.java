package com.sample.stringconcepts;

/*
Removes the characters in the String between the specified start index and end index position values.
Here the start index position value is inclusive and end index position value is exclusive.
*/

public class StringBufferDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a= new StringBuffer("CoreJava");
		System.out.println(a);
		
		System.out.println(a.delete(0, 4));

	}

}
