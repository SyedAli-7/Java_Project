package com.stringfunction;

public class StringFunctionPractice {
	
	public static void main(String[] args) {
		
		 String s = "Welcome to Java";
		
		// 1.s.length()
		
		// int len = s.length();
		
		// System.out.println(len);
		
		// 2.s.equals() --> Case sensitive method
		
		// boolean eq = s.equals("Welcome to Java");
		
		// System.out.println(eq);
		
		// 3.s.equalsIgnoreCase() 
		
		// boolean eic = s.equalsIgnoreCase("Welcome to Java");
		
		// System.out.println(eic);
		
		// 4.s.toUpperCase()
		
		// String uc = s.toUpperCase();
		
		// System.out.println(uc);
		
		// 5.s.toLowerCase()
		
		// String lc = s.toLowerCase();
		
		// System.out.println(lc);
		
		// 6.s.startsWith() --> Case sensitive method
		
		// boolean sw = s.startsWith("Welcome");
		
		// System.out.println(sw);
		
		// 7.s.endsWith() --> Case sensitive method
		
		// boolean ew = s.endsWith("Java");
		
		// System.out.println(ew);
		
		// 8.s.contains() --> Case sensitive method
		
		// boolean con = s.contains("Welcome");
		
		// System.out.println(con);
		
		// 9.s.indexOf()
		
		// int io = s.indexOf("o");
		
		// System.out.println(io);
		
		// 10.s.lastIndexOf()
		
		// int lio = s.lastIndexOf("e");
		
		// System.out.println(lio);
		
		// 11.s.charAt()
		
		// char ca = s.charAt(14);
		
		// System.out.println(ca);
		
		// 12.s.replace()
		
		// String re = s.replace("Java", "Javascript");
		
		// System.out.println(re);
		
		// 14.s.isEmpty()
		
		// boolean em = s.isEmpty();
		
		// System.out.println(em);
		
		// 16.s.trim()
		
		//System.out.println(s);
		
		// String tr = s.trim();
		
		// System.out.println(tr);
		
		// 13.s.subString() --> substring is length based
		
		// CharSequence ss = s.subSequence(3, 13);
		
		// System.out.println(ss);
		
		// 15.s.split()
		
		 String[] sp = s.split("Java");
		
		 for (String x : sp) {
			
	     System.out.println(x);
		
		}
			
	}

}
