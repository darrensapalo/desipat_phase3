package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Model.AbstractFactory.DBConnectionFactory;
import Model.Strategy.Add;
import Model.Strategy.AddCustodian;
import Model.Strategy.AddOwner;
import Model.Template.Query;
import Model.Template.addActivityLogQuery;
import Model.Template.addAssetQuery;
import Model.Template.addPreviousOwnerQuery;
import Model.Template.addUserQuery;
import Model.Template.deleteAssetQuery;
import Model.Template.editAssetQuery;
import Model.Template.getPreviousOwnerQuery;
import Model.Template.getUserIDQuery;
import Model.Template.ListAssetQuery;
import Model.Template.viewAssetQuery;
import View.ModifyAsset;
import View.Register;

/**
 * 
 * @author Renz
 */
public class DBHandler {
	
	// DBHandler facilitates all the calls to the Database
	// It can be considered as a facade pattern since the client calls the
	// DBHandler to make DB requests, not to actual classes who create the
	// queries.
	// To create the queries, DBHandler uses a Template pattern to avoid
	// repetition.

	public static Connection connection;

	// Factory pattern for creating the connection.

	private static void createConnection() {
		try {
			DBConnectionFactory myFactory = DBConnectionFactory.getInstance();
			connection = myFactory.getConnection();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static ResultSet executeQuery(Query query) {
		createConnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement(query.getQuery());
			return ps.executeQuery();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return null;
	}
	/*
	public boolean userLogin(LoginMenu l, String userType) {
		createConnection();
		boolean b = false;
		Query login;

		try {
			switch (userType) {
			case "Custodian":
				login = new UserLoginQuery(l, "custodian");
				login.createQuery();

				if (b = connection.prepareStatement(login.getQuery())
						.executeQuery().next()) {
					b = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Please enter the correct username and password.",
							"Error", JOptionPane.ERROR_MESSAGE);

				}
				break;

			case "Owner":
				login = new UserLoginQuery(l, "owner");
				login.createQuery();

				if (b = connection.prepareStatement(login.getQuery())
						.executeQuery().next()) {
					b = true;
				} else {
					JOptionPane.showMessageDialog(null,
							"Please enter the correct username and password.",
							"Error", JOptionPane.ERROR_MESSAGE);
				}
				break;
			}
			connection.close();
		} catch (SQLException err) {
			System.out.println(err);
		}

		return b;
	}
	*/
	public boolean addAsset(ModifyAsset m) {
		createConnection();
		boolean b = false;

		try {
			Query a = new addAssetQuery(m);
			a.createQuery();

			if (connection.prepareStatement(a.getQuery()).executeUpdate() == 1) {
				b = true;
				System.out.println("Insert Successful");
			}
			connection.close();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}

		return b;
	}

	// Owner has full access.
	// Custodian has limited access.
	public boolean editAsset(ModifyAsset m, int assetid) {
		createConnection();
		boolean b = false;

		try {
			Query edit = new editAssetQuery(m, assetid);
			edit.createQuery();

			if (connection.prepareStatement(edit.getQuery()).executeUpdate() == 1) {
				b = true;
				System.out.println("Edit Successful");
			}
			connection.close();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}

		return b;
	}

	public boolean addUser(Register r) {
		// Uses Strategy Pattern to for adding a user. The strategy swtiches
		// between adding user or custodian.
		createConnection();
		Add regStrategy = null;
		boolean b = false;
		if (r.getRbOwner().isSelected()) {
			regStrategy = new AddOwner();
		} else if (r.getRbCustodian().isSelected()) {
			regStrategy = new AddCustodian();
		}

		try {
			Query addUser = new addUserQuery(r, regStrategy.getTable(),
					regStrategy.getColumns());
			addUser.createQuery();

			if (connection.prepareStatement(addUser.getQuery()).executeUpdate() == 1) {
				b = true;
				JOptionPane.showMessageDialog(null,
						"Thank you for Registering " + r.getTfFirst().getText()
								+ " " + r.getTfLast().getText() + ".",
						"User Registration Successful",
						JOptionPane.INFORMATION_MESSAGE);
			}

		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}
		return b;
	}

	// if the user is the owner / custodian
	public ResultSet getAssetList(String userType, String userName) {
		ResultSet rs = null;
		createConnection();
		try {
			Query listAsset = new ListAssetQuery(userType, userName);
			listAsset.createQuery();
			rs = connection.prepareStatement(listAsset.getQuery())
					.executeQuery();
		} catch (SQLException ex) {
			System.out.println(ex);
		}

		return rs;

	}

	public ResultSet viewAsset(int assetid) {
		createConnection();
		ResultSet rs = null;
		createConnection();
		try {
			Query viewAsset = new viewAssetQuery(assetid);
			viewAsset.createQuery();
			rs = connection.prepareStatement(viewAsset.getQuery())
					.executeQuery();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}

		return rs;
	}

	public boolean deleteAsset(int assetid) {
		createConnection();
		boolean b = false;

		try {
			Query deleteAsset = new deleteAssetQuery(assetid);
			deleteAsset.createQuery();
			if (connection.prepareStatement(deleteAsset.getQuery())
					.executeUpdate() == 1) {
				System.out.println("Delete Successful");
				b = true;
			} else
				System.out.println("Asset not found.");

			connection.close();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}

		return b;
	}

	// userName: User that is currently logged in.
	public static boolean addActivityLog(String activityName, String userType,
			String userName) {
		createConnection();
		boolean b = false;

		try {
			Query addActivity = new addActivityLogQuery(activityName, userType,
					userName);
			addActivity.createQuery();

			if (connection.prepareStatement(addActivity.getQuery()).executeUpdate() == 1) {
				if (userType.equals("custodian")) {
					System.out.println("Custodian: " + userName + " "
							+ activityName);
				}
				else if (userType.equals("owner")) {
					System.out.println("Owner: " + userName + " "
							+ activityName);
				}
				
				b = true;
			}
			connection.close();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}
		return b;
	}

	public boolean addPreviousOwner(int assetID, int previousOwnerID) {
		createConnection();
		boolean b = false;

		try {
			Query addPreviousOwner = new addPreviousOwnerQuery(assetID,
					previousOwnerID);
			addPreviousOwner.createQuery();

			if (connection.prepareStatement(addPreviousOwner.getQuery())
					.executeUpdate() == 1) {
				System.out.println("Owner: " + previousOwnerID + " transfers "
						+ assetID + "; successful.");
				b = true;
			}
			connection.close();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}
		return b;
	}

	// You can get the previousOwner's first and last name.
	// rs.getString("first/lastname")
	public ResultSet getPreviousOwner(int assetID) {
		createConnection();
		ResultSet rs = null;

		try {
			Query getPreviousOwner = new getPreviousOwnerQuery(assetID);
			getPreviousOwner.createQuery();
			rs = connection.prepareStatement(getPreviousOwner.getQuery())
					.executeQuery();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}
		return rs;
	}

	public String getUserID(String userType, String username) {
		createConnection();
		String id = "Error";
		ResultSet rs = null;

		try {
			Query getUserID = new getUserIDQuery(userType, username);
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

	}
}
