/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Decorators;

import Controller.ModifyAssetHandler;
import View.Page;
import View.MainMenu;
import View.ModifyAsset;

import java.awt.event.ActionListener;
import java.sql.SQLException;

/**
 *
 * @author Jan
 */
public class CustodianModifyAssetDecorator extends AbstractDecorator {
    //This decorator turns ModifyAsset for owners to ModifyAsset for custodians.
    public Page toD;
    
    public CustodianModifyAssetDecorator(Page f){
        toD = f;
    }

    @Override
    public Page getForm() {
        ModifyAsset cma = (ModifyAsset)toD;
		
		//To allow the custodian to modify more fields, add the textfield you wish to be editable here.
        
                cma.getLbReminder().setText("Note: For Custodians, some fields are restricted.");
                cma.getTfAssetName().setEditable(false);
                cma.getTfStorage().setEditable(false);
                cma.getTfFinancial().setEditable(false);
                cma.getDccDateAcquired().setEnabled(false);
                cma.getDccRetentionPeriod().setEnabled(false);
                cma.getCbClassification().setEnabled(false);
                cma.getCbConfidentiality().setEnabled(false);
                cma.getCbIntegrity().setEnabled(false);
                cma.getCbAvailability().setEnabled(false);
                cma.getTfOwner().setEditable(false);
                cma.getTfCustodian().setEditable(false);
        
        
        cma.pack();
        toD = cma;
        return toD;
    }

	@Override
	public void addActionListener(ActionListener listener) {
		// TODO Auto-generated method stub
		
	}
}
