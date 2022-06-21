package com.javaproblemsolving;

public class Problemsolving {
	
	public static void main(String[] args) {
		
		int a = 5; // 1 0 1
		
		int b = 4; // 1 0 0
		
		// Program for Swap the number
		
		// int c;
		
		// Logic 1
		
		// c = a;
		
		// a = b;
		
		// b = c;
		
		// Logic 2
		
		// a = a + b;
		
		// b = a - b;
		
		// a = a - b;
		
		// Logic 3
		
		// 1,1 -> 0, 1,0 -> 1, 0,0 -> 0, 0,1 -> 1
		
		// a = a^b; // 1 0 1 ^ 1 0 0 --> 0 0 1
		
		// b = a^b; // 0 0 1 ^ 1 0 0 --> 1 0 1
		
		// a = a^b; // 0 0 1 ^ 1 0 1 --> 1 0 0
		
		System.out.println(" a = " + a);
		
		System.out.println(" b = " + b);
	}

}
