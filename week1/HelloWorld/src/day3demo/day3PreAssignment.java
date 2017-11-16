package day3demo;

import java.util.StringTokenizer;

public class day3PreAssignment {
	
	/*
	 * Create a StringBuilder object. Use at least three methods to manipulate the String.
Create a new String with delimited tokens, such as �pickles:ketchup:mustard:onion� and use StringTokenizer to parse out and print each token.
Create two String objects with number values (i.e. �20). Write a method that adds the two.
Request garbage collection in your method.
Create a Runtime object and note at least three methods. Imagine how you would use them.
	 */
	public static void main(String[] args){
		StringBuilder build= new StringBuilder("testing");
		build.append("test");
		build.reverse();
		build.deleteCharAt(0);
		
		String str="pickles:ketchup:mustard:onion";
		StringTokenizer tok=new StringTokenizer(str,":");
		int numTokens=tok.countTokens();
		while(tok.hasMoreTokens()){
	         System.out.println(tok.nextToken());
		}
		String num1="5465";
		String num2="68";
		int sum=addStrings(num1,num2);
		System.out.println("Two string numbers added:" + sum);
		
		Runtime rt=Runtime.getRuntime();
		
		//these methods could be used to keep track of the performance of the virtual machine
		System.out.println("max mem for JVM: "+rt.maxMemory());
		System.out.println("available processors for JVM: "+rt.availableProcessors());
		System.out.println("total me for JVM: "+rt.totalMemory());
	}
	
	static int addStrings(String n1, String n2){
		int sum = Integer.parseInt(n1)+Integer.parseInt(n2);
		System.gc();
		return sum;
	}
}
