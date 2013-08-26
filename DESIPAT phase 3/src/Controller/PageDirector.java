package Controller;

import View.Page;
import View.Builders.AbstractPageBuilder;

/**
 *
 * @author Jan
 */

// Director of all Form Builders.
public class PageDirector {
    public static Page buildPage(AbstractPageBuilder b) {
        return b.constructPage();
    }
    
    private PageDirector(){
    	
    }
    
}
