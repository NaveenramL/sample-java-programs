package com.sample.stringconcepts;

/*
StringBuilder Replace method Replaces the old characters in the string 
with the specified characters at the specified index position values.
 Here the start index position value is inclusive and end index position value is exclusive.
*/

public class StringBuilderReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("StringBuffer");
		System.out.println(s);
		
		s.replace(6, 12, "Builder");
		System.out.println(s);

	}

}
