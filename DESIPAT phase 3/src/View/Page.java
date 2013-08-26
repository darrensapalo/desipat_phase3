package View;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jan
 */
// Superclass of all forms.

@SuppressWarnings("serial")
public abstract class Page extends JFrame {

    protected String userType; //stores the userType (owner or custodian)
    protected String username; //stores username
    protected String password; //stores password
    
	public String getUsername() {
		return username;
	}
	
	public abstract void addActionListener(ActionListener listener);
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
    
    private void displayMessage(String message, int messageType) {
    	JOptionPane.showMessageDialog(this, message, this.getTitle(), messageType);
    }
    
    public void displayInformationMessage(String message) {
    	this.displayMessage(message, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void displayErrorMessage(String message) {
    	this.displayMessage(message, JOptionPane.ERROR_MESSAGE);
    }
}
