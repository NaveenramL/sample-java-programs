package com.sample.stringconcepts;

/*
Splits the string around matches of the given regular expression.
*/

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Int Float Long Double";
		String[] s=a.split(" ");
		
		for(String b:s)
		{
			System.out.println(b);
		}

	}

}
