package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Bean.User;
import Model.Template.AddUserQuery;
import Model.Template.FetchUserIdQuery;
import Model.Template.Query;
import Model.Template.UserLoginQuery;

public abstract class UserModel {
	
	
	protected User user;
	
	public UserModel() {	}
	public UserModel(User user) {
	    this.user = user;
	}
	
	
	
	public abstract boolean addToDatabase();
	protected boolean addToDatabase(String userType) {
		try {
			Query addUserQuery = new AddUserQuery(user, userType, user.getUserColumns());
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
			Query loginQuery = new UserLoginQuery(user.getUsername(), user.getPassword(), userType);
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
			Query fetchUserIdQuery = new FetchUserIdQuery(user.getUsername(), userType);
			ResultSet rs = DBHandler.executeQuery(fetchUserIdQuery);
			
			if (rs.first()) {
				if (userType.equalsIgnoreCase("Owner")) {
					user.setId(rs.getInt("ownerid"));
				}
				else if (userType.equalsIgnoreCase("Custodian")) {
					user.setId(rs.getInt("custodianid"));
				}
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	

}
