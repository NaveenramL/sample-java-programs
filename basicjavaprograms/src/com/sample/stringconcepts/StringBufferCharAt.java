package com.sample.stringconcepts;

/*
Returns the char value at the specified index position in the string.
StringBuffer charAt method has been implemented from Char Sequence interface.
*/

public class StringBufferCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("Java Programming");
		char b=a.charAt(3);
		System.out.println(b);
		
		char c=a.charAt(12);
		System.out.println(c);

	}

}
