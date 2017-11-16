package day3demo;

import java.util.StringTokenizer;

public class Day3StringAssignment {

	public static void main(String[] args) {
		// Create a StringBuilder object and use three methods to manipulate the String.
		StringBuilder str = new StringBuilder("Asxiegnment");
		str.deleteCharAt(4);
		str.setCharAt(2, 's');
		str.append("s");
		System.out.println(str);
		
		// Create a new String with delimited tokens and use StringTokenizer to parse out
		// and print each token
		String delimit = "pickles:ketchup:mustard:onion";
		StringTokenizer tokenizer = new StringTokenizer(delimit, ":");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}

		// Create two String objects with number values
		// and print the sum of the two String objects
		String num1 = "30";
		String num2 = "11";
		System.out.println(addTwoNums(num1, num2));
		
		// Request garbage collection
		System.gc();
		
		// Create a Runtime object and note at least three methods
		Runtime run = Runtime.getRuntime();
		System.out.println("The amount of total memory in JVM is " + run.totalMemory() + ".");
		System.out.println("The amount of free memory in JVM is " + run.freeMemory() + ".");
		System.out.println("There are " + run.availableProcessors() + " available processors to the JVM.");
	}

	// addTwoNums adds two String objects and return the sum
	public static int addTwoNums(String num1, String num2) {
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		return (x + y);
	}
}
