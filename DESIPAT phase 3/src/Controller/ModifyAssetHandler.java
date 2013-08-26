/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import View.ModifyAsset;
import Model.DBHandler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

/**
 *
 * @author ED
 */
public class ModifyAssetHandler implements ActionListener {
    
    private ModifyAsset m;
    
    public ModifyAssetHandler(ModifyAsset m)
    {    
        this.m = m;    
    }
    @Override
      public void actionPerformed(ActionEvent e) {
            if(e.getSource().equals(m.getBtnAddEdit())){
                 
                 if (m.getTfAssetName().getText().trim().length() != 0 && m.getTfType().getText().trim().length() != 0 && m.getTfOwner().getText().trim().length() != 0 && m.getTfStorage().getText().trim().length() != 0 && m.getTfFinancial().getText().trim().length() != 0){
                               
                     DBHandler b = new DBHandler();
                     ControllerUtility.AddAsset(b, m);
                     b.addActivityLog("Add Asset", m.getUserType(), m.getUsername());
                     m.dispose();
                 }
                 else
                     JOptionPane.showMessageDialog(null, "Please complete all required fields", "Error", JOptionPane.ERROR_MESSAGE);
             }
             
             }
}         
