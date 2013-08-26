package Controller;

import View.Page;
import View.Builders.AbstractPageBuilder;

/**
 *
 * @author Jan
 */

// Director of all Form Builders.
public class PageDirector {
    
    AbstractPageBuilder b;
    
    public Page setBuilder(AbstractPageBuilder b) {
        this.b = b;
        b.populateForm();
        b.setFormProperties();
        b.setComponentProperties();
        b.setLayout();
        return b.getPage();
    }
    
}
