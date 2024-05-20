package com.sample.stringconcepts;

/*
Checks whether the specified Char sequence is present in the String or not.Return type is boolean.
Returns True if the specified char sequence is contained in the String, if not returns false. 
*/

public class StringContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="JavaServer Pages";
		boolean a=s.contains("Ja");
		System.out.println(a);
		
		boolean b=s.contains("Y");
		System.out.println(b);

	}

}
