package com.polymorphism;

public class Methodoverloading {
	
	public void studentDetails(String name) {
		
		System.out.println(name);
		
	}
	
	public void StudentDetails(int age, char initial, float height) {
		
		System.out.println(age + " " + initial + " " + height);
	}
	
	public void StudentDetails(int m1, int m2, int m3) {
		
		System.out.println(m1 + " " + m2 + " " + m3);
		
	}
	
	public static void main(String[] args) {
		
		Methodoverloading obj = new Methodoverloading();
		
		obj.studentDetails("Syed");
		
		obj.StudentDetails(29, 'J', 5.9f);
		
		obj.StudentDetails(85, 90, 85);
		
	}

}
