package com.javaproblemsolving;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	
		String reverse = " ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to reverse: ");
		
		String initial = sc.nextLine();
		
		int length = initial.length();
		
		for(int i = length-1; i>=0; i--) {
			
			reverse  = reverse + initial.charAt(i);
			
		}
		
		System.out.println("Reverse string" + reverse);
		
	}

}
