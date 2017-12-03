package com.revature.hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class UnderstandingArrays {
	public static void main(String[] args) {
		
		System.out.println("Enter numbers to parse: ");
		Scanner scan = new Scanner(System.in);
		String nums = scan.nextLine();
		ArrayList<Integer> numInts = new ArrayList<Integer>();
		
		Arrays.stream(nums.split(" "))
		  	  .forEach(n -> numInts.add(Integer.parseInt(n)));
		
		numInts.stream()
		       .forEach(System.out::println); 
		
		scan.close();
	}
}