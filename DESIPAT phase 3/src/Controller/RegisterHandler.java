package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.CustodianModel;
import Model.OwnerModel;
import Model.UserModel;
import Model.Bean.User;
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
		UserModel userModel = null;
		
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
			User user = new User();
            
			if (registrationPage.getRbOwner().isSelected()) {	
				userModel = new OwnerModel(user);
			}
			else if (registrationPage.getRbCustodian().isSelected()) {
				userModel = new CustodianModel(user);
			}
			
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setUsername(username);
			user.setPassword(password1);
			
			
			if (userModel.addToDatabase()) {
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
