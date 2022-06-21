package com.typecasting;

public class Child extends Parent {
	
	public void childMethod() {
		
		System.out.println("Child Method");
		
	}
	
	public static void main(String[] args) {
		
		// Child obj2 = new Child();
		
		// obj2.childMethod();
		
		// obj2.parentMethod();
		
		Parent obj1 = new Child(); // upcasting
		
		obj1.parentMethod();
		
		// Child obj2 = new Parent(); // downcasting
		
	}

}
