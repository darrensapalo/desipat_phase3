package View.Builders;

import java.awt.event.ActionListener;

import View.Page;

/**
 *
 * @author Jan
 */
// Abstract class of the builder pattern
public abstract class AbstractPageBuilder {
    
	protected Page page;
    
	
	/***
	 * Instantiates the page's components, initializes their component properties such as position and size,
	 * and adds them correspondingly.
	 */
	protected abstract void initializeComponents();
	
	/**
	 * Initializes the page's layout, as necessary.
	 */
	protected abstract void initializePageLayout();
	
	/**
	 * Returns the concrete type of page to be built.
	 * @return the page to be built, as specified in the View class.
	 */
	protected abstract Page selectConcretePage(); 
	
	/**
	 * Sets the ActionListener to handle events in the page.
	 */
	protected abstract void setActionListener(ActionListener listener);
	
    public Page constructPage() {
    	page = selectConcretePage();
    	initializeComponents();
    	initializePageLayout();
    	page.pack();
    	return page;
    }
    
}
