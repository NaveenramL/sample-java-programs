package com.sample.abstractionconcept;

public class StudentImpl extends Student {
	
	public void displayDetails(String name, int age, float marks) {
		System.out.println("Printing the Student details : "+"name : "+name+","+" age : "+age+","+" marks : "+marks);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentImpl obj = new StudentImpl();
		obj.displayDetails("naveenram", 27, 81.77f);
		StudentImpl secondObj = new StudentImpl();
		secondObj.displayDetails("ram", 30, 87.94f);
		
		
		int result = obj.add(70, 140);
		System.out.println("Printing the result : "+result);
	}

}
