package com.keywords;

public class ThisChild extends SuperParent {
	
	int a = 7;
	
	public void num2() {
		
		System.out.println("Child Method");
		
		System.out.println(super.a);
		
	}
	
	
	
	public void num1() {
		
		this.num2();
		
		super.num1();
		
	}



	public static void main(String[] args) {
		
		ThisChild obj = new ThisChild();
		
		obj.num1();
		
	}

	
	
}
