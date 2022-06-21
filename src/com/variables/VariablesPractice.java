package com.variables;

public class VariablesPractice {

	int a=7;
	
	public void localvariable() {
		
		int a = 9;
		
		System.out.println(a);
	}
	

    public static void main(String[] args) {
	
	VariablesPractice obj = new VariablesPractice();
	
    //  System.out.println(obj.a);	
	
    obj.localvariable();

    }

}
