package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Template.AddUserQuery;
import Model.Template.FetchUserIdQuery;
import Model.Template.Query;
import Model.Template.UserLoginQuery;

public abstract class User {
	
	protected int id;
	protected String firstName;
	protected String lastName;
	protected String username;
	protected String password;
	
	protected String[] userColumns;
	
	public User() {	}
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public abstract boolean addToDatabase();
	protected boolean addToDatabase(String userType) {
		try {
			Query addUserQuery = new AddUserQuery(this, userType, userColumns);
			DBHandler.executeUpdate(addUserQuery);
			return true;
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return false;
	}
	
	public abstract boolean login();
	protected boolean login(String userType) {
		try {
			Query loginQuery = new UserLoginQuery(username, password, userType);
			ResultSet rs = DBHandler.executeQuery(loginQuery);
			
			if (rs.first()) {
				this.fetchUserInfo();
				return true;
			}	
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return false;
	}
	
	private void fetchUserInfo() {
		fetchUserId();
	}
	
	protected abstract void fetchUserId();
	protected void fetchUserId(String userType) {
		try {
			Query fetchUserIdQuery = new FetchUserIdQuery(this.username, userType);
			ResultSet rs = DBHandler.executeQuery(fetchUserIdQuery);
			
			if (rs.first()) {
				if (userType.equalsIgnoreCase("Owner")) {
					this.id = rs.getInt("ownerid");
				}
				else if (userType.equalsIgnoreCase("Custodian")) {
					this.id = rs.getInt("custodianid");
				}
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
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
	public String[] getUserColumns() {
		return userColumns;
	}
	public void setUserColumns(String[] userColumns) {
		this.userColumns = userColumns;
	}

}
