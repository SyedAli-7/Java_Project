package com.javaproblemsolving;

public class TrianglePractice { 
	
	public static void main(String[] args) {
		
		System.out.println(" Triangle ");
		
		System.out.println();
		
		for(int i=1; i<=5; i++) {
			
			for(int j=5; j>i; j--) {
				
				System.out.print(" ");
				
			}
			
			for(int j=1; j<=i; j++) {
				
				System.out.print("* ");
				
			 }
			
			System.out.println();
					
		}
		
	}

}
