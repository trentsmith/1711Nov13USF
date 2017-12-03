package com.rev.dao;

import java.util.ArrayList;

import com.rev.pojos.Account;
import com.rev.pojos.User;

//DAO = Data Access Object
public interface DAO {
	User addUser(User u);
	User getUser(String username);
	ArrayList<User> getAllUsers();
	Account deposit(Account a);
	Account withdraw(Account a);
}