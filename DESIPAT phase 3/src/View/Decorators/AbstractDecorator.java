/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Decorators;

import View.Form;

/**
 *
 * @author Jan
 */
public abstract class AbstractDecorator extends Form {
    
    Form toDecorate;
    
    @Override
    public abstract Form getForm();
    
}
