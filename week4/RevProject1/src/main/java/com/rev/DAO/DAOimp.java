package com.rev.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.rev.POJO.ERSUser;
import com.rev.POJO.Reimbursement;
import com.rev.POJO.ReimbursementStatus;
import com.rev.POJO.ReimbursementType;
import com.rev.POJO.UserRole;
import com.rev.util.ConnectionFactory;

public class DAOimp implements DAO {

	public ERSUser getUserByID(int userID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<ERSUser> getUsers() {
		ArrayList<ERSUser> users = new ArrayList<ERSUser>();

		try (Connection conn = ConnectionFactory.getInstance().getConnection();) {
			String sql = "select * from ERS_USER";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				ERSUser temp = new ERSUser();
				temp.setUserid(rs.getInt(1));
				temp.setUsername(rs.getString(2));
				temp.setPassword(rs.getString(3));
				temp.setFirstName(rs.getString(4));
				temp.setLastName(rs.getString(5));
				temp.setEmail(rs.getString(6));
				temp.setRoleID(rs.getInt(7));
				users.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}

	public Reimbursement getReimbursementByID(int rID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Reimbursement> getReimbursements() {
		ArrayList<Reimbursement> reimbursements = new ArrayList<Reimbursement>();

		try (Connection conn = ConnectionFactory.getInstance().getConnection();) {
			String sql = "select * from ERS_REIMBURSEMENT";
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				Reimbursement temp = new Reimbursement();
				temp.setrID(rs.getInt(1));
				temp.setAmount(rs.getDouble(2));
				temp.setSubmitted(rs.getDouble(3));
				temp.setResolved(rs.getDouble(4));
				temp.setDescription(rs.getString(5));
				temp.setReceipt(rs.getString(6));
				temp.setAuthor(rs.getInt(7));
				temp.setResolver(rs.getInt(8));
				temp.setStatusID(rs.getInt(9));
				temp.setTypeID(rs.getInt(10));
				reimbursements.add(temp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return reimbursements;
	}

	public ReimbursementStatus getStatusByID(int statusID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReimbursementType getTypeByID(int typeID) {
		// TODO Auto-generated method stub
		return null;
	}

	public UserRole getRoleByID(int roleID) {
		// TODO Auto-generated method stub
		return null;
	}

	public ERSUser addUser(ERSUser ersUser) {
		// TODO Auto-generated method stub
		return null;
	}

	public Reimbursement addReimbursement(Reimbursement reimbursement) {
		// TODO Auto-generated method stub
		return null;
	}

	public ERSUser getERSUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public ERSUser getERSUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public ArrayList<Artist> getArtists() {
	 * 
	 * ArrayList<Artist> artists = new ArrayList<>();
	 * 
	 * try(Connection conn = ConnectionFactory.getInstance().getConnection();){
	 * String sql = "select * from artist"; Statement statement =
	 * conn.createStatement(); ResultSet rs = statement.executeQuery(sql);
	 * 
	 * while(rs.next()){ Artist temp = new Artist();
	 * temp.setId(rs.getInt("ARTISTID")); temp.setName(rs.getString(2));
	 * artists.add(temp); } } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return artists; }
	 * 
	 * @Override public Artist getArtistById(int id) { Artist art = new Artist();
	 * 
	 * try(Connection conn = ConnectionFactory.getInstance().getConnection()){
	 * String sql = "select * from artist where artistid = ?"; PreparedStatement ps
	 * = conn.prepareStatement(sql); ps.setInt(1, id); ResultSet info =
	 * ps.executeQuery();
	 * 
	 * while(info.next()){ art.setId(info.getInt(1));
	 * art.setName(info.getString(2)); }
	 * 
	 * } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * return art; }
	 * 
	 * @Override public Artist addArtist(String name) {
	 * 
	 * Artist art = new Artist(); try(Connection conn =
	 * ConnectionFactory.getInstance().getConnection()){ conn.setAutoCommit(false);
	 * String sql = "insert into artist (Name) values (?)"; String[] key = new
	 * String[1]; key[0] = "artistid";
	 * 
	 * PreparedStatement ps = conn.prepareStatement(sql, key); ps.setString(1,
	 * name); int rows = ps.executeUpdate(); if(rows!=0){
	 * 
	 * ResultSet pk = ps.getGeneratedKeys(); while(pk.next()){
	 * art.setId(pk.getInt(1)); } art.setName(name); conn.commit(); } } catch
	 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * return art; }
	 * 
	 * @Override public void updateArtist(int id, String name) { try(Connection conn
	 * = ConnectionFactory.getInstance().getConnection();){
	 * conn.setAutoCommit(false); String sql =
	 * "update artist set name = ? where artistid = ?"; PreparedStatement ps =
	 * conn.prepareStatement(sql); ps.setString(1, name); ps.setInt(2, id);
	 * ps.executeUpdate(); //System.out.println(rows); conn.commit(); // art =
	 * getArtistById(id); } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * 
	 * }
	 */

}
