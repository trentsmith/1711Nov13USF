package com.rev.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.rev.pojos.User;

public final class FileDao implements DAO {

	private String fileName = "src/main/resources/bank.txt";
	
	public User addUser(User u) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))){
			//should not be able to add users with a username that already exist
			bw.write(u.toFile());
			return u;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public User getUser(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
