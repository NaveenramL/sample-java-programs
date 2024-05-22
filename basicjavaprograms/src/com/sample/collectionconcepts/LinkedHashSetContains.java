package com.sample.collectionconcepts;

import java.util.LinkedHashSet;

public class LinkedHashSetContains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
	    lh.add(10);
	    lh.add(20);
	    lh.add(50);
	    lh.add(90);
	    lh.add(190);
	    
	    System.out.println(lh);
	    
	    boolean a=lh.contains(90);
	    System.out.println(a);
	    
	    boolean b=lh.contains(99);
	    System.out.println(b);

	}

}
