package com.sample.stringconcepts;

/*
Replaces the old characters in the string with the specified characters at the specified index position values.
Here the start index position value is inclusive and end index position value is exclusive.
*/

public class StringBufferReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("Welcome to Java");
		System.out.println(a);
		
		System.out.println(a.replace(11, 15, "Core Java"));

	}

}
