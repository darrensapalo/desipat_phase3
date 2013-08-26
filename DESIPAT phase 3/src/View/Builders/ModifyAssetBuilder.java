/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;
import Controller.ModifyAssetHandler;
import View.ModifyAsset;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;
/**
 *
 * @author DJ
 */
 //By default, this builder builds an Add Asset form for owners. For Editing, we use a ModifyAssetDecorator to alter some
 //of the components. For Editing as a custodian, there is another decorator for that.
public class ModifyAssetBuilder extends AbstractPageBuilder{
    
    private ModifyAsset m;

    @Override
    public void populateForm() {
         m = new ModifyAsset();
         super.page = this.m;
		//Buttons use a Factory to set the name and add an ActionListener
		 
         ModifyAssetHandler mah = new ModifyAssetHandler(m);
         AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
         
        m.setjScrollPane1(new javax.swing.JScrollPane());
        m.setjList1(new javax.swing.JList());
        m.setBtnAddEdit(btnFactory.createButton("Add this Asset",mah));
        m.setjPanel1(new javax.swing.JPanel());
        m.setTfType(new javax.swing.JTextField());
        m.setjLabel1(new javax.swing.JLabel());
        m.setTfAssetName(new javax.swing.JTextField());
        m.setjLabel4(new javax.swing.JLabel());
        m.setjPanel2(new javax.swing.JPanel());
        m.setTfCustodian(new javax.swing.JTextField());
        m.setjLabel3(new javax.swing.JLabel());
        m.setTfStorage(new javax.swing.JTextField());
        m.setjLabel10(new javax.swing.JLabel());
        m.setjLabel2(new javax.swing.JLabel());
        m.setTfOwner(new javax.swing.JTextField());
        m.setjPanel3(new javax.swing.JPanel());
        m.setjLabel6(new javax.swing.JLabel());
        m.setjLabel5(new javax.swing.JLabel());
        m.setjLabel7(new javax.swing.JLabel());
        m.setCbMaintenance(new javax.swing.JComboBox());
        m.setDccDateAcquired(new datechooser.beans.DateChooserCombo());
        m.setDccRetentionPeriod(new datechooser.beans.DateChooserCombo());
        m.setjPanel4(new javax.swing.JPanel());
        m.setjLabel13(new javax.swing.JLabel());
        m.setCbConfidentiality(new javax.swing.JComboBox());
        m.setCbAvailability(new javax.swing.JComboBox());
        m.setCbIntegrity(new javax.swing.JComboBox());
        m.setjLabel12(new javax.swing.JLabel());
        m.setjLabel8(new javax.swing.JLabel());
        m.setjLabel11(new javax.swing.JLabel());
        m.setTfFinancial(new javax.swing.JTextField());
        m.setjPanel5(new javax.swing.JPanel());
        m.setCbClassification(new javax.swing.JComboBox());
        m.setjLabel9(new javax.swing.JLabel());
        m.setLbReminder(new javax.swing.JLabel());
    }

    @Override
    public void setFormProperties() {
        m.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        m.setTitle("Add Asset");
        m.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m.setResizable(false);
    }

    @Override
    public void setComponentProperties() {
       m.getjList1().setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        m.getjScrollPane1().setViewportView(m.getjList1());

        m.getjPanel1().setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m.getjLabel1().setText("Name of Asset:");

        m.getjLabel4().setText("Type of Asset:");
        
        m.getjLabel3().setText("Custodian ID:");

        m.getjLabel10().setText("Storage Location:");

        m.getjLabel2().setText("Owner ID:");
        
        m.getjPanel3().setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m.getjLabel6().setText("Retention Period:");

        m.getjLabel5().setText("Date Acquired:");

        m.getjLabel7().setText("Maintenance Schedule:");

        m.getCbMaintenance().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Every week", "Every month", "Every year" }));
        
        m.getjPanel4().setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m.getjLabel13().setText("Availability Value:");

        m.getCbConfidentiality().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Mid", "Low" }));

        m.getCbAvailability().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Mid", "Low" }));

        m.getCbIntegrity().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "High", "Mid", "Low" }));

        m.getjLabel12().setText("Integrity Value:");

        m.getjLabel8().setText("Financial Value:");

        m.getjLabel11().setText("Confidentiality Value:");
        
        m.getjPanel5().setBorder(javax.swing.BorderFactory.createEtchedBorder());

        m.getCbClassification().setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sensitive", "Confidential", "Internal", "Public" }));

        m.getjLabel9().setText("Classification:");
        
        m.getLbReminder().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        
        m.getLbReminder().setForeground(new java.awt.Color(255, 0, 0));
        
        m.getTfOwner().setEnabled(false);
    }

    @Override
    public void setLayout() {
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(m.getjPanel1());
        m.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m.getjLabel1())
                    .addComponent(m.getjLabel4()))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m.getTfType(), javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m.getTfAssetName(), javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getTfAssetName(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m.getjLabel1()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getTfType(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m.getjLabel4()))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(m.getjPanel2());
        m.getjPanel2().setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(m.getjLabel10())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(m.getjLabel2())
                            .addComponent(m.getjLabel3()))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(m.getTfCustodian(), javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(m.getTfStorage(), javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m.getTfOwner()))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getjLabel2())
                    .addComponent(m.getTfOwner(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getjLabel3())
                    .addComponent(m.getTfCustodian(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getTfStorage(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m.getjLabel10()))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(m.getjPanel3());
        m.getjPanel3().setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(m.getjLabel7())
                        .addGap(18, 18, 18)
                        .addComponent(m.getCbMaintenance(), 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m.getjLabel5())
                            .addComponent(m.getjLabel6()))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(m.getDccDateAcquired(), javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(m.getDccRetentionPeriod(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m.getjLabel5())
                    .addComponent(m.getDccDateAcquired(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(m.getjLabel6())
                    .addComponent(m.getDccRetentionPeriod(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getjLabel7())
                    .addComponent(m.getCbMaintenance(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(m.getjPanel4());
        m.getjPanel4().setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(m.getjLabel8())
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(m.getTfFinancial(), javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(m.getjLabel12())
                                    .addComponent(m.getjLabel11())
                                    .addComponent(m.getjLabel13()))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(m.getCbConfidentiality(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m.getCbIntegrity(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(m.getCbAvailability(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m.getjLabel8())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getTfFinancial(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getjLabel11())
                    .addComponent(m.getCbConfidentiality(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getjLabel12())
                    .addComponent(m.getCbIntegrity(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m.getjLabel13())
                    .addComponent(m.getCbAvailability(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(m.getjPanel5());
        m.getjPanel5().setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(m.getjLabel9())
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(m.getCbClassification(), 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m.getjLabel9())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getCbClassification(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(m.getContentPane());
        m.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m.getjPanel2(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m.getjPanel3(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(m.getjPanel4(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(m.getjPanel5(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(m.getBtnAddEdit())
                                .addGap(31, 31, 31))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m.getLbReminder())
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(m.getLbReminder())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getjPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getjPanel3(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m.getjPanel5(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(m.getBtnAddEdit()))
                    .addComponent(m.getjPanel4(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

    }    
}
