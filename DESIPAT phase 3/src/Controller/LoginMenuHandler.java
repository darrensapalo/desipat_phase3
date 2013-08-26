package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Model.Custodian;
import Model.DBHandler;
import Model.Owner;
import Model.User;
import View.Page;
import View.LoginMenu;
import View.MainMenu;
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
		User user = null;
		DBHandler b = new DBHandler();

		// Checks if the user wants to login or to register a new user account
		if (e.getSource().equals(loginMenu.getLoginButton())) {    // Handler for login button
			
			// Checks the user type of the user logging in
			String userType = loginMenu.getUserType().toLowerCase();
			
			// Initialize user depending on type
			
			switch (userType) {
			case "owner":
				user = new Owner(loginMenu.getUsernameField().getText(), loginMenu.getDecipheredPassword(loginMenu.getPasswordField()));
				break;
				
			case "custodian":
				user = new Custodian(loginMenu.getUsernameField().getText(), loginMenu.getDecipheredPassword(loginMenu.getPasswordField()));
				break;
			}
			
			
			if (user.login()) {
				loginMenu.dispose();
				MainMenu mm = (MainMenu) PageDirector.buildPage(new MainMenuBuilder());
				mm.addActionListener(new MainMenuHandler(mm));
				Page mainMenuForm = mm;
				
				ControllerUtility.SetValues((MainMenu)mainMenuForm, userType, 
						b.getAssetList(userType, loginMenu.getUsernameField().getText()), 
						loginMenu.getUsernameField().getText(), 
						loginMenu.getDecipheredPassword(loginMenu.getPasswordField()), 
						Integer.parseInt(b.getUserID(userType, loginMenu.getUsernameField().getText())));
				
				
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
			registrationForm.setVisible(true);
			registrationForm.setLocationRelativeTo(null);
		}
	}

}
