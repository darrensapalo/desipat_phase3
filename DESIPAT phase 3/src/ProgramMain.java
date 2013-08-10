
import Model.AbstractFactory.DBConnectionFactory;
import View.Builders.AbstractFormBuilder;
import View.Builders.Form;
import View.Builders.FormDirector;
import View.Builders.LoginBuilder;
import java.sql.Connection;
import java.sql.SQLException;

//PROGRAM STARTS HERE

/**
 *
 * @author Jan
 */
 //Real Driver of the whole Program. Everything starts here.
 //You look nice today ;D
public class ProgramMain {
    
    public static void main(String args[]) throws SQLException{
     AbstractFormBuilder builder = new LoginBuilder();
     FormDirector f = new FormDirector();
     f.setBuilder(builder);
     Form login = f.construct();
     login.setVisible(true);
     login.setLocationRelativeTo(null);  
     
     
    }
    
    
}
