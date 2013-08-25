/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import Controller.listeners.AssetViewerHandler;
import View.AssetViewer;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;

/**
 *
 * @author Jan
 */
public class AssetViewerBuilder extends AbstractFormBuilder {
    
    private AssetViewer a;
    

    @Override
    public void populateForm() {
        
        a = new AssetViewer();
        super.form = this.a;
		////Buttons use a Factory to set the name and add an ActionListener
		 
        
        AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
        
        a.setbtnEdit(btnFactory.createButton("Edit Asset", new AssetViewerHandler(a)));  
        a.setjLabel1(new javax.swing.JLabel());  
        a.setjLabel10(new javax.swing.JLabel());  
        a.setjLabel11(new javax.swing.JLabel());  
        a.setjLabel12(new javax.swing.JLabel());  
        a.setjLabel2(new javax.swing.JLabel());  
        a.setjLabel22(new javax.swing.JLabel());  
        a.setjLabel24(new javax.swing.JLabel());  
        a.setjLabel26(new javax.swing.JLabel());  
        a.setjLabel3(new javax.swing.JLabel());  
        a.setjLabel4(new javax.swing.JLabel());  
        a.setjLabel5(new javax.swing.JLabel());  
        a.setjLabel6(new javax.swing.JLabel());  
        a.setjLabel7(new javax.swing.JLabel());  
        a.setjLabel8(new javax.swing.JLabel());  
        a.setjLabel9(new javax.swing.JLabel());  
        a.setjPanel1(new javax.swing.JPanel());  
        a.setjPanel2(new javax.swing.JPanel());  
        a.setjScrollPane1(new javax.swing.JScrollPane());
        a.setlistPreviousOwners(new javax.swing.JList());
        a.setlbAssetID(new javax.swing.JLabel());  
        a.setlbAssetName(new javax.swing.JLabel());  
        a.setlbAvailability(new javax.swing.JLabel());  
        a.setlbClassification(new javax.swing.JLabel());  
        a.setlbConfidentiality(new javax.swing.JLabel());  
        a.setlbCustodian(new javax.swing.JLabel());  
        a.setlbDate(new javax.swing.JLabel());  
        a.setlbFinancial(new javax.swing.JLabel());  
        a.setlbIntegrity(new javax.swing.JLabel());  
        a.setlbMaintenance(new javax.swing.JLabel());  
        a.setlbOwner(new javax.swing.JLabel());  
        a.setlbPreviousOwner(new javax.swing.JLabel());  
        a.setlbRetention(new javax.swing.JLabel());  
        a.setlbStorage(new javax.swing.JLabel());  
        a.setlbType(new javax.swing.JLabel());  
        
        
    }

    @Override
    public void setFormProperties() {
        a.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        a.setTitle("Asset Viewer");
        a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        a.setResizable(false);
    }

