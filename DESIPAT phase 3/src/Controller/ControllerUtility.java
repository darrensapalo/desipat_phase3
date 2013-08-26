package Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

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
}
