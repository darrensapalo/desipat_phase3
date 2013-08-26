/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.Page;
import View.ModifyAsset;
import View.AssetViewer;
import View.Builders.ModifyAssetBuilder;
import View.Decorators.CustodianModifyAssetDecorator;
import View.Decorators.ModifyAssetDecorator;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

/**
 *
 * @author ED
 */


public class AssetViewerHandler extends Controller {
    
	private AssetViewer assetViewer;
	private JButton edit;
    
    public AssetViewerHandler(AssetViewer currentView)
    {    
    	// You must set this class' reference
    	assetViewer = currentView;
    	edit = assetViewer.getbtnEdit();
    	
    	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
    	
    	if(source.equals(edit)){
    		// Build the current page with the necessary components
           Page edit = PageDirector.buildPage(new ModifyAssetBuilder());
           
            // "Decorate" the current page with the asset's information for viewing 
           Page Deco = new ModifyAssetDecorator(edit, assetViewer.getAsset());
           edit = Deco;
           
           ModifyAsset editing = (ModifyAsset)edit;
           editing.setValues(assetViewer.getUserType(), assetViewer.getUsername(), assetViewer.getUserID());
           edit = editing;
           
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
