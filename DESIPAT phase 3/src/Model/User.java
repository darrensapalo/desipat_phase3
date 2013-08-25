package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Template.Query;
import Model.Template.UserLoginQuery;

public abstract class User {
	
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String username;
	protected String password;
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public abstract void addToDatabase();
	public abstract boolean login();
	
	protected boolean login(String userType) {
		Query loginQuery = new UserLoginQuery(username, password, userType);
		ResultSet rs = DBHandler.executeQuery(loginQuery);
		
		try {
			if (rs.first()) {
				return true;
			}	
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return false;
	}
	
	/*
	 * Getters/Setters
	 */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
