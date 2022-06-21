package com.polymorphism;

public class Student1 extends College {

	public void studentName(String name) {
		
		super.studentName(name);
	}

	public void studentDetails(int age, float height, String fathername) {
		
		super.studentDetails(age, height, fathername);
	}

	public void studentMarks(int tenthm, int twelthm) {
		
		super.studentMarks(tenthm, twelthm);
	}
	
	public static void main(String[] args)
	
	{
		Student1 obj1 = new Student1();	
		
		obj1.studentName("Syed Ali");
		
		obj1.studentDetails(29, 5.9f, "Jaheer Hussain");
		
		obj1.studentMarks(375, 900);
		
	}
	
}