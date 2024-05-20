package com.sample.collectionconcepts;

import java.util.Hashtable;

public class HashTableRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,String> hashTable=new Hashtable<String,String>(); 
		hashTable.put("Java", "James Gosling");
		hashTable.put("C", "Dennis Ritchie");
		hashTable.put("C++", "Bjarne Stroustrup");
		hashTable.put("Python", "Guido van Rossum");
		hashTable.put("Spring", "Rod Johnson");
		
		 System.out.println("Before Removing : "+hashTable);
		 hashTable.remove("Python"); // Removes the key (and its corresponding value) from this hash table.
		 System.out.println("After Remove : "+hashTable);
	}

}
