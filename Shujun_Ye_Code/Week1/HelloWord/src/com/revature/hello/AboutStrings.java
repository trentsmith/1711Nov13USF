package com.revature.hello;

public class AboutStrings {

	public static void main(String[] args) {
		// Create a String object a
		String a = "helle";
		System.out.println("Original a = " + a);
		
		// find the length of a
		int length = a.length();
		System.out.println("The length of a is " + a + ".");
		
		// replace all 'e' with 'o'
		a = a.replace('e', 'o');
		System.out.println("New a = " + a);
		
		// concat "w" after new a
		System.out.println(a.concat("w"));
		
		// make all letter Capital
		System.out.println(a.toUpperCase());		
	}
}
