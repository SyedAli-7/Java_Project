package com.javaproblemsolving;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		int num = sc.nextInt();
		
//		int num = 121;
		
		int org_num = num;
		
		int rev = 0;
		
		while(num != 0) {
			
			rev = rev * 10 + num % 10; // 0+1234%10=4  40+3=43 430+2=432 4320+1=4321
			num = num / 10;  //1234/10=123 123/10=12 12/10=1 1/10=0 ie num = 0 condition becomes true loop will stop.
			
		}
		
		//System.out.println(rev);
		
		if(org_num==rev) {
			
			System.out.println(org_num + " is Palindrome number ");
			
		} else {
			
			System.out.println(org_num + " is not a palindrome number ");
			
		}

	}

}
