
import View.Builders.AbstractFormBuilder;
import View.Builders.Form;
import View.Builders.FormDirector;
import View.Builders.MainMenuBuilder;
import View.Builders.RegisterBuilder;
import View.Decorators.MainMenuDecorator;
import View.MainMenu;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jan
 */
 
 //FOR TESTING PURPOSES ONLY
 //Switch to this playground of you want to test something.
 
 //Nice shirt! :D
public class TestingMain {
    
    public static void main(String args[]){
        
        //MAINMENU
         AbstractFormBuilder builder = new MainMenuBuilder();
         FormDirector f = new FormDirector();
         f.setBuilder(builder);
         Form mainmenu = f.construct();
         mainmenu.setVisible(true);
         mainmenu.setLocationRelativeTo(null);
         
         
         //REGISTER
         builder = new RegisterBuilder();
         f.setBuilder(builder);
         Form register = f.construct();
         register.setVisible(true);
         register.setLocationRelativeTo(null);
         
         //DECORATOR MAINMENU
         Form Deco = new MainMenuDecorator(mainmenu);
         mainmenu = Deco.getForm();
         mainmenu.setVisible(true);
         mainmenu.setLocationRelativeTo(null);
         
         
         
         
    }
}
