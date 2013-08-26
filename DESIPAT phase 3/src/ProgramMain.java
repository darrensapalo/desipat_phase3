import Controller.PageDirector;
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
		
		PageDirector f = new PageDirector();
		f.buildPage(new LoginBuilder());
		
		Page login = f.construct();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
	}
}
