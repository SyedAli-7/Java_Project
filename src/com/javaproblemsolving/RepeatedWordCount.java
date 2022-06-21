package com.javaproblemsolving;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordCount {

	public static void main(String[] args) {
		
		String s = "java to python ruby to java python to ruby";
		
		String[] sp = s.split(" ");
		
		Map<String, Integer> m = new HashMap<String, Integer>();
		///System.out.println(m);
		
		for(String str : sp) {
			
			if(m.containsKey(str)) {
				Integer i = m.get(str);
				m.put(str, i+1);
				
			}  else {
				
				m.put(str, 1); 
	
			}
			
//			System.out.println(m); // if we placed print statement here you will get only loop result not final result.
			
		}
		
		System.out.println(m); // if we placed print statement here you will get only final result without loop result.

	}

}
