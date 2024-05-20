package com.sample.stringconcepts;

/*
Returns the index position of the Last Occurrence of the specified char in the String.
Return type is integer.
*/

public class StringBufferLastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("Full Stack Developer");
		int b=a.lastIndexOf("l");
		System.out.println(b);
		
		int c=a.lastIndexOf("e");
		System.out.println(c);

	}

}
