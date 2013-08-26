/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Jan
 * 
 */

@SuppressWarnings("serial")
public class LoginMenu extends Page {
    
	
	
    public JButton getLoginButton() {
        return btLogin;
    }

    public void setBtLogin(JButton btLogin) {
        this.btLogin = btLogin;
    }

    public ButtonGroup getBtnGrp() {
        return btnGrp;
    }

    public void setBtnGrp(ButtonGroup btnGrp) {
        this.btnGrp = btnGrp;
    }

    public JButton getRegisterButton() {
        return btnRegister;
    }

    public void setBtnRegister(JButton btnRegister) {
        this.btnRegister = btnRegister;
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

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JSeparator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JSeparator jSeparator1) {
        this.jSeparator1 = jSeparator1;
    }

    public JLabel getLbError() {
        return lbError;
    }

    public void setLbError(JLabel lbError) {
        this.lbError = lbError;
    }

    public JPasswordField getPasswordField() {
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

    public JTextField getUsernameField() {
        return tfUsername;
    }

    public void setTfUsername(JTextField tfUsername) {
        this.tfUsername = tfUsername;
    }
    
    public String getUserType(){
        if(rbOwner.isSelected())
            return "Owner";
        else
            return "Custodian";
    }
    
    public String getDecipheredPassword(JPasswordField pf){
        char[] c = pf.getPassword();
        String s = String.valueOf(c);
        return s;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.ButtonGroup btnGrp;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbError;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JRadioButton rbCustodian;
    private javax.swing.JRadioButton rbOwner;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    

}
