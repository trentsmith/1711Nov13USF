package com.rev.run;

import java.util.Scanner;

import com.rev.pojos.User;
import com.rev.service.Service;

public class test {
	static Scanner scan = new Scanner(System.in);
	static Service service = new Service();
	public static void main(String[] args) {
		run();
	}

	static void run() {
		System.out.println("Welcome to Bank\nWould you like to Log in(1) or Create Account(2)");	
		String op = scan.nextLine();
		switch(op) {
		case "1":
			login();
			break;
		case "2":
			createAccount();
			run();
			break;
		default: run();
		}
	}
	
	// change return User to void
	static void login() {
		System.out.println("Please enter your username: ");
		String username = scan.nextLine();
		System.out.println("Please enter your password: ");
		String password = scan.nextLine();
		if(service.checkLogin(username, password)) {
			System.out.println("Hello " + service.welcomeUser(username));
			System.out.println("Would you like to view balance(1), deposit(2), or withdraw money(3)");
			String op = scan.nextLine();
			double money;
			switch(op) {
			case "1":
				System.out.println("You have $" + service.balance(username) + " in your account");
				promptUser(username);
			case "2":
				System.out.println("Please enter the amount you want to deposit: ");
				money = scan.nextDouble();
				System.out.println("Transcation completed!");
				System.out.println("You now have $" + service.deposit(username, money) + " in your account");
				promptUser(username);
			case "3":
				System.out.println("How much money do you want to withdraw?");
				money = scan.nextDouble();
				double balance = service.withdraw(username, money);
				if(balance == -1) {
					System.out.println("Insufficient funds!");
				} else {
					System.out.println("Transcation completed!");
					System.out.println("You now have $" + balance + " in your account");
				}
				promptUser(username);
			}
		} else {
			System.out.println("Invalid Credentials!");
			run();
		}
	}
	
	static void promptUser(String username) {
		System.out.println("Would you like to view balance(1), deposit(2), or withdraw money(3)");
		String op = scan.nextLine();
		double money;
		switch(op) {
		case "1":
			System.out.println("You have $" + service.balance(username) + " in your account");
			promptUser(username);
		case "2":
			System.out.println("Please enter the amount you want to deposit: ");
			money = scan.nextDouble();
			System.out.println("Transcation completed!");
			System.out.println("You now have $" + service.deposit(username, money) + " in your account!");
			promptUser(username);
		case "3":
			System.out.println("How much money do you want to withdraw?");
			money = scan.nextDouble();
			double balance = service.withdraw(username, money);
			if(balance == -1) {
				System.out.println("Insufficient funds!");
			} else {
				System.out.println("Transcation completed!");
				System.out.println("You now have $" + balance + " in your account!");
			}
			promptUser(username);
		}
	}
	
	static User createAccount() {
		System.out.println("Awesome! Welcome! Please Enter your first name: ");
		String firstname = scan.nextLine();
		System.out.println("Please Enter your last name: ");
		String lastname = scan.nextLine();
		System.out.println("Please Enter your username: ");
		String username = scan.nextLine();
//		while (!service.checkUsername(username)) {
//			System.out.println("Someone already has that username. Please enter a new one!");
//			username = scan.nextLine();
//		}
		System.out.println("Please Enter your password: ");
		String password = scan.nextLine();
		System.out.println("Please Enter your balance: ");
		double balance = scan.nextDouble();
		// auto-creating id
		int id = service.reportID() + 1;
		
		User u = new User(id, firstname, lastname, username, password, balance);
		service.addUser(u);
		return u;
	}
}