    @Override
    public void setLayout() {
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(a.getjPanel1());
        a.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a.getLbAssetName())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a.getLbAssetName())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(a.getjPanel2());
        a.getjPanel2().setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a.getjScrollPane1(), javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a.getjLabel3()))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a.getjLabel3())
                .addGap(14, 14, 14)
                .addComponent(a.getjScrollPane1(), javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(a.getContentPane());
        a.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(a.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a.getjLabel12())
                    .addComponent(a.getjLabel11())
                    .addComponent(a.getjLabel10())
                    .addComponent(a.getjLabel9())
                    .addComponent(a.getjLabel8())
                    .addComponent(a.getjLabel7())
                    .addComponent(a.getjLabel6())
                    .addComponent(a.getjLabel5())
                    .addComponent(a.getjLabel4())
                    .addComponent(a.getjLabel2())
                    .addComponent(a.getjLabel22())
                    .addComponent(a.getjLabel24())
                    .addComponent(a.getjLabel26())
                    .addComponent(a.getjLabel1()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a.getLbAssetID(), javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a.getLbOwner())
                            .addComponent(a.getLbCustodian())
                            .addComponent(a.getLbType())
                            .addComponent(a.getLbDate())
                            .addComponent(a.getLbRetention())
                            .addComponent(a.getLbMaintenance())
                            .addComponent(a.getLbFinancial())
                            .addComponent(a.getLbClassification())
                            .addComponent(a.getLbStorage())
                            .addComponent(a.getLbConfidentiality())
                            .addComponent(a.getLbAvailability())
                            .addComponent(a.getLbIntegrity())
                            .addComponent(a.getLbPreviousOwner()))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(a.getbtnEdit(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(a.getjPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(a.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel2())
                            .addComponent(a.getLbAssetID()))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel4())
                            .addComponent(a.getLbOwner()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel1())
                            .addComponent(a.getLbPreviousOwner()))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel5())
                            .addComponent(a.getLbCustodian()))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel6())
                            .addComponent(a.getLbType()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel7())
                            .addComponent(a.getLbDate()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel8())
                            .addComponent(a.getLbRetention()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel9())
                            .addComponent(a.getLbMaintenance()))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel10())
                            .addComponent(a.getLbFinancial()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel26())
                            .addComponent(a.getLbIntegrity()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getLbConfidentiality())
                            .addComponent(a.getjLabel22()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel24())
                            .addComponent(a.getLbAvailability()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel11())
                            .addComponent(a.getLbClassification()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(a.getjLabel12())
                            .addComponent(a.getLbStorage()))
                        .addGap(27, 27, 27)
                        .addComponent(a.getbtnEdit()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a.getjPanel2(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

    }

    @Override
    public void setComponentProperties() {
        
        a.getjPanel1().setBackground(new java.awt.Color(0, 102, 102));
        a.getjPanel1().setForeground(new java.awt.Color(0, 204, 0));

        a.getLbAssetName().setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        a.getLbAssetName().setForeground(new java.awt.Color(255, 255, 255));
        a.getLbAssetName().setText("Asset Name");

        a.getjLabel2().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel2().setText("Asset ID:");

        a.getLbAssetID().setText("a.getjLabel3");

        a.getjLabel4().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel4().setText("Owner:");

        a.getjLabel5().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel5().setText("Custodian:");

        a.getjLabel6().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel6().setText("Type:");

        a.getjLabel7().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel7().setText("Date Acquired:");

        a.getjLabel8().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel8().setText("Retention Period:");

        a.getjLabel9().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel9().setText("Maintenance Schedule:");

        a.getjLabel10().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel10().setText("Financial Value:");

        a.getjLabel11().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel11().setText("Classification:");

        a.getjLabel12().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel12().setText("Storage Location:");

	a.getbtnEdit().setText("Edit Asset");

        a.getjLabel22().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel22().setText("Confidentiality Value:");

        a.getLbConfidentiality().setText("a.getjLabel23");

        a.getjLabel24().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel24().setText("Availability Value:");

        a.getLbAvailability().setText("a.getjLabel25");

        a.getjLabel26().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel26().setText("Integrity Value:");

        a.getLbIntegrity().setText("a.getjLabel27");

        a.getjLabel1().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        a.getjLabel1().setText("Previous Owner:");

        a.getLbPreviousOwner().setText("a.getjLabel3");

        a.getjPanel2().setBackground(new java.awt.Color(255, 255, 255));
        a.getjPanel2().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        a.getjPanel2().setInheritsPopupMenu(true);

        a.getListPreviousOwners().setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        a.getListPreviousOwners().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        a.getListPreviousOwners().setToolTipText("List of Previous Owners");
        a.getjScrollPane1().setViewportView(a.getListPreviousOwners());

        a.getjLabel3().setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        a.getjLabel3().setForeground(new java.awt.Color(0, 102, 102));
        a.getjLabel3().setText("Previous Owners");
    }
    
}
