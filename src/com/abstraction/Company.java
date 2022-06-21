package com.abstraction;

public class Company extends BackgroundVerification {

	public void aadhaarNumber() {
	
		System.out.println("ATI98765J");
		
	}

	public void panNumber() {
		
		super.panNumber();
		
	}

	public static void main(String[] args) {
		
		Company obj = new Company();
		
		obj.aadhaarNumber();
		
		obj.panNumber();
		
	}
}
