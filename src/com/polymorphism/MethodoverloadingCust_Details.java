package com.polymorphism;

public class MethodoverloadingCust_Details {
	
	public void customerDetails(String customername) {
		
		System.out.println(customername);
		
	}
	
	public void customerDetails(int age, String branch, long currentbalance) {
		
		System.out.println(age + " " + branch + " " + currentbalance);
	}
	
	public void customerDetails(int accountnumber, int depositamount, int counternumber) {
		
		System.out.println(accountnumber + " " + depositamount + " " + counternumber);
		
	}
	
	public static void main(String[] args) {
		
		MethodoverloadingCust_Details obj = new MethodoverloadingCust_Details();
		
		obj.customerDetails("Dhoni");
		
		obj.customerDetails(40, "TNagar", 500000000L);
		
		obj.customerDetails(77778653, 75000, 24);
				
	}

}
