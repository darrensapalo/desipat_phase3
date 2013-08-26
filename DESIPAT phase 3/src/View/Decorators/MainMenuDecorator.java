/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Decorators;

import java.awt.event.ActionListener;

import View.Page;
import View.MainMenu;

/**
 *
 * @author Jan
 */
public class MainMenuDecorator extends AbstractDecorator {
    //Decorator to turn owner menu to custodian menu.
    public Page toD; //Form to Decorate
    
    public MainMenuDecorator(Page f){
        toD = f;
    }

    @Override
    public Page getForm() {
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

	@Override
	public void addActionListener(ActionListener listener) {
		// TODO Auto-generated method stub
		
	}
}
