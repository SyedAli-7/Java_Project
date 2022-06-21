package com.polymorphism;

public class Student2 extends College {

	public void studentName(String name) {
		
		super.studentName(name);
	}

	public void studentDetails(int age, float height, String fathername) {
		
		super.studentDetails(age, height, fathername);
	}

	public void studentMarks(int tenthm, int twelthm) {
		
		super.studentMarks(tenthm, twelthm);
	}
	
	public static void main(String[] args) {
		
		Student2 obj2 = new Student2();
		
		obj2.studentName("Thousif");
		
		obj2.studentDetails(27, 5.8f, "Jeelani");
		
		obj2.studentMarks(360, 950);
		
	}
	
}
