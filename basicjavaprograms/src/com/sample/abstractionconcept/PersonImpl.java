package com.sample.abstractionconcept;

public class PersonImpl implements Person {
	
	public void printDetails(String name, int age, String city) {
		System.out.println("Printing the details : "+"name : "+name+","+" age : "+age+","+" city : "+city);
	}
	
	public String message(String message) {
		return message;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImpl obj = new PersonImpl();
		obj.printDetails("James Gosling", 69, "Canada");
		
		String output = obj.message("This is an example of abstraction using interface in java...");
		System.out.println("Printing the output  : "+output);
	}

}
