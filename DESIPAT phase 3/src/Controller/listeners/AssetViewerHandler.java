/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.listeners;


import View.Form;
import View.ModifyAsset;
import View.AssetViewer;
import View.Builders.AbstractFormBuilder;
import View.Builders.FormDirector;
import View.Builders.ModifyAssetBuilder;
import View.Decorators.CustodianModifyAssetDecorator;
import View.Decorators.ModifyAssetDecorator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ED
 */


public class AssetViewerHandler implements ActionListener {
    private AssetViewer a;
    
    
    public AssetViewerHandler(AssetViewer a)
    {    
        this.a = a;    
    }
    
    
    
    @Override
      public void actionPerformed(ActionEvent e) {
                if(e.getSource().equals(a.getbtnEdit())){
                    
                  AbstractFormBuilder form = new ModifyAssetBuilder();
                  FormDirector f = new FormDirector();
                   f.setBuilder(form);
                   Form edit = f.construct();
                   
                   Form Deco = new ModifyAssetDecorator(edit, a.getAsset());
                   edit = Deco.getForm();
                   
                   ModifyAsset editing = (ModifyAsset)edit;
                   editing.setValues(a.getUserType(), a.getUsername(), a.getUserID());
                   edit = editing;
                   
                   if (a.getUserType() == "custodian"){
                       
                       a.dispose();
                       
                       Deco = new CustodianModifyAssetDecorator(edit);
                       edit = Deco.getForm();
                       edit.setVisible(true);
                       edit.setLocationRelativeTo(null);
                       
                   }
                   else if (a.getUserType() == "owner"){
                       
                       a.dispose();
                       
                       edit.setVisible(true);
                       edit.setLocationRelativeTo(null);
                   }
                    
                }
         
      }
}
