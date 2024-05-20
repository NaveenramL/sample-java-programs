package com.sample.collectionconcepts;

import java.util.Hashtable;

public class HashTableGetOrDefault {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,String> hashTable=new Hashtable<String,String>(); 
		hashTable.put("Java", "James Gosling");
		hashTable.put("C", "Dennis Ritchie");
		hashTable.put("C++", "Bjarne Stroustrup");
		hashTable.put("Python", "Guido van Rossum");
		hashTable.put("Spring", "Rod Johnson");
		
		System.out.println(hashTable.getOrDefault("C", "No key Found"));  // Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
		System.out.println(hashTable.getOrDefault(".Net", "No key Found")); // Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key. 
	}

}
