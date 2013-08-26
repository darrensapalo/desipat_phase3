/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Model.DBHandler;
import View.Page;
import View.ModifyAsset;
import View.AssetViewer;
import View.Builders.ModifyAssetBuilder;
import View.Decorators.CustodianModifyAssetDecorator;
import View.Decorators.ModifyAssetDecorator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 *
 * @author ED
 */


public class AssetViewerHandler implements ActionListener {
    
	private AssetViewer assetViewer;
	private JButton edit;
    
    public AssetViewerHandler(AssetViewer currentView)
    {    
    	// You must set this class' reference
    	assetViewer = currentView;
    	edit = assetViewer.getbtnEdit();
    	
    	
    }

	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
    	
    	if(source.equals(edit)){
    		// Build the current page with the necessary components
           Page edit = PageDirector.buildPage(new ModifyAssetBuilder());
           
           DBHandler d = new DBHandler();
           
            // "Decorate" the current page with the asset's information for viewing 
           Page Deco = new ModifyAssetDecorator(edit, d.viewAsset(assetViewer.getAssetID()));
           edit = Deco;
           
           // Set the page's current user, user type, and asset owner id
           ModifyAsset editing = (ModifyAsset)edit;
           
           ControllerUtility.SetValues(editing, assetViewer);
           
           // depending on what kind of page, decorate as necessary
           if (assetViewer.getUserType() == "custodian"){
               assetViewer.dispose();
               Deco = new CustodianModifyAssetDecorator(edit);
               edit = Deco;
               edit.setVisible(true);
               edit.setLocationRelativeTo(null);
               
           }
           else if (assetViewer.getUserType() == "owner"){
               assetViewer.dispose();
               edit.setVisible(true);
               edit.setLocationRelativeTo(null);
           }
            
        }
         
      }
	
	

}
