package com.revature.hw.q5;

public class Substring {
	
	public static void main(String[] args) {
		// Test
		System.out.println(subStr("hello", 2));
	}
	
	// accepts a string str and an integer idx
	// and returns the substring contained between 0 and idx-1 inclusive
	public static String subStr(String str, int idx) {
		String result = "";
		for (int i = 0; i < idx; i++) {
			result += str.charAt(i);	
		}
		return result;
	}
}
