package com.revature.day2demo;

public class MyConstructors {
	public MyConstructors() {};
	public MyConstructors(int x) {
		this.number = x;
	}
	public MyConstructors(char y) {	
		this.letter = y;
	}
	public MyConstructors(int x, char y) {
		this.letter = y;
		this.number = x;
	}
	
	public MyConstructors(boolean b) {
		this(1,'a');
		this.extra = b;
	}
	
	public MyConstructors(double d) {
		this.dubs = d;
	}
	
	public MyConstructors(char y, boolean x) {
		this(10d);
	}
	public double dubs;
	public int number;
	public char letter;
	public boolean extra;
	public static void main(String[] args) {
		MyConstructors c = new MyConstructors();
		MyConstructors d = new MyConstructors(4);
		MyConstructors e = new MyConstructors('b');
		MyConstructors f = new MyConstructors(4,'b');
	}
}
