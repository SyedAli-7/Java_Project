package com.abstraction;

public class People implements Mobile, Restaurant, Movie {

	public void vijaymovie() {
		
		System.out.println("Beast");
		
	}

	public void foodName() {
		
		System.out.println("Biryani");
		
	}

	public void model() {
		
		System.out.println("One Plus 7");
		
	}
	
	public static void main (String[] args) {
		
		People obj1 = new People();
		
		obj1.vijaymovie();
		
		obj1.foodName();
		
		obj1.model();
		
	}
	
}
