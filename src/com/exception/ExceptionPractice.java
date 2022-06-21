package com.exception;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		
		 // 1. Arithmetic exception
		
		 // int a = 6;
		
		 // int b = 2;
		
		 // System.out.println(a/b);
		
		// 2. Null pointer exception
		
		  // String s = null;
		
		  // int le = s.length();   // calling length()
		
		  // System.out.println(le);
		
		// 3. Input Mismatch exception	
		
	    // Scanner sc = new Scanner(System.in);
				
	    // System.out.println("Enter the number");
				
		// int num = sc.nextInt();
				
		// System.out.println("The number you entered is :- " + num);
		
		// 4. Array Index Out of Bounds exception
		
		  // int a[] = new int[4];
		
		   // a[0] = 1;
		
		   // a[1] = 2;
		
		   // a[2] = 3;
		
		   // a[3] = 4;
		
		   // a[4] = 5; // array index out of bounds
		
		   // for(int i=0; i<a.length; i++) {
			
	       // System.out.println(a[i]);
			
		   // }
		
		// 5. String index out of bounds exception
		
				// String s = "Syed";
				
				// char ca = s.charAt(2); // calling charAt()
				
				// System.out.println(ca);
		
		// 6. Index out of bounds exception
		
		   // List<Object> s1 = new ArrayList<Object>();
			
			 // s1.add(12);
			
			 // s1.add(1.4);
			
			 // s1.add("syed");
			
			 // s1.add('W');
			
			 // s1.add(3);
			
		   // System.out.println(s1);
		
           // Object ge = s1.get(3);
          
           // System.out.println(ge);
		
		// 7. Number format exception
		  
		    // String s = "1234syed";
		    
		    // int num = Integer.parseInt(s);
		  
		    // System.out.println("The converted integer is: " + num); 
		
	}

}
