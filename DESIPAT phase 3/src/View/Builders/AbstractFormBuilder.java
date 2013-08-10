/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

/**
 *
 * @author Jan
 */
public abstract class AbstractFormBuilder {
    
    //abstract class of the builder pattern
    public abstract void populateForm(); //instantiate the components
    public abstract void setFormProperties(); //sets the properties of the form (if it's rezisable, dispose on close etc.)
    public abstract void setComponentProperties(); //sets the properties of the component (text in labels, style of buttons etc.)
    public abstract void setLayout(); //sets the layout of the form
    public abstract Form getForm(); //gets the Form so it can be used
    
}
