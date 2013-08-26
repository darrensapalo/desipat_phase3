/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Decorators;

import Controller.ModifyAssetEditHandler;
import View.Page;
import View.ModifyAsset;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jan
 */
public class ModifyAssetDecorator extends AbstractDecorator {
    //This decorator turns Add Asset into Edit Asset
    private Page toD;
    private ResultSet asset;
    
    public ModifyAssetDecorator(Page f, ResultSet r){
        toD = f;
        asset = r;
    }

    @Override
    public Page getForm() {
        ModifyAsset ma = (ModifyAsset)toD;
       
         ma.getBtnAddEdit().setText("Edit Asset");
         ma.setTitle("Edit Asset");
         
        try {
            
            asset.first();
            
            DateFormat d = DateFormat.getDateInstance(DateFormat.SHORT);
            Date dateAcquired = null;
            Date dateRetention = null;
			
			//This long section of code just parses the date string to be compatible with DateChooser.java
            String tempDate;
            try {
                tempDate = asset.getString("dateacquired").replaceAll("/", ".");
                
                tempDate = asset.getString("dateacquired").replaceAll("1", "01");
                tempDate = asset.getString("dateacquired").replaceAll("2", "02");
                tempDate = asset.getString("dateacquired").replaceAll("3", "03");
                tempDate = asset.getString("dateacquired").replaceAll("4", "04");
                tempDate = asset.getString("dateacquired").replaceAll("5", "05");
                tempDate = asset.getString("dateacquired").replaceAll("6", "06");
                tempDate = asset.getString("dateacquired").replaceAll("7", "07");
                tempDate = asset.getString("dateacquired").replaceAll("8", "08");
                tempDate = asset.getString("dateacquired").replaceAll("9", "09");
                
                
                dateAcquired = d.parse(tempDate);
                
                tempDate = asset.getString("retentionperiod").replaceAll("/", ".");
                
                tempDate = asset.getString("retentionperiod").replaceAll("1", "01");
                tempDate = asset.getString("retentionperiod").replaceAll("2", "02");
                tempDate = asset.getString("retentionperiod").replaceAll("3", "03");
                tempDate = asset.getString("retentionperiod").replaceAll("4", "04");
                tempDate = asset.getString("retentionperiod").replaceAll("5", "05");
                tempDate = asset.getString("retentionperiod").replaceAll("6", "06");
                tempDate = asset.getString("retentionperiod").replaceAll("7", "07");
                tempDate = asset.getString("retentionperiod").replaceAll("8", "08");
                tempDate = asset.getString("retentionperiod").replaceAll("9", "09");
                
                dateRetention = d.parse(tempDate);
                

                Calendar acquired = Calendar.getInstance(); //date goes to Calendar, which DateChooser need to set the date.
                acquired.setTime(dateAcquired);
                
                Calendar retention = Calendar.getInstance(); //same is true for Retention Period.
                retention.setTime(dateRetention);
                
                asset.first();
                
                ma.getTfAssetName().setText((asset.getString("assetname")));
                ma.getTfType().setText((asset.getString("assettype")));
                ma.getTfCustodian().setText(Integer.toString(asset.getInt("asset_custodianid")));
                ma.getTfOwner().setText(Integer.toString(asset.getInt("asset_ownerid")));
                ma.getTfStorage().setText((asset.getString("storagelocation")));
                ma.getTfFinancial().setText((asset.getString("financialval")));
                ma.getDccDateAcquired().setSelectedDate(acquired);
                ma.getDccRetentionPeriod().setSelectedDate(retention);
                ma.getCbMaintenance().setSelectedItem((asset.getString("mainsched")));
                ma.getCbClassification().setSelectedItem((asset.getString("classification")));
                ma.getCbConfidentiality().setSelectedItem((asset.getString("confidentialityval")));
                ma.getCbIntegrity().setSelectedItem((asset.getString("integrityval")));
                ma.getCbAvailability().setSelectedItem((asset.getString("availabilityval")));
                ma.setAssetID(asset.getInt("assetid"));
                ma.setPreviousOwnerID(asset.getInt("asset_ownerid"));
                ma.getTfOwner().setEnabled(true);

                ModifyAssetEditHandler mae = new ModifyAssetEditHandler(ma);
                while (ma.getBtnAddEdit().getActionListeners().length > 0)
                	ma.getBtnAddEdit().removeActionListener(ma.getBtnAddEdit().getActionListeners()[0]);
                ma.getBtnAddEdit().addActionListener(mae);           
                   
                  
                 ma.pack();
                 
                 
                 return ma;
            } catch (ParseException ex) {
                Logger.getLogger(ModifyAssetDecorator.class.getName()).log(Level.SEVERE, null, ex);
                ex.printStackTrace();
            }
            
            
            
            
       } catch (SQLException ex) {
            Logger.getLogger(ModifyAssetDecorator.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        return null;
       
    }

	@Override
	public void addActionListener(ActionListener listener) {
		// TODO Auto-generated method stub
		
	}
}
