package com.exception;

public class UserDefinedException {
	
	public static void validate(int age) throws Exception {
		
		if (age >= 18) {
			
			throw new Exception(" you are eligible to vote");
			
		} else { 
			
		System.out.println(" you are not eligible to vote");	
			
		}
		
	}

	public static void main(String[] args) throws Exception {
		
	validate(20);	
		
	}
	
}
