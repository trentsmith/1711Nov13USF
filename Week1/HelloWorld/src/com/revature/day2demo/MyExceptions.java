package com.revature.day2demo;

import java.io.IOException;

public class MyExceptions {

	public static void main(String[] args) {
		
		int[] arr = new int [4];
		try {
				
				arr[0] = 1;
				arr[6] = 6;
				arr[2] = 2;
		}catch(ArithmeticException ae) {
			
			ae.printStackTrace();
			
			
		}finally{
		System.out.println(arr[2]);
		System.out.println("passed excpetion");
		}
		
		try {
			exampleException(6);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static void exampleException(int num) throws IOException{
		System.out.println("we are in an example exception method");
		throw new IOException();
	}
	
}