import java.sql.SQLException;

import View.Form;
import View.Builders.FormDirector;
import View.Builders.LoginBuilder;

//PROGRAM STARTS HERE

/**
 * 
 * @author Jan
 */
// Real Driver of the whole Program. Everything starts here.
// You look nice today ;D
public class ProgramMain {

	public static void main(String args[]) throws SQLException {
		
		FormDirector f = new FormDirector();
		f.setBuilder(new LoginBuilder());
		
		Form login = f.construct();
		login.setVisible(true);
		login.setLocationRelativeTo(null);

	}

}
