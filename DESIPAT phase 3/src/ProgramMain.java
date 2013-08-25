import View.Form;
import View.Builders.FormDirector;
import View.Builders.LoginBuilder;

//PROGRAM STARTS HERE

/**
 * 
 * @author Jan
 */

// Real Driver of the whole Program. Everything starts here.

public class ProgramMain {

	public static void main(String args[]) {
		
		FormDirector f = new FormDirector();
		f.setBuilder(new LoginBuilder());
		
		Form login = f.construct();
		login.setLocationRelativeTo(null);
		login.setVisible(true);
	}
}
