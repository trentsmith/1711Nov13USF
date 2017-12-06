package com.reimb.dao;
//import java.util.ArrayList;
//import java.util.HashMap;

//import com.reimb.pojos.Reimburse;
import com.reimb.pojos.User;

public interface DAO {
	

	public User getUserById(int id); // out: user in : id # associated with user  // depreciated use getuserbyuname
	public User getUserByUname(String username); // out: user in: username associated with account 
	public User doLogin(String usern, String passw);// out: user in: login information , username/ password 
	public boolean addUser(String name, String Lastname, String username, String password, String email, int role); //out: true if successful , false if not in : members of user object
	public User getUserByEmail(String email); // out: user in: email associated with account 
	public User updateAccount(User user);
	//public User updateAccount(int id, int uid); // depreciated, use update bal 
	//public Account findAH(User user); // out: account associated with user  in : user , used in update bal.
	//public boolean updateBal(Account acc, double update);  //out: true if balance updated, false if not  in : account object and updated amount 
	//public boolean addAccount(User user, double initial); // out: true if account created, false if not in : user associated with account, balance for account 

}
