package com.revature.hello;
// import statements tell Java which packages to look in for classes
import java.util.Scanner;

public class HelloWorld {
	//comment
	/*
	 * block comment
	 */
	//ctrl+d to delete line
	//ctrl+space to show autocompletion options
	/*
	 * Every java program begins execution with its main method.
	 * A main() method is the gateway between the startup of a Java
	 * process, which is managed by the JVM, and the beginning of 
	 * the developer's code. 
	 */
	public static void main(String[] args) {
		
		String name = "Genesis Bonds";
		System.out.println(name);
		System.out.println(name.charAt(1));
		System.out.println(name.length());
		
		int x = 5;
		Integer ex = new Integer(5); //wrapper class. Integer:Class provided by java
		ex = x; //autoboxing primitive type to an object
		
		Scanner scan = new Scanner(System.in); // ctrl+shift+o imports any needed classes
		String text = scan.nextLine();
		
		System.out.println("Hello " + text);
		
		int y;
		
		int var[][] = new int[2][3];
		var[0][2] = 5;
		var[1][1] = 10;
		
		
	}

}
