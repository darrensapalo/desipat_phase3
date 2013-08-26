/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Decorators;

import View.Page;

/**
 *
 * @author Jan
 */
public abstract class AbstractDecorator extends Page {
    
    Page toDecorate;
    
    public abstract Page getForm();
    
}
