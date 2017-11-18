package com.rev.run;

import java.util.Scanner;

import com.rev.pojos.User;
import com.rev.service.Service;

public class RunBank {

	private static Service service = new Service(); 
	
	public static void main(String[] args) {
		
		run();
		
	}

	static void run() {

		System.out.println("Welcome to the Bank\nWould you like to login(1) or create an account(2)?");

		Scanner scan = new Scanner(System.in);
		String op = scan.nextLine();
		switch (op) {
		case "1":
		case "2":
			createAccount();
			break;
		default:
			run();
		}
	}

	static User login() {
		return null;
	}

	static User createAccount() {
		System.out.println("Welcome. PLease enter your first name");
		User u = new User();
		u.setFirstName("Gen");
		u.setLastName("Bonds");
		u.setUserName("uname");
		u.setPassword("12345");
		u.setBalance(1000000);
		service.addUser(u);
		return null;
	}

}
