package com.sample.stringconcepts;

/*
Checks whether the string ends with Specified Char.Return type is boolean.
Returns True if the String ends with specified char, if not returns false.
 
*/

public class StringEndsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Spring  Hibernate";
	    
		boolean b=a.endsWith("E");
		System.out.println(b);
		
		boolean c=a.endsWith("e");
		System.out.println(c);

	}

}
