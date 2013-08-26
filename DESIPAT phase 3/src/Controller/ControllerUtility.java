package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import Model.DBHandler;
import View.Register;
import Model.Strategy.Add;
import Model.Strategy.AddCustodian;
import Model.Strategy.AddOwner;
import Model.Template.Query;
import Model.Template.addAssetQuery;
import Model.Template.addUserQuery;
import Model.Template.editAssetQuery;
import View.AssetViewer;
import View.MainMenu;
import View.ModifyAsset;

public class ControllerUtility {
	public static void SetValues(ModifyAsset view, AssetViewer assetViewer){
		view.setUsername(assetViewer.getUsername());
        view.setUserType(assetViewer.getUserType());
        view.getTfOwner().setText(String.valueOf(assetViewer.getUserID()));
	}
	
	/**
	 * This function handles the placement of data into the view for AssetViewer
	 * @param view the AssetViewer
	 * @param Asset The asset being viewed
	 * @param prevOwners The previous owners of the asset
	 * @param UserType the kind of user
	 * @param UserName the username
	 */
	public static void SetValues(AssetViewer view, ResultSet Asset, ResultSet prevOwners, String UserType, String UserName){
        view.setUsername(UserName);
        view.setUserType(UserType);
        
        Vector<String> res = new Vector<String>();
                    
        try{ 
            while (prevOwners.next()) {
                
                String oFirstname = prevOwners.getString("ofirstname");
                String oLastname = prevOwners.getString("olastname");
                res.add(oFirstname+" "+oLastname);
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);            
        }
            
        view.getListPreviousOwners().setListData(res);       
        
        try
        {
            Asset.next();
            view.getLbAssetName().setText((Asset.getString("assetname")));
            view.getLbAssetID().setText((Asset.getString("assetid")));
            String oFirstname = Asset.getString("ofirstname");
            String oLastname = Asset.getString("olastname");
            view.getLbOwner().setText(oFirstname+" "+oLastname);
            String cFirstname = Asset.getString("cfirstname");
            String cLastname = Asset.getString("clastname");
            if(cFirstname == null)
            	view.getLbCustodian().setText("N/A");
            else
            	view.getLbCustodian().setText(cFirstname+" "+cLastname);
            view.getLbType().setText((Asset.getString("assettype")));
            view.getLbDate().setText(Asset.getString("dateacquired"));
            view.getLbRetention().setText((Asset.getString("retentionperiod")));
            view.getLbMaintenance().setText((Asset.getString("mainsched")));
            view.getLbFinancial().setText((Asset.getString("financialval")));
            view.getLbConfidentiality().setText((Asset.getString("confidentialityval")));
            view.getLbAvailability().setText((Asset.getString("availabilityval")));
            view.getLbIntegrity().setText((Asset.getString("integrityval")));
            view.getLbClassification().setText((Asset.getString("classification")));
            view.getLbStorage().setText((Asset.getString("storagelocation")));
            
            view.setUserID(Asset.getInt("asset_ownerid"));
            
            if(res.isEmpty()){
                view.getLbPreviousOwner().setText("N/A");
            }else
                view.getLbPreviousOwner().setText(res.lastElement());
            
        }catch(SQLException s){
                    System.out.println(s);
                }
        
        view.setVisible(true);
        view.setLocationRelativeTo(null);
	}

	public static void SetValues(MainMenu mainMenu, String userType,
			ResultSet rAssets, String username, String password, int userID) {
		
		mainMenu.setUsername(username);
		mainMenu.setUserType(userType);
		mainMenu.setUserID(userID);
		mainMenu.setPassword(password);
        
               Vector<String> res = new Vector<String>();
                    try {
                        while (rAssets.next()) {
                        res.add(rAssets.getString("assetname")+", Type: "+rAssets.getString("assettype"));
                        mainMenu.getAssetIDs().add(rAssets.getString("assetID"));
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                    
                    
      mainMenu.getLbName().setText(username);
      mainMenu.getLbID().setText("Owner ID: " + userID);
      mainMenu.getListOfAsset().setListData(res);
      mainMenu.getLbUserType().setText("Logged in as Owner");
		
	}

	public static boolean AddUser(DBHandler db, Register r) {
		// Uses Strategy Pattern to for adding a user. The strategy swtiches
		// between adding user or custodian.
		DBHandler.createConnection();
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

			if (db.connection.prepareStatement(addUser.getQuery()).executeUpdate() == 1) {
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

	public static boolean AddAsset(DBHandler dbHandler, ModifyAsset m) {
		DBHandler.createConnection();
		boolean b = false;

		try {
			Query a = new addAssetQuery(m);
			a.createQuery();

			if (dbHandler.connection.prepareStatement(a.getQuery()).executeUpdate() == 1) {
				b = true;
				System.out.println("Insert Successful");
			}
			dbHandler.connection.close();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}

		return b;
	}

	public static boolean EditAsset(DBHandler dbHandler, ModifyAsset m, int assetid) {
		DBHandler.createConnection();
		boolean b = false;

		try {
			Query edit = new editAssetQuery(m, assetid);
			edit.createQuery();

			if (dbHandler.connection.prepareStatement(edit.getQuery()).executeUpdate() == 1) {
				b = true;
				System.out.println("Edit Successful");
			}
			dbHandler.connection.close();
		} catch (SQLException sqlErr) {
			System.out.println(sqlErr);
		}

		return b;
	}
	
	
	
}
