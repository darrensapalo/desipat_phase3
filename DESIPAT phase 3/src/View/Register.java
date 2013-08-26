package View;

import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author DJ
 */
@SuppressWarnings("serial")
public class Register extends Page {

    public void setErrorMessage(String error) {
        this.lbError.setText(error);
    }

    public JButton getBtSignUp() {
        return btSignUp;
    }

    public void setBtSignUp(JButton btSignUp) {
        this.btSignUp = btSignUp;
    }
    
    public void addActionListener(ActionListener listener) {
        btSignUp.addActionListener(listener);
    }
    
    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public ButtonGroup getButtonGroup2() {
        return buttonGroup2;
    }

    public void setButtonGroup2(ButtonGroup buttonGroup2) {
        this.buttonGroup2 = buttonGroup2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JLabel getLbError() {
        return lbError;
    }

    public void setLbError(JLabel lbError) {
        this.lbError = lbError;
    }

    public JPasswordField getPfConfirmPassword() {
        return pfConfirmPassword;
    }

    public void setPfConfirmPassword(JPasswordField pfConfirmPassword) {
        this.pfConfirmPassword = pfConfirmPassword;
    }

    public JPasswordField getPfPassword() {
        return pfPassword;
    }

    public void setPfPassword(JPasswordField pfPassword) {
        this.pfPassword = pfPassword;
    }

    public JRadioButton getRbCustodian() {
        return rbCustodian;
    }

    public void setRbCustodian(JRadioButton rbCustodian) {
        this.rbCustodian = rbCustodian;
    }

    public JRadioButton getRbOwner() {
        return rbOwner;
    }

    public void setRbOwner(JRadioButton rbOwner) {
        this.rbOwner = rbOwner;
    }

    public JTextField getFirstNameField() {
        return tfFirst;
    }

    public void setTfFirst(JTextField tfFirst) {
        this.tfFirst = tfFirst;
    }

    public JTextField getLastNameField() {
        return tfLast;
    }

    public void setTfLast(JTextField tfLast) {
        this.tfLast = tfLast;
    }

    public JTextField getTfUsername() {
        return tfUsername;
    }

    public void setTfUsername(JTextField tfUsername) {
        this.tfUsername = tfUsername;
    }
    public String getDecipheredPassword(JPasswordField pf){
        char[] c = pf.getPassword();
        String s = String.valueOf(c);
        return s;
    }
    
    
    public boolean allFieldsValid() {
    	if (tfFirst.getText().trim().length() == 0 ||
				tfLast.getText().trim().length() == 0 ||
				tfUsername.getText().trim().length() == 0 ||
				getDecipheredPassword(pfPassword).length() == 0 || 
				getDecipheredPassword(pfConfirmPassword).length() == 0) {
			return false;
		}
		return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSignUp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbError;
    private javax.swing.JPasswordField pfConfirmPassword;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JRadioButton rbCustodian;
    private javax.swing.JRadioButton rbOwner;
    private javax.swing.JTextField tfFirst;
    private javax.swing.JTextField tfLast;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
