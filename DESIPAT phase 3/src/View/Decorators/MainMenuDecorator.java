/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Decorators;

import View.Builders.Form;
import View.MainMenu;

/**
 *
 * @author Jan
 */
public class MainMenuDecorator extends AbstractDecorator {
    //Decorator to turn owner menu to custodian menu.
    public Form toD; //Form to Decorate
    
    public MainMenuDecorator(Form f){
        toD = f;
    }

    @Override
    public Form getForm() {
        MainMenu m = (MainMenu)toD;
        m.getBtAdd().setVisible(false);
        m.getBtDelete().setEnabled(false);
        m.getjLabel1().setText("                                        ");//PADDING FOR JPANEL TO SET THE RIGHT SIZE
        m.getjLabel5().setText("          ");
        
        m.getLbUserType().setText("Logged in as Custodian");
        m.getLbID().setText("Your Custodian ID: "+ m.getUserID());
        m.getjLabel2().setText("Assets You Handle");
        
        
        m.pack();
        toD = m;
        return toD;
    }
}
