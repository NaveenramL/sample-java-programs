package com.sample.stringconcepts;

/*
Returns the char value at the specified index from the String.The index value of the First char in the string is 0.
The index value of the last char in the string is Length()-1.
In String the index value ranges from 0 to Length()-1.
String CharAt method has been implemented from CharSequence interface.
*/


public class StringCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Core Java";
		System.out.println(s);
		
		char c=s.charAt(3);
		System.out.println("Printing the char at position 3 is : "+c);
		
		char d=s.charAt(7);
		System.out.println("Printing the char at position 7 is : "+d);

	}

}
