package com.rev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConfiguration {
	
	private static OracleConfiguration oc = null;
	private final String hostname = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String username = "bankadmin";
	private final String password = "bankadmin";
	private static boolean build = true;
	private Connection connection;
	
	private OracleConfiguration(){
		initConnection();
		build = false;
	}
	
	public static synchronized OracleConfiguration getInstance(){
		if(build == true) oc = new OracleConfiguration();
		return oc;
	}
	
	public void initConnection(){

	}
	
	public Connection getConnection(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException e){
			System.out.println("Oracle JDBC Driver not Found");
			e.printStackTrace();
			return null;
		}
		connection = null;
		try{
			connection = DriverManager.getConnection(hostname, username, password);
			return connection;
		}catch(SQLException e){
			System.out.println("Connection Failed");
			e.printStackTrace();
			return null;
		}
	}
	
	public ResultSet query(String q) throws SQLException{
	    Statement stmt = null;
	    String query = q;
	    try{
	        stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        System.out.println(rs.toString());
	        return rs;
	    }catch (SQLException e) {
	        e.printStackTrace();
	    } 
	 return null;
	}
}