package com.rev.service;

import com.rev.dao.DAO;
import com.rev.dao.FileDao;
import com.rev.pojos.User;

public class Service {
	
	static DAO dao = new FileDao();
	
	public User addUser(User u) {
		//validate that user name username does not exist
		//assuming it doesn't exist...
		dao.addUser(u);
		return u;
	}

}
