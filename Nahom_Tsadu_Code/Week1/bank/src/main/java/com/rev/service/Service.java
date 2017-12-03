package com.rev.service;

import java.util.ArrayList;

import com.rev.dao.FileDAO;
import com.rev.pojos.Account;
import com.rev.pojos.User;

public class Service {
	static FileDAO dao = new FileDAO();
	
	public User addUser(User u){
//		System.out.println(u.toString());
		ArrayList<User> userList = dao.getAllUsers();
		if(userList.isEmpty() || userList == null){
			//Set default ID for first User
			u.setId(100);
			return dao.addUser(u);
		}else{
			//Auto-Increment User ID
			u.setId((userList.get(userList.size()-1).getId()) + 1);
			return dao.addUser(u);
		}
	}
	
	public User getUser(String uname){
		return dao.getUser(uname);
	}
	
	public Account deposit(Account account, double amount){
		account.setBalance(Math.round((account.getBalance() + amount)*100)/100.0);
		return dao.deposit(account);
	}
	
	public Account withdraw(Account account, double amount){
		account.setBalance(Math.round((account.getBalance() - amount)*100)/100.0);
		return dao.withdraw(account);
	}
	
	public ArrayList<Account> getAccounts(User u){
		return dao.getAccountsByUserID(u.getId());
	}
	
	public Account createAccount(User u){
		return dao.createAccount(u.getId());
	}
}