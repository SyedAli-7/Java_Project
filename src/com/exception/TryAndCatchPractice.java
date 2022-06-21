package com.exception;

public class TryAndCatchPractice {

	public static void main(String[] args) {
		
	try {
		
		int a = 6;
		
		int b = 0;
		
		System.out.println(a/b);
		
	} catch (Exception e) {
		
		e.printStackTrace();
		
	}
	
	finally {
		
		System.out.println("It will run always for developer or tester reference");
		
	}
	
	System.out.println("Remaining code");
	
	int x = 6;
	
	int y = 2;
	
	System.out.println(x+y);
		
	}
	
}
