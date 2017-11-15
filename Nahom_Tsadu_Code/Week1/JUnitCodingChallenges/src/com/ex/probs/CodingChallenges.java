package com.ex.probs;

public class CodingChallenges {
	
	public int factorial(int n){
		if(n == 0){return 0;}
		else if((n-1)>0){
			n = n*factorial(n-1);
			return n;
		}else{
			return 1;
		}
	}
	
	public String reverse(String s){
		char[] cArr = new char[s.length()];
		for(int i = s.length()-1; i >= 0; i--) cArr[s.length()-(i+1)] = s.charAt(i);
		return new String(cArr);
	}

}
