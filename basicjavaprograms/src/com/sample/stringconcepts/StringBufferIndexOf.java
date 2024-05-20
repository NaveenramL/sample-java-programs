package com.sample.stringconcepts;

/*
Returns the index position of First Occurrence of the specified char in the string.Return type is integer.
*/

public class StringBufferIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer a=new StringBuffer("Core Java and Advanced Java");
		int b=a.indexOf("Java");
		System.out.println(b);
		
		int c=a.indexOf("a");
		System.out.println(c);

	}

}
