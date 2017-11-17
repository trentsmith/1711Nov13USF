package com.revature.hw.q2;

// Display the first 25 Fibonacci numbers beginning at 0.
public class FibonacciNum {
	
	public static void main(String[] args) {
		fibonacci(25);	
	}
	
	public static void fibonacci(int n) {
		int[] arr = new int[n];
		
		if (n == 1) {
			arr[0] = 1;
		} else if (n == 2) {
			arr[0] = 1;
			arr[1] = 1;
		} else {
			arr[0] = 1;
			arr[1] = 1;
			for (int i = 2; i < n; i++) {
				arr[i] = arr[i-2] + arr[i-1];
			}
		}
		
		// print Fibonacci numbers
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
