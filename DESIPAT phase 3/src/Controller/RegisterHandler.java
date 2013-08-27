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
	}

}
