package com.simplilearn.java.hello;

import java.util.ArrayList;
import java.util.List;

public class CompareBreads {

	public boolean hasSameBread(List<String> sand1, List<String> sand2) {

		return sand1.get(0).equals(sand2.get(0)) && 
				sand1.get(sand1.size()-1).equals(sand2.get(sand1.size()-1)) ;
	}

	public static void main(String[] args) {
		
		List<String> sandwich1 = new ArrayList<String>();
		List<String> sandwich2 = new ArrayList<String>();

	//	sandwich1.addAll(List.of("white bread", "lettuce", "cheese", "turkey", "white bread"));
	//	sandwich2.addAll(List.of("white bread", "lettuce", "cheese", "turkey", "white bread"));

//		sandwich1.addAll(List.of("white bread", "lettuce", "tomato",  "brown bread"));
//		sandwich2.addAll(List.of("white bread", "lettuce", "tomato",  "white bread"));
		
		sandwich1.addAll(List.of("rye bread", "lettuce", "cheese", "ham", "white bread"));
		sandwich2.addAll(List.of("white bread", "lettuce", "cheese", "ham", "white bread"));
		
		CompareBreads res = new CompareBreads();

		boolean result = res.hasSameBread(sandwich1, sandwich2);

		System.out.println(result);
	}

}
