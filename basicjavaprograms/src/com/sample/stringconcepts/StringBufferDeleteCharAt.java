package com.sample.stringconcepts;

/*
Removes the char at the specified index from the string.
*/

public class StringBufferDeleteCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("Welcome To Java Programs");
	    System.out.println(s);
		
	    System.out.println(s.deleteCharAt(23));
		
	    System.out.println(s.deleteCharAt(6));

	}

}
