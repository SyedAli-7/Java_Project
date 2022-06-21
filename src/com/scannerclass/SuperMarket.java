package com.scannerclass;

import java.util.Scanner;

public class SuperMarket {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter your product name ");
		
		String name = sc.nextLine();
		
		System.out.println(" Your product name is " + name);

		System.out.println(" Enter your product price ");
		
		int price = sc.nextInt();
		
		System.out.println("Your product price is " + price);
		
		System.out.println("Enter your product weight ");
		
		float weight = sc.nextFloat();
		
		System.out.println("Your product weight is " + weight);
		
		System.out.println("Enter your product discount ");
		
		char discount = sc.next().charAt(2);
		
		System.out.println("Your product discound is " + discount);
		
		System.out.println(" Enter your product delievery address ");
		
		String address = sc.next();
		
		System.out.println("Your delievery address is " + address);
		
	}
	
	
}
