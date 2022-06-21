package com.variables;

public class StaticVariable {

	int b = 7;
	
	static int c = 9;
	
	public void localVariable() {
		
		int a = 10;
		
		System.out.println(a);
		
	}
	
	public static void number() {
		
		System.out.println("Static Method");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(c);
		
		number();
		
	}
	
}
