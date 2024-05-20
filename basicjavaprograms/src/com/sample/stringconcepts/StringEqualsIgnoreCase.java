package com.sample.stringconcepts;

/*
Compares the String to the Specified string ignoring case considerations.Return type is boolean.
Returns True if the characters in the String are are same as in the specified object ignoring case, 
if not returns False. 
*/

public class StringEqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="NETWORKING";
		String b="networking";
		
		System.out.println(a.equalsIgnoreCase(b));
	}

}
