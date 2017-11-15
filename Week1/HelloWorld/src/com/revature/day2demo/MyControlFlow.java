package com.revature.day2demo;

import java.util.Scanner;

public class MyControlFlow {
	public static void main(String[] args) {
		
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
	
		if(x < 10) {
			System.out.println("hello");
		}
		else if (x < 100) {
			System.out.println("World");
		}
		else {
			System.out.println("goodbye");
		}
		
		//LOOPS
		boolean something = true;
		while(something) {
			System.out.println(something);
			something = !something;
		}
		
		//For-loop
		//for (  INIT  ;  CONDITIONAL  ;  UPDATE)
		  for ( int i = 20  ;  i < 20  ;  i+=5) {
			  System.out.println(i);
		  }
		/*
		 * order:
		 * 1 init executes
		 * 2 then checks cond (if false exit)
		 * 3 then execute body
		 * 4 then update
		 * GOTO 2
		 */
		  
		 //FOR EACH
		 //you can use a for in place of a for-each
		 //F-E allows you to iter over a collection w/o tracking index;
		 int[] nums = {1,2,3,4,5,6};
		 int s = 0;
		 for (int y : nums) {
			 s += y;
		 }
		 System.out.println(s);
		 
		//SWITCH
		int b = 2;
		switch(b) {//can switch 
		case 1:
			System.out.println("b is 1");
		
		case 5:
			System.out.println("b is 5");
			
		case 8: 
			System.out.println("b is 8");
		
		default:
			System.out.println("default");
		}
		
		Operations op = Operations.ADD;
		System.out.println(op.calculate(10, 10));
		
		  
	}
}
