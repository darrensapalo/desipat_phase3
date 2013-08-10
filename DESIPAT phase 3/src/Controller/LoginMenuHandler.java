/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Register;
import View.MainMenu;
import View.LoginMenu;
import Model.DBHandler;
import View.Builders.AbstractFormBuilder;
import View.Builders.Form;
import View.Builders.FormDirector;
import View.Builders.MainMenuBuilder;
import View.Builders.RegisterBuilder;
import View.Decorators.MainMenuDecorator;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Renz
 */
public class LoginMenuHandler implements ActionListener {
    private LoginMenu l;
    
    public LoginMenuHandler(LoginMenu l){
        this.l = l;
    }
    
    public void actionPerformed(ActionEvent e) {
        DBHandler b = new DBHandler();
        AbstractFormBuilder builder;
        FormDirector f = new FormDirector();
        //this area of the code checks if the user wants to login or to register a new user account
        if(e.getSource().equals(l.getBtLogin())){
		//this area of the code checks the user type of the user logging in
            switch (l.getRbGrp()) {
                case "Owner":
                    if(b.userLogin(l, "Owner") == true){
                    l.dispose();
                    
                    builder = new MainMenuBuilder();
                        f.setBuilder(builder);
                        Form mainmenu = f.construct();
                        
                        MainMenu m = (MainMenu) mainmenu;
                        m.setValues("owner", b.listAsset("owner", l.getTfUsername().getText()), l.getTfUsername().getText(), l.getDecipheredPassword(l.getPfPassword()),Integer.parseInt(b.getUserID("Owner",l.getTfUsername().getText())));
                        mainmenu = m;
                        mainmenu.setVisible(true);
                        mainmenu.setLocationRelativeTo(null);
                        
                    b.addActivityLog("Logged In", "owner", l.getTfUsername().getText());
                    }
                    break;
                case "Custodian":
                    if(b.userLogin(l, "Custodian") == true){
                        l.dispose();
                        builder=new MainMenuBuilder();
                        f.setBuilder(builder);
                        Form mainmenu = f.construct();
                        
                        MainMenu m = (MainMenu) mainmenu;
                        m.setValues("custodian", b.listAsset("custodian", l.getTfUsername().getText()), l.getTfUsername().getText(), l.getDecipheredPassword(l.getPfPassword()),Integer.parseInt(b.getUserID("Custodian",l.getTfUsername().getText())));
                        mainmenu = m;
                        
                        Form Deco = new MainMenuDecorator(mainmenu);
                        mainmenu = Deco.getForm();
                        
                        mainmenu.setVisible(true);
                        
                        mainmenu.setLocationRelativeTo(null);
                        
                        b.addActivityLog("Logged In", "custodian", l.getTfUsername().getText());
                    }
                    break;
            }
        }
        else if (e.getSource().equals(l.getBtnRegister())){
            builder=new RegisterBuilder();
            f.setBuilder(builder);
            Form r = f.construct();
            
            r.setVisible(true);
            r.setLocationRelativeTo(null);
        }
    }
    
}
