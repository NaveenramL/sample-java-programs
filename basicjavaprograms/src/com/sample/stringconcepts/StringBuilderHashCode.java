package com.sample.stringconcepts;

public class StringBuilderHashCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("Java");
		StringBuilder a=new StringBuilder("Java");
		StringBuilder b=new StringBuilder("Spring");
		
		int s1=s.hashCode();
		System.out.println(s1);
		
		int a1=a.hashCode();
		System.out.println(a1);
		
		int b1=b.hashCode();
		System.out.println(b1);

	}

}
