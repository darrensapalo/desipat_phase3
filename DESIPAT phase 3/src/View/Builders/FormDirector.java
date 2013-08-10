/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

/**
 *
 * @author Jan
 */
public class FormDirector {
    
    AbstractFormBuilder b;
	//Director of all Form Builders.
    
    public void setBuilder(AbstractFormBuilder b){
        this.b = b;
    }
    public Form construct(){
        b.populateForm();
        b.setFormProperties();
        b.setComponentProperties();
        b.setLayout();
        
        return b.getForm();
    }
}
