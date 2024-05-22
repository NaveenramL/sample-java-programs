package com.sample.collectionconcepts;

import java.util.TreeSet;

/*
Returns the First (lowest) element currently in the TreeSet.
TreeSet First method is implemented from SortedSet Interface.
*/

public class TreeSetFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> st=new TreeSet<String>();
		st.add("Method");
		st.add("Final");
		st.add("Static");
		st.add("TomCat");
	    st.add("Exception");
	    
	    System.out.println(st);

	    String a=st.first();
	    System.out.println(a);

	}

}
