package com.revature.hello;

import java.util.Scanner;

public class HelloWorld {
	//this is a comment
	
	//below is a main method
	public static void main(String[] args) {
		
		String name = "Shujun Ye";
		System.out.println(name);
		
		int x = 5;
		Integer ex = new Integer(5); // wrapper class
		ex = x; // autoboxing
		
		Scanner scan = new Scanner(System.in);
		String text = scan.nextLine();
		
		System.out.println("Hello " + text);
	}
	
	/*
	 * this is a block comment aka multi-line comment
	 */
}
