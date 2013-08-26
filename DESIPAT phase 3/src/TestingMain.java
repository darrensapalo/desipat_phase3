
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
         Page mainmenu = PageDirector.buildPage(new MainMenuBuilder());
         mainmenu.setVisible(true);
         mainmenu.setLocationRelativeTo(null);
         
         
         //REGISTER
         
         Page register = PageDirector.buildPage(new RegisterBuilder());
         register.setVisible(true);
         register.setLocationRelativeTo(null);
         
         //DECORATOR MAINMENU
         mainmenu = new MainMenuDecorator(mainmenu);
         mainmenu.setVisible(true);
         mainmenu.setLocationRelativeTo(null);
         

    }
}
