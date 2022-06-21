package com.polymorphism;

public class Customer2 extends Bank {

	public void customerName(String name) {
		
		super.customerName(name);
	}

	public void customerDetails(int age, String companyName, int salary) {
		
		super.customerDetails(age, companyName, salary);
	}

	public void cutomerLocation(String state, String city) {
		
		super.cutomerLocation(state, city);
	}
	
	public static void main(String[] args) {
		
		Customer2 obj2 = new Customer2();
		
		obj2.customerName("Vaja");
		
		obj2.customerDetails(22, "TCS", 20000);
		
		obj2.cutomerLocation("Tamil nadu", "Chennai");
		
	}

}
