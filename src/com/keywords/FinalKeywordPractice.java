package com.keywords;

public /*final*/ class FinalKeywordPractice {
	
	public /*final*/ void number()
	
	{
		System.out.println("One");
		
	}
	
	
	
	public static void main(String[] args) {
		
		/*final*/  int a = 5;
	
		 int b = 7;
		
		 a = b;
		
		 FinalKeywordPractice obj = new FinalKeywordPractice();
		
		 System.out.println(a);
		
		obj.number();
		
	}

}
