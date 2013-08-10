/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import javax.swing.JFrame;

/**
 *
 * @author Jan
 */
public abstract class Form extends JFrame{

//superclass of all forms.
    
    protected String userType; //stores the userType (owner or custodian)
    protected String username; //stores username
    protected String password; //stores password
    
    public Form getForm(){
        return this;
    }
    
    
}
