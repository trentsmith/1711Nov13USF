package com.rev.project1.test;

import com.rev.project1.domain.ReimbStatus;
import com.rev.project1.domain.ReimbType;
import com.rev.project1.domain.Reimbursement;
import com.rev.project1.domain.User;
import com.rev.project1.service.Service;

public class RunERS {
	// create a service
	static Service service = new Service();
	
	public static void main(String[] args) {
		// Create a user
		User u1 = new User("sye", "123", "Shujun", "Ye", "sye2@ncsu.edu", 2);
		// add u1 to the system
//		service.addUser(u1);
		
		// create a user with the same username - INVALID
//		User u2 = new User("sye", "123", "Shujun", "Ye", "sye3@ncsu.edu", 2);
//		System.out.println("null? " + service.addUser(u2));

		// create a user with the same email - INVALID
//		User u3 = new User("jy", "123", "S", "Y", "sye2@ncsu.edu", 1);
//		System.out.println("null? " + service.addUser(u3));
		
		// create a new user
//		User u4 = new User("jy", "123", "S", "Y", "shujun@gmail.com", 1);
//		service.addUser(u4);
		
		// check login
//		System.out.println("True? " + service.validateLogin("sye", "123"));
//		System.out.println("True? " + service.validateLogin("SyE", "123"));
//		System.out.println("False? " + service.validateLogin("sye", "pass"));
//		System.out.print("True? " + service.validateLogin("jy", "123"));
		
		// submit request
		ReimbStatus s1 = ReimbStatus.PENDING;
		ReimbType t1 = ReimbType.LODGING;
		service.subRequest(298.50, "", u1.getUserId(), s1.getStatusId(), t1.getTypeId());
	}

}
