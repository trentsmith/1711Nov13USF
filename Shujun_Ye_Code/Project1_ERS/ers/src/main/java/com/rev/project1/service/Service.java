package com.rev.project1.service;

import java.util.List;

import com.rev.project1.dao.ERSDao;
import com.rev.project1.dao.ERSDaoImpl;
import com.rev.project1.domain.ReimbStatus;
import com.rev.project1.domain.Reimbursement;
import com.rev.project1.domain.User;

public class Service {
	
	/** Create an ERSDao object */
	static ERSDao dao = new ERSDaoImpl();
	
	/**
	 * Add a new user to the system
	 * @param u new user
	 * @return new user
	 */
	public User addUser(User u) {
		if(dao.uniqueUsername(u.getUsername()) && dao.uniqueEmail(u.getEmail())) {
			if(dao.addUser(u)) return u;
		}
		return null;
	}
	
	/**
	 * Validate if both username and password match in the system
	 * @param username user's username
	 * @param password user's password
	 * @return true if username and password match, false otherwise
	 */
	public boolean validateLogin(String username, String password) {
		User u = dao.getUserByName(username);
		if(u != null) {
			if(password.equals(u.getPassword())) return true;
		}
		return false;
	}
	
	/**
	 * Submit a reimbursement request.
	 * @param r reimbursement
	 * @return new reimbursement
	 */
	public Reimbursement subRequest(double reimbAmount, String descrip, int reimbAuthor, int reimbStatusId, int reimbTypeId) {
		Reimbursement r = dao.subReimb(reimbAmount, descrip, reimbAuthor, reimbStatusId, reimbTypeId);
		return r;
	}
	
	/**
	 * Return a list of past reimbursement for a specified user
	 * @param reimbAuthor reimbursement author
	 * @return a list of past reimbursement
	 */
	public List<Reimbursement> viewPastTickets(int reimbAuthor) {
		return dao.getAllPastReimbs(reimbAuthor);
	}
	
	/**
	 * Return a list of pending reimbursement for a specified user
	 * @param reimbAuthor reimbursement author
	 * @return a list of pending reimbursement
	 */
	public List<Reimbursement> viewPendingRequests(int reimbAuthor){
		return dao.getAllPendingReimbs(reimbAuthor);
	}
	
	/**
	 * Return a list of all pending reimbursement requests
	 * @return a list of all pending reimbursement requests
	 */
	public List<Reimbursement> viewAllRequests(){
		return dao.getAllPendingReimbs();
	}

	/**
	 * Return a list of all past reimbursement requests
	 * @return a list of all past reimbursement requests
	 */
	public List<Reimbursement> viewAllPastRequests(){
		return dao.getAllPastReimbs();
	}
	
	/**
	 * Authorized requests for expense reimbursement
	 * @param r pending reimbursement
	 * @param resolver manager user id
	 * @param status reimbursement status
	 */
	public void authorizedRequest(Reimbursement r, int resolver, ReimbStatus status) {
		dao.updateReimb(r, resolver, status.getStatusId());
	}
}
