/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.AbstractFactories;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Jan
 */
public interface AbstractButtonFactory {
    
    public JButton createButton(String text, ActionListener al);
    
}
