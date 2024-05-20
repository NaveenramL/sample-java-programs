package com.sample.stringconcepts;

/*
StringBuilder IndexOf method returns the index position of First Occurrence of the specified char in the string,
starting at the specified index.
Return type is integer.
*/

public class StringBuilderIndexOfFromInex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("HashMap and HashSet");
		System.out.println(s);
		
		int a=s.indexOf("Hash", 4);
		System.out.println(a);

	}

}
