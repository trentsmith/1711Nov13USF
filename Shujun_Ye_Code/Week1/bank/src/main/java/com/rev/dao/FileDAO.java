package com.rev.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.rev.pojos.User;

public class FileDAO implements DAO {

	String filename = "src/main/resources/bank.txt";
	
	// self
	public ArrayList<User> getAllUsers() {
		ArrayList<User> users = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line = br.readLine();
			String[] str;
			while (line != null) {
				str = line.split(":");
				users.add(new User(Integer.parseInt(str[0]), str[1], str[2], str[3], str[4], Double.parseDouble(str[5])));
				line = br.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return users;
	}
	
	public User addUser(User u) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))){
			// Should not be able to add users with a username that already exists
			// add logic to validate inside of service AKA business layer
			bw.write(u.toFile());
			return u;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public User getUser(String username) {
		ArrayList<User> users = getAllUsers();
		User user = null;
		for (User u : users) {
			if (u.getUsername().equals(username)) {
				user = u;
				return user;
			}
		}
		return null;
	}
	
	/**
	 * This method deposits money into User u, and updates the account
	 */
	public double depositMoney(User u, double money) {
		ArrayList<User> users = getAllUsers();
		User user = null;
		for (int i = 0; i < users.size(); i++) {
			user = users.get(i);
			if (user.getId() == u.getId()){
				user.setBalance(user.getBalance() + money);
				updateFile(users);
				return user.getBalance();
			}
		}
		updateFile(users);
		return -1;
	}
	
	/**
	 * This method withdraws money from User u, and updates the account
	 */
	public double withdrawMoney(User u, double money) {
		ArrayList<User> users = getAllUsers();
		User user = null;
		for (int i = 0; i < users.size(); i++) {
			user = users.get(i);
			if (user.getId() == u.getId()){
				user.setBalance(user.getBalance() - money);
				updateFile(users);
				return user.getBalance();
			}
		}
		updateFile(users);
		return -1;
	}
	
	/**
	 * This method updates Bank.txt.
	 */
	public void updateFile(ArrayList<User> users) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, false))){
			for(User u : users) {
				bw.write(u.toFile());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
