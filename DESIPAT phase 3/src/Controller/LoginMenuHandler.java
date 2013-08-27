package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.CustodianModel;
import Model.DBHandler;
import Model.OwnerModel;
import Model.UserModel;
import Model.Bean.User;
import View.Page;
import View.LoginMenu;
import View.MainMenu;
import View.Register;
import View.Builders.MainMenuBuilder;
import View.Builders.RegisterBuilder;
import View.Decorators.MainMenuDecorator;

/**
 * 
 * @author Renz
 */
public class LoginMenuHandler implements ActionListener {
	private LoginMenu loginMenu;

	public LoginMenuHandler(LoginMenu loginMenu) {
		this.loginMenu = loginMenu;
	}

	public void actionPerformed(ActionEvent e) {
		UserModel userModel = null;
		DBHandler b = new DBHandler();

		// Checks if the user wants to login or to register a new user account
		if (e.getSource().equals(loginMenu.getLoginButton())) {    // Handler for login button
			
			// Checks the user type of the user logging in
			String userType = loginMenu.getUserType().toLowerCase();
			
			// Initialize user depending on type
			User user = new User(loginMenu.getUsernameField().getText(), loginMenu.getDecipheredPassword(loginMenu.getPasswordField()));
            
			switch (userType) {
			case "owner":
			    userModel = new OwnerModel(user);
				break;
				
			case "custodian":
				userModel = new CustodianModel(user);
				break;
			}
			
			
			if (userModel.login()) {
				loginMenu.dispose();
				MainMenu mm = (MainMenu) PageDirector.buildPage(new MainMenuBuilder());
				mm.addActionListener(new MainMenuHandler(mm));
				Page mainMenuForm = mm;
				
				ControllerUtility.SetValues((MainMenu)mainMenuForm, userType, 
						b.getAssetList(userType, loginMenu.getUsernameField().getText()), 
						user.getUsername(), 
						user.getPassword(), 
						user.getId());
				
				
				if (userType.equals("custodian")) {
					mainMenuForm = new MainMenuDecorator(mainMenuForm).getForm();
				}
				
				mainMenuForm.setVisible(true);
				mainMenuForm.setLocationRelativeTo(null);
					
				DBHandler.addActivityLog("Logged In", userType, loginMenu.getUsernameField().getText());
			}
			
			else {
				this.loginMenu.displayErrorMessage("Invalid username/password combination.");
			}
		} 
		
		else if (e.getSource().equals(loginMenu.getRegisterButton())) {    // Handler for register button
		    Page registrationForm = PageDirector.buildPage(new RegisterBuilder());
		    registrationForm.addActionListener(new RegisterHandler((Register) registrationForm));
			registrationForm.setVisible(true);
			registrationForm.setLocationRelativeTo(null);
		}
	}

}
