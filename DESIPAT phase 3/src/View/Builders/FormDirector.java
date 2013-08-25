package View.Builders;

import View.Form;

/**
 *
 * @author Jan
 */

// Director of all Form Builders.
public class FormDirector {
    
    AbstractFormBuilder b;
    
    public void setBuilder(AbstractFormBuilder b) {
        this.b = b;
    }
    
    public Form construct() {
        b.populateForm();
        b.setFormProperties();
        b.setComponentProperties();
        b.setLayout();
        
        return b.getForm();
    }
}
