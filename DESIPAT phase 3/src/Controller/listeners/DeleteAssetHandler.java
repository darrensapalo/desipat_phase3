/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.listeners;


import View.DeleteAsset;
import Model.DBHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author DJ
 */
public class DeleteAssetHandler implements ActionListener {
    private DeleteAsset del;
    
    public DeleteAssetHandler(DeleteAsset del)
    {    
        this.del = del;    
    }
    
 @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource().equals(del.getBtDelete()))
     {		//password written should match the user's password to confirm the delete action
          if(del.getDecipheredPassword().equals(del.getPW()))
          { DBHandler b = new DBHandler();
              b.deleteAsset(del.getaID());
              //b.addActivityLog("Delete Asset:"+del.getAssetName().getText(), del.getUserType(), del.getUsername());
              del.dispose();
           }
          else
              JOptionPane.showMessageDialog(null, "Error: Please enter the correct Password", "Error", JOptionPane.ERROR_MESSAGE);
   
      }
    }
}
