package com.revature.hello;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		String name = "Dean";
		System.out.println(name);
		
		int x = 5;
		Integer ex = new Integer(5);
		ex = x; // autoboxing
		
		Scanner scan = new Scanner(System.in);
		//String text = scan.nextLine();
		
		//System.out.println("Hello " + text);
		
		int var[][] = new int[2][3];
		
		for (int i : var[0])
			System.out.println(i);
	}
	
}