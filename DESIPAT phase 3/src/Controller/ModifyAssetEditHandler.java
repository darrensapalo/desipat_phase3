/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBHandler;
import View.ModifyAsset;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

    
/**
 *
 * @author Jan
 */
public class ModifyAssetEditHandler extends Controller{
    
    private ModifyAsset m;
    
    public ModifyAssetEditHandler(ModifyAsset mod){
        this.m = mod;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(m.getBtnAddEdit())){
            if (m.getTfAssetName().getText().trim().length() != 0 && m.getTfType().getText().trim().length() != 0 && m.getTfOwner().getText().trim().length() != 0 && m.getTfStorage().getText().trim().length() != 0 && m.getTfFinancial().getText().trim().length() != 0){
            DBHandler b = new DBHandler();
            b.editAsset(m, m.getAssetID());
            b.addActivityLog("Edit Asset:"+m.getTfAssetName().getText(), m.getUserType(), m.getUsername());
      
      
                if(!(m.getPreviousOwnerID()==Integer.parseInt(m.getTfOwner().getText()))){
                
                   b.addPreviousOwner(m.getAssetID(), m.getPreviousOwnerID());
                }
            m.dispose();
            }
            else
                JOptionPane.showMessageDialog(null, "Please complete all required fields", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }  
}
