package com.sample.collectionconcepts;

import java.util.TreeMap;

/*
Remove method removes the specified mapping of the specified key from the TreeMap.
TreeMap Remove method is implemented from Map interface and overridden from AbstractMap.
*/

public class TreeMapRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
	    tm.put(1, "C");
	    tm.put(2, "Java");
	    tm.put(3, "Angular");
	    tm.put(5, "Json");
	    tm.put(4, "JavaScript");
	    System.out.println(tm);
	    
	    tm.remove(1);
	    System.out.println(tm);

	}

}
