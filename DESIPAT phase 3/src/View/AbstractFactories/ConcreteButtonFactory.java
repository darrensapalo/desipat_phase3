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
public class ConcreteButtonFactory implements AbstractButtonFactory{
//creates a button that requires the programmer to add an actionListener to avoid unresponsive buttons.

    @Override
    public JButton createButton(String text, ActionListener al) {
        JButton b = new JButton(text);
        b.setFocusable(false);
        b.addActionListener(al);
        return b;
    }
    
}
