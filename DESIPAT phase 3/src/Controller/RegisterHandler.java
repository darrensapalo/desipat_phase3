/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Register;
import View.LoginMenu;
import Model.DBHandler;
import View.Builders.AbstractFormBuilder;
import View.Builders.Form;
import View.Builders.FormDirector;
import View.Builders.LoginBuilder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author DJ
 */
public class RegisterHandler implements ActionListener {
    private Register r;
    
    public RegisterHandler(Register r){
        this.r = r;
    }

    public void actionPerformed(ActionEvent e) {
    if(e.getSource().equals(r.getBtSignUp())){
       //this area of the code checks if the user that wants to register is an owner or a custodian
        if(r.getRbOwner().isSelected()){
            //this area of the code checks if all fields are filled
            if(r.getTfFirst().getText().trim().length() != 0  && r.getTfLast().getText().trim().length() != 0 && r.getTfUsername().getText().trim().length() != 0 && r.getDecipheredPassword(r.getPfPassword()).trim().length() != 0)
            {   //this area of the code checks if the written passwords match
                if(r.getDecipheredPassword(r.getPfConfirmPassword()).equals(r.getDecipheredPassword(r.getPfPassword())))
                { 
                    DBHandler b = new DBHandler();
                    if (b.addUser(r) == false){
                        r.setLbError("This User is already registered.");
                    }
                    else{
                        r.dispose();
                    }
                    
                    
                }
                
                else
                    r.setLbError("Passwords don't match.");
            
            }
            else
                r.setLbError("Please complete all fields."); 
        }
        
        else if(r.getRbCustodian().isSelected()){   
             if(r.getTfFirst().getText().trim().length() != 0  && r.getTfLast().getText().trim().length() != 0 && r.getTfUsername().getText().trim().length() != 0 && r.getDecipheredPassword(r.getPfPassword()).trim().length() != 0)
            {
                if(r.getDecipheredPassword(r.getPfConfirmPassword()).equals(r.getDecipheredPassword(r.getPfPassword())))
                { 
                    DBHandler b = new DBHandler();
                    if (b.addUser(r) == false){
                        r.setLbError("This User is already registered.");
                    }
                    else{
                        r.dispose();
                    }
                    
                    
                }
                
                else
                    r.setLbError("Passwords don't match.");
            
            }
             else
                    r.setLbError("Please complete all fields.");
        }
            else
                r.setLbError("Please complete all fields.");
        }

    }
   
}
