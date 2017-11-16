package com.revature.hello;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Lab1 {
	
	public static void main(String[] args) {
	
		//Exercise 1
		isEven(5);
		
		//Exercise 2
		printPrimeElements(new ArrayList<Integer>());
		
		//Exercise 3
		isLess(3, 8);
		
		//Exercise 4
		switchCase(1);
		switchCase(2);
		switchCase(3);
		
		//Read text file
		readFile();
	}
	
    public static boolean isPrime(int x){
        for(int i = 2; i < x; i++){
            if(x%i == 0) return false;}
        return true;
    }
	
	public static boolean isEven(double x){
		boolean isEven = false;
		System.out.println("Checking number without using modulus..");
		if(x > 0){
			double num = x/2;
			int intNum = (int) Math.floor(num);
			double remainder = num - intNum;
			if(remainder == 0) isEven = true;
		}else{
			System.out.println("Please enter a number greater than zero");
		}
		System.out.println("The number " + (int)x + " is" + (!isEven ? " not " : " ") + "even" );
		System.out.println();
		return isEven;
	}
	
	public static void printPrimeElements(ArrayList<Integer> n){
		System.out.println("Printing all prime numbers from 1 to 100..");
		for(int i = 1; i <= 100; i++){
			n.add(i);
			if(isPrime(i)) System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static int isLess(int x, int y){
		int z;
		System.out.println("Finding greater number..");
		z = (x < y) ? x : y;
		System.out.println("The number " + z + " is less than " + ((z == x)?y:x));
		System.out.println();
		return z;
	}
	
	public static void switchCase(int x){
		switch(x){
			case 1: 
				int num;
				Random gen = new Random();
				num = gen.nextInt(100);
				System.out.println("The square root of " + num + " is " + Math.sqrt(num));
				break;
			case 2: 
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				Date date = new Date();
				System.out.println("Today's date is: " + dateFormat.format(date));
				break;
			case 3: 
				String s = "I am learning core Java";
				String[] sArray = s.split(" ");
				System.out.print("Split string: ");
				Arrays.stream(sArray).forEach(str -> System.out.print(str + ", "));
				System.out.println();
				break;
		}
		System.out.println();
	}
	
	public static void readFile(){
		String filename = "src/logs/data.txt";
		try(BufferedReader br = 
			new BufferedReader(
			new FileReader(filename))){
			String line = null;
			while((line=br.readLine()) != null){
				String[] data = line.split(":");
				Arrays.stream(data).forEach(d -> 
							System.out.print(d + ", "));
				System.out.println();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}	
}
