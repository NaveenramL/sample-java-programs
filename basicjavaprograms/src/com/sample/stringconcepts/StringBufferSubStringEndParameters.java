package com.sample.stringconcepts;

/*
Returns the Substring from the Main string between the specified index position values.
Here the start index position value is inclusive and end index position value is exclusive.
*/

public class StringBufferSubStringEndParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Java Development Kit");
		System.out.println(s);
		
		System.out.println(s.substring(0, 12));

	}

}
