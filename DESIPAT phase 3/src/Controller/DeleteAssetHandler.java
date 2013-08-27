/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.DBHandler;
import View.DeleteAsset;


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
			ControllerUtility.Update(b);
			}
			else
				JOptionPane.showMessageDialog(null, "Error: Please enter the correct Password", "Error", JOptionPane.ERROR_MESSAGE);

		}
	}
}
