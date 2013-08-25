package View;

import datechooser.beans.DateChooserCombo;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Renz
 */
public class ModifyAsset extends Form {

    /**
     * Creates new form ModifyAsset
     */
    private int AssetID;
    private Integer PreviousOwnerID;
    
    public ModifyAsset(){
        
    }
    
    public void setValues(String usertype, String username, int userID) {

        this.username = username;
        this.userType = usertype;
        
        tfOwner.setText(Integer.toString(userID));
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getAssetID() {
        return AssetID;
    }

    public void setAssetID(Integer AssetID) {
        this.AssetID = AssetID;
    }

    public Integer getPreviousOwnerID() {
        return PreviousOwnerID;
    }

    public void setPreviousOwnerID(Integer PreviousOwnerID) {
        this.PreviousOwnerID = PreviousOwnerID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public JButton getBtnAddEdit() {
        return btnAddEdit;
    }

    public void setBtnAddEdit(JButton btnAddEdit) {
        this.btnAddEdit = btnAddEdit;
    }

    public JComboBox getCbAvailability() {
        return cbAvailability;
    }

    public void setCbAvailability(JComboBox cbAvailability) {
        this.cbAvailability = cbAvailability;
    }

    public JComboBox getCbClassification() {
        return cbClassification;
    }

    public void setCbClassification(JComboBox cbClassification) {
        this.cbClassification = cbClassification;
    }

    public JComboBox getCbConfidentiality() {
        return cbConfidentiality;
    }

    public void setCbConfidentiality(JComboBox cbConfidentiality) {
        this.cbConfidentiality = cbConfidentiality;
    }

    public JComboBox getCbIntegrity() {
        return cbIntegrity;
    }

    public void setCbIntegrity(JComboBox cbIntegrity) {
        this.cbIntegrity = cbIntegrity;
    }

    public JComboBox getCbMaintenance() {
        return cbMaintenance;
    }

    public void setCbMaintenance(JComboBox cbMaintenance) {
        this.cbMaintenance = cbMaintenance;
    }

    public DateChooserCombo getDccDateAcquired() {
        return dccDateAcquired;
    }

    public void setDccDateAcquired(DateChooserCombo dccDateAcquired) {
        this.dccDateAcquired = dccDateAcquired;
    }

    public DateChooserCombo getDccRetentionPeriod() {
        return dccRetentionPeriod;
    }

    public void setDccRetentionPeriod(DateChooserCombo dccRetentionPeriod) {
        this.dccRetentionPeriod = dccRetentionPeriod;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
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

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JList getjList1() {
        return jList1;
    }

    public void setjList1(JList jList1) {
        this.jList1 = jList1;
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

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JPanel getjPanel4() {
        return jPanel4;
    }

    public void setjPanel4(JPanel jPanel4) {
        this.jPanel4 = jPanel4;
    }

    public JPanel getjPanel5() {
        return jPanel5;
    }

    public void setjPanel5(JPanel jPanel5) {
        this.jPanel5 = jPanel5;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getLbReminder() {
        return lbReminder;
    }

    public void setLbReminder(JLabel lbReminder) {
        this.lbReminder = lbReminder;
    }

    public JTextField getTfAssetName() {
        return tfAssetName;
    }

    public void setTfAssetName(JTextField tfAssetName) {
        this.tfAssetName = tfAssetName;
    }

    public JTextField getTfCustodian() {
        return tfCustodian;
    }

    public void setTfCustodian(JTextField tfCustodian) {
        this.tfCustodian = tfCustodian;
    }

    public JTextField getTfFinancial() {
        return tfFinancial;
    }

    public void setTfFinancial(JTextField tfFinancial) {
        this.tfFinancial = tfFinancial;
    }

    public JTextField getTfOwner() {
        return tfOwner;
    }

    public void setTfOwner(JTextField tfOwner) {
        this.tfOwner = tfOwner;
    }

    public JTextField getTfStorage() {
        return tfStorage;
    }

    public void setTfStorage(JTextField tfStorage) {
        this.tfStorage = tfStorage;
    }

    public JTextField getTfType() {
        return tfType;
    }

    public void setTfType(JTextField tfType) {
        this.tfType = tfType;
    }
    
    

    
    
    /**
     * @param args the command line arguments
     */
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEdit;
    private javax.swing.JComboBox cbAvailability;
    private javax.swing.JComboBox cbClassification;
    private javax.swing.JComboBox cbConfidentiality;
    private javax.swing.JComboBox cbIntegrity;
    private javax.swing.JComboBox cbMaintenance;
    private datechooser.beans.DateChooserCombo dccDateAcquired;
    private datechooser.beans.DateChooserCombo dccRetentionPeriod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbReminder;
    private javax.swing.JTextField tfAssetName;
    private javax.swing.JTextField tfCustodian;
    private javax.swing.JTextField tfFinancial;
    private javax.swing.JTextField tfOwner;
    private javax.swing.JTextField tfStorage;
    private javax.swing.JTextField tfType;
    // End of variables declaration//GEN-END:variables
}