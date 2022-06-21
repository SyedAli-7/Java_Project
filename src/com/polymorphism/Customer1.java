package com.polymorphism;

public class Customer1 extends Bank {

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
		
		Customer1 obj1 = new Customer1();
		
		obj1.customerName("Thaseen");
		
		obj1.customerDetails(29, "CTS", 30000);
		
		obj1.cutomerLocation("Tamil nadu", "Chennai");
		
	}

}
