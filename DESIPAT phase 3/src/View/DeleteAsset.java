/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


//import Controller.DeleteAssetHandler;

//import java.sql.ResultSet;
//import java.sql.SQLException;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
/**
 *
 * @author DJ
 */
public class DeleteAsset extends Page {

    /**
     * Creates new form DeleteAsset
     */
    private String PW;
    private Integer aID;
    
    public void setPW(String pw) {
        PW = pw;
    }

    /*  
    public void setValues(ResultSet Asset, String confirmPassword, String userType, String username) {
        
        this.userType = userType;
        this.username = username;
        
        
        //initComponents();
        this.PW = confirmPassword;
        
         try
        {
            Asset.next();
            
            AssetName.setText((Asset.getString("assetname")));
            aID = Asset.getInt("assetID");
           
        
        }catch(SQLException s){
                    System.out.println("SQLException:");
                    System.out.println("\tSQL Error code: "+s.getErrorCode());
                    System.out.println("\tSQL State: "+s.getSQLState());
                }
    }
*/
    
    public DeleteAsset() {
      //initComponents();
        
      this.setLocationRelativeTo(null);
      this.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    public JLabel getLbAssetName() {
        return AssetName;
    }

    public void setLbAssetName(JLabel AssetName) {
        this.AssetName = AssetName;
    }

    public JPasswordField getPasswordField() {
        return Password;
    }
    
    public String getDecipheredPassword(){
        char[] c = Password.getPassword();
        String s = String.valueOf(c);
        return s;
    }

    public String getPW() {
        return PW;
    }

    public Integer getaID() {
        return aID;
    }
    
    public void setaID(int aid) {
        aID = aid;
    }
    
    public String getUserType() {
        return userType;
    }

    public String getUsername() {
        return username;
    }

    public JLabel getAssetName() {
        return AssetName;
    }
    
    public void setAssetName(String value) {
        AssetName.setText(value);
    }
    
    public JButton getBtDelete() {
        return btDelete;
    }

    public void setPasswordField(JPasswordField Password) {
        this.Password = Password;
    }

    public JButton getbtnDelete() {
        return btDelete;
    }

    public void setbtnDelete(JButton btDelete) {
        this.btDelete = btDelete;
    }

    public void addBtnDeleteListener(ActionListener listener) {
        btDelete.addActionListener(listener);
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

    /**
     * @param args the command line arguments
     */
    
    //public String getAssetName() {
     //   return AssetN.getText();
    //}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AssetName;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton btDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void addActionListener(ActionListener listener) {
        // TODO Auto-generated method stub
        
    }
}
