package com.revature.day2demo;

public class MyOperators {

	public static void main(String[] args) {
		
		//in order of operations
		
		
		//post-unary operators
		int x = 10;
		x++;
		System.out.println(x);
		x--;
		System.out.println(x);
		
		//pre
		++x;
		--x;
		
		//other unary
		int y = -x;
		y += x;
		int z = -4;
		//2's comp?
		System.out.println(z);
		
		//BINARY OPERATORS
		int test = 100/10%2*5;
		System.out.println(test);
		//equals 0;
		
		
		//bitwise
		int shift = 1 << 2;
		System.out.println(shift);//equals 4
		shift = 100 >>> 1;
		System.out.println(shift);//equals 4
		
		//relational ops < > <= >= instanceof
		
		//equals ==, !=
		
		//logical operator &, |, ^(XOR)
		
		//short circuit ops &&, ||
		
		//ternary ops  thing ? (Do if true) : (do if false)
		
		//assignment ops =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
		
		
		

	}

}
