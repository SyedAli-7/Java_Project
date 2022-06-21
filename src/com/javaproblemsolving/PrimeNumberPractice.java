package com.javaproblemsolving;

import java.util.Scanner;

public class PrimeNumberPractice {
	
	public static void main(String[] args) {
		
		// Prime number
		
		// 1 2 3 4 5 6 7
		   
	    // given number 7
		
		/* Number which is not divided by any other number apart from 1 & same number.*/
		
	    // 7%1 --> 0
		
		// 7%2 --> 1
		
		// 7%3 --> 1
		
		// 7%4 --> 3
		
		// 7%5 --> 2
		
		// 7%6 --> 1
		
		// 7%7 --> 0
		
		int n;
		
		int flag = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		n = sc.nextInt();
		
		for(int i=2; i<n; ++i) {
			
			int r =n%i;
			
			if(r==0) {
				
				flag = flag + 1;
				
			}
			
		}
			if (flag==0) {
				
				System.out.println(n + " " + "is a prime number");
				
			} else {
				
				System.out.println(n + " " + "is not a prime number");
				
			}
			
		}
			
	}
