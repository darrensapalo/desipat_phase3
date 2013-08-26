
import Controller.PageDirector;
import View.Builders.AbstractPageBuilder;
import View.Builders.MainMenuBuilder;
import View.Builders.RegisterBuilder;
import View.Decorators.MainMenuDecorator;
import View.Page;
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
         AbstractPageBuilder builder = new MainMenuBuilder();
         PageDirector f = new PageDirector();
         f.buildPage(builder);
         Page mainmenu = f.construct();
         mainmenu.setVisible(true);
         mainmenu.setLocationRelativeTo(null);
         
         
         //REGISTER
         builder = new RegisterBuilder();
         f.buildPage(builder);
         Page register = f.construct();
         register.setVisible(true);
         register.setLocationRelativeTo(null);
         
         //DECORATOR MAINMENU
         Page Deco = new MainMenuDecorator(mainmenu);
         mainmenu = Deco.getForm();
         mainmenu.setVisible(true);
         mainmenu.setLocationRelativeTo(null);
         
         
         
         
    }
}
