/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Custodian;
import Model.Owner;
import Model.User;
import View.Register;

/**
 *
 * @author DJ
 */
public class RegisterHandler implements ActionListener {
	private Register registrationPage;

	public RegisterHandler(Register registrationPage){
		this.registrationPage = registrationPage;
	}

	public void actionPerformed(ActionEvent e) {
		User user = null;
		
		if (e.getSource().equals(registrationPage.getBtSignUp())) {
			String firstName = registrationPage.getFirstNameField().getText().trim();
			String lastName = registrationPage.getLastNameField().getText().trim();
			String username = registrationPage.getTfUsername().getText().trim(); 
			String password1 = registrationPage.getDecipheredPassword(registrationPage.getPfPassword());
			String password2 = registrationPage.getDecipheredPassword(registrationPage.getPfConfirmPassword());
			
			// Check for errors
			if (!registrationPage.allFieldsValid()) {
				registrationPage.setErrorMessage("Please complete all fields.");
				return;
			}
			else if (!password1.equals(password2)) {
				registrationPage.setErrorMessage("Passwords don't match.");
				return;
			}
			else {
				registrationPage.setErrorMessage("");
			}
			
			if (registrationPage.getRbOwner().isSelected()) {	
				user = new Owner();
			}
			else if (registrationPage.getRbCustodian().isSelected()) {
				user = new Custodian();
			}
			
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setUsername(username);
			user.setPassword(password1);
			if (user.addToDatabase()) {
				registrationPage.displayInformationMessage(
						"Thank you for registering " + firstName + " " + lastName + ".");
				registrationPage.dispose();
			}
			else {
				registrationPage.setErrorMessage("This user is already registered.");
			}
		}
		/*
		if(e.getSource().equals(registrationPage.getBtSignUp())){
			//this area of the code checks if the user that wants to register is an owner or a custodian
			
			user = new Owner();
			if(registrationPage.getRbOwner().isSelected()){
				//this area of the code checks if all fields are filled
				if(registrationPage.getTfFirst().getText().trim().length() != 0  && registrationPage.getTfLast().getText().trim().length() != 0 && registrationPage.getTfUsername().getText().trim().length() != 0 && registrationPage.getDecipheredPassword(registrationPage.getPfPassword()).trim().length() != 0)
				{   //this area of the code checks if the written passwords match
					if(registrationPage.getDecipheredPassword(registrationPage.getPfConfirmPassword()).equals(registrationPage.getDecipheredPassword(registrationPage.getPfPassword())))
					{ 
						//DBHandler b = new DBHandler();
						if (ControllerUtility.AddUser(b, registrationPage) == false){
							registrationPage.setLbError("This User is already registered.");
						}
						else{
							registrationPage.dispose();
						}


					}

					else
						registrationPage.setLbError("Passwords don't match.");

				}
				else
					registrationPage.setLbError("Please complete all fields."); 
			}

			else if(registrationPage.getRbCustodian().isSelected()){   
				if(registrationPage.getTfFirst().getText().trim().length() != 0  && registrationPage.getTfLast().getText().trim().length() != 0 && registrationPage.getTfUsername().getText().trim().length() != 0 && registrationPage.getDecipheredPassword(registrationPage.getPfPassword()).trim().length() != 0)
				{
					if(registrationPage.getDecipheredPassword(registrationPage.getPfConfirmPassword()).equals(registrationPage.getDecipheredPassword(registrationPage.getPfPassword())))
					{ 
						//DBHandler b = new DBHandler();
						if (ControllerUtility.AddUser(b, registrationPage) == false){
							registrationPage.setLbError("This User is already registered.");
						}
						else{
							registrationPage.dispose();
						}


					}

					else
						registrationPage.setLbError("Passwords don't match.");

				}
				else
					registrationPage.setLbError("Please complete all fields.");
			}
			else
				registrationPage.setLbError("Please complete all fields.");
				
		}
		*/

	}

}
