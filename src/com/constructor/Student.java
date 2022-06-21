package com.constructor;

public class Student {
	
	public Student() {
		
		System.out.println("Default constructor"); // non-parameterized constructor
		
	}
	
	public Student(String name) {
		
		System.out.println(name);
		
	}

	public static void main(String[] args) {
		
		Student obj1 = new Student();
		
		Student obj2 = new Student("String");
		
	}
	
}
