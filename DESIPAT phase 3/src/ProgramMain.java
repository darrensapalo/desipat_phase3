import Controller.LoginMenuHandler;
import Controller.PageDirector;
import View.LoginMenu;
import View.Page;
import View.Builders.LoginBuilder;

//PROGRAM STARTS HERE

/**
 * 
 * @author Jan
 */

// Real Driver of the whole Program. Everything starts here.

public class ProgramMain {

	public static void main(String args[]) {
		
		Page login = PageDirector.buildPage(new LoginBuilder());
		login.addActionListener(new LoginMenuHandler((LoginMenu) login));
		login.setLocationRelativeTo(null);
		login.setVisible(true);
	}
}
