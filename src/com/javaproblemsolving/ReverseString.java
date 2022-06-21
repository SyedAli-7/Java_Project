package com.javaproblemsolving;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Wellcome to java";
        
        String reversedstring = " ";
		
		for(int i = s.length()-1; i>=0; i-- ) {
			
			reversedstring = reversedstring + s.charAt(i);
           
	}
		
		System.out.println("Reversed string is: " + reversedstring);
	
	}
	
}

