package day4demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day4Warmup {

	static String filename = "src/day4demo/Data.txt";
	
	// Write a program to determine if an integer is even without using the modulus operator (%),
	// and write a jUnit test case 
	public boolean even (int num) {
		if (num == 0) {
			return true;
		}else {
			if (num == ((num / 2)*2)) return true;
		}	
		return false;
	}
	
	// Write a program that creates an ArrayList which stores numbers from 1 to 100 and prints out
	// all the prime numbers to the console.
	public static void printPrime() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			list.add(i+1);
		}
		
		for(int i = 0; i < list.size(); i++) {
			if(isPrime(list.get(i))) {
				System.out.print(list.get(i) + " ");
			}
		}
		System.out.println();
	}
	
	// check if the given number is prime
	public static boolean isPrime(int num) {
		if (num == 2) return true;
		if (num % 2 == 0) return false;
		for (int i = 3; i * i <= num; i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
	
	// Find the minimum of two numbers using ternary operators.
	public static int minTwoNums(int n1, int n2) {
		return (n1 > n2)? n2 : n1;
	}
	
	// Write a program that demonstrates the switch case.
	public static void switchDemo (int n) {
		switch(n) {
		case 1:
			double rand = Math.random();
			double sqrt = Math.sqrt(rand);
			System.out.println("The square root of " + rand + " is " + sqrt + ".");
			break;
		case 2:
			LocalDate todayDate = LocalDate.now();
			System.out.println("Today's date is " + todayDate + ".");
			break;
		case 3:
			String str = "I am learning Core Java";
			String[] strArr = str.split(" ");
			System.out.println(Arrays.toString(strArr));
			break;
		}
	}
	
	// Write a program that would read from the file and print it out to the screen.
	public static void printTxtData() {
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line = br.readLine();
			String[] str;
			
			while (line != null) {
				str = line.split(":");
				System.out.println("Name: " + str[0] + " " + str[1]);
				System.out.println("Age: " + str[2]);
				System.out.println("State: " + str[3] + " State");	
				line = br.readLine();
			}			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 

	// main method
	public static void main (String[] args) {
		printPrime();
		System.out.println("The minimum number of 4 and 90 is " + minTwoNums(4, 90) + ".");
		switchDemo(1);
		printTxtData();	
	}
}
