package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Template.AddUserQuery;
import Model.Template.GetUserIDQuery;
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
				return true;
			}	
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return false;
	}
	
	public String fetchUserID(String userType, String username) {
		/*
		String id = "Error";
		ResultSet rs = null;

		try {
			Query getUserID = new GetUserIDQuery(userType, username);
			getUserID.createQuery();
			rs = connection.prepareStatement(getUserID.getQuery())
					.executeQuery();
			rs.next();

			if (userType.equalsIgnoreCase("Owner"))
				id = rs.getString("ownerid");
			else if (userType.equalsIgnoreCase("Custodian"))
				id = rs.getString("custodianid");

			rs.close();
			connection.close();
		} catch (SQLException err) {
			System.out.println(err);
		}
		return id;
		*/
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
