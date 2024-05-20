package com.sample.stringconcepts;

/*
Compares this string to the specified object.Return type is boolean.
Returns True if the characters in the String are are same as in the specified object, if not returns false.
String Equals method has been overridden from Object.
*/

public class StringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  ="Chennai";
		String s1 ="chennai";
		String s2 ="Chennai";
		
		boolean a=s.equals(s1);
		System.out.println(a);
		
		boolean b=s.equals(s2);
		System.out.println(b);

	}

}
