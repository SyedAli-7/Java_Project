package com.stringtypes;

public class StringTypesPractice {
	
	public static void main(String[] args) {
		
		// Immutable string
		
		// String s1 = "Syed";
		
		// String s2 = "Syed";
		
		// System.out.println(System.identityHashCode(s1));
		
		// System.out.println(System.identityHashCode(s2));
		
	    // System.out.println(s1+s2);
		
		// System.out.println(System.identityHashCode(s1+s2));
		
		// mutable string --> String Buffer
		
		// StringBuffer s1 = new StringBuffer("Ali");

		// StringBuffer s2 = new StringBuffer("Ali");
		
		// System.out.println(System.identityHashCode(s1));
		
		// System.out.println(System.identityHashCode(s2));
		
		// System.out.println(s1.append(s2));
		
		// System.out.println(System.identityHashCode(s1.append(s2)));
		
		// mutable string --> String Buffer
		
		StringBuilder s1 = new StringBuilder("Dhoni");
		
		StringBuilder s2 = new StringBuilder("Dhoni");
		
		System.out.println(System.identityHashCode(s1));
		
		System.out.println(System.identityHashCode(s2));
		
		System.out.println(s1.append(s2));
		
		System.out.println(System.identityHashCode(s1.append(s2)));
		
	}

}
