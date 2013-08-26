/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.Page;
import View.ModifyAsset;
import View.AssetViewer;
import View.Builders.AbstractPageBuilder;
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


public class AssetViewerHandler extends Controller {
    
	private AssetViewer assetViewer;
    
    public AssetViewerHandler(AssetViewer currentView)
    {    
    	// You must also set this class' reference
    	assetViewer = currentView;
    }
    
    public void Action(ActionEvent e, Object source) {
    	
    	if(source.equals(assetViewer.getbtnEdit())){
            
          AbstractPageBuilder form = new ModifyAssetBuilder();
          PageDirector f = new PageDirector();
           f.setBuilder(form);
           Page edit = f.construct();
           
           Page Deco = new ModifyAssetDecorator(edit, assetViewer.getAsset());
           edit = Deco.getForm();
           
           ModifyAsset editing = (ModifyAsset)edit;
           editing.setValues(assetViewer.getUserType(), assetViewer.getUsername(), assetViewer.getUserID());
           edit = editing;
           
           if (assetViewer.getUserType() == "custodian"){
               
               assetViewer.dispose();
               
               Deco = new CustodianModifyAssetDecorator(edit);
               edit = Deco.getForm();
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
