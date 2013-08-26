/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import Controller.AssetViewerHandler;
import View.AssetViewer;
import View.Page;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;

/**
 *
 * @author Jan
 */
public class AssetViewerBuilder extends AbstractPageBuilder {
    
    private AssetViewer assetViewer;
    

    @Override
    public void initializeComponents() {
        
		////Buttons use a Factory to set the name and add an ActionListener
		 
        
        AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
        
        assetViewer.setbtnEdit(btnFactory.createButton("Edit Asset", new AssetViewerHandler(assetViewer)));  
        assetViewer.setjLabel1(new javax.swing.JLabel());  
        assetViewer.setjLabel10(new javax.swing.JLabel());  
        assetViewer.setjLabel11(new javax.swing.JLabel());  
        assetViewer.setjLabel12(new javax.swing.JLabel());  
        assetViewer.setjLabel2(new javax.swing.JLabel());  
        assetViewer.setjLabel22(new javax.swing.JLabel());  
        assetViewer.setjLabel24(new javax.swing.JLabel());  
        assetViewer.setjLabel26(new javax.swing.JLabel());  
        assetViewer.setjLabel3(new javax.swing.JLabel());  
        assetViewer.setjLabel4(new javax.swing.JLabel());  
        assetViewer.setjLabel5(new javax.swing.JLabel());  
        assetViewer.setjLabel6(new javax.swing.JLabel());  
        assetViewer.setjLabel7(new javax.swing.JLabel());  
        assetViewer.setjLabel8(new javax.swing.JLabel());  
        assetViewer.setjLabel9(new javax.swing.JLabel());  
        assetViewer.setjPanel1(new javax.swing.JPanel());  
        assetViewer.setjPanel2(new javax.swing.JPanel());  
        assetViewer.setjScrollPane1(new javax.swing.JScrollPane());
        assetViewer.setlistPreviousOwners(new javax.swing.JList());
        assetViewer.setlbAssetID(new javax.swing.JLabel());  
        assetViewer.setlbAssetName(new javax.swing.JLabel());  
        assetViewer.setlbAvailability(new javax.swing.JLabel());  
        assetViewer.setlbClassification(new javax.swing.JLabel());  
        assetViewer.setlbConfidentiality(new javax.swing.JLabel());  
        assetViewer.setlbCustodian(new javax.swing.JLabel());  
        assetViewer.setlbDate(new javax.swing.JLabel());  
        assetViewer.setlbFinancial(new javax.swing.JLabel());  
        assetViewer.setlbIntegrity(new javax.swing.JLabel());  
        assetViewer.setlbMaintenance(new javax.swing.JLabel());  
        assetViewer.setlbOwner(new javax.swing.JLabel());  
        assetViewer.setlbPreviousOwner(new javax.swing.JLabel());  
        assetViewer.setlbRetention(new javax.swing.JLabel());  
        assetViewer.setlbStorage(new javax.swing.JLabel());  
        assetViewer.setlbType(new javax.swing.JLabel());  
        
        
        assetViewer.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        assetViewer.setTitle("Asset Viewer");
        assetViewer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        assetViewer.setResizable(false);
        
        assetViewer.getjPanel1().setBackground(new java.awt.Color(0, 102, 102));
        assetViewer.getjPanel1().setForeground(new java.awt.Color(0, 204, 0));

        assetViewer.getLbAssetName().setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        assetViewer.getLbAssetName().setForeground(new java.awt.Color(255, 255, 255));
        assetViewer.getLbAssetName().setText("Asset Name");

        assetViewer.getjLabel2().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel2().setText("Asset ID:");

        assetViewer.getLbAssetID().setText("a.getjLabel3");

        assetViewer.getjLabel4().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel4().setText("Owner:");

        assetViewer.getjLabel5().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel5().setText("Custodian:");

        assetViewer.getjLabel6().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel6().setText("Type:");

        assetViewer.getjLabel7().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel7().setText("Date Acquired:");

        assetViewer.getjLabel8().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel8().setText("Retention Period:");

        assetViewer.getjLabel9().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel9().setText("Maintenance Schedule:");

        assetViewer.getjLabel10().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel10().setText("Financial Value:");

        assetViewer.getjLabel11().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel11().setText("Classification:");

        assetViewer.getjLabel12().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel12().setText("Storage Location:");

        assetViewer.getbtnEdit().setText("Edit Asset");

        assetViewer.getjLabel22().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel22().setText("Confidentiality Value:");

        assetViewer.getLbConfidentiality().setText("a.getjLabel23");

        assetViewer.getjLabel24().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel24().setText("Availability Value:");

        assetViewer.getLbAvailability().setText("a.getjLabel25");

        assetViewer.getjLabel26().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel26().setText("Integrity Value:");

        assetViewer.getLbIntegrity().setText("a.getjLabel27");

        assetViewer.getjLabel1().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        assetViewer.getjLabel1().setText("Previous Owner:");

        assetViewer.getLbPreviousOwner().setText("a.getjLabel3");

        assetViewer.getjPanel2().setBackground(new java.awt.Color(255, 255, 255));
        assetViewer.getjPanel2().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        assetViewer.getjPanel2().setInheritsPopupMenu(true);

        assetViewer.getListPreviousOwners().setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        assetViewer.getListPreviousOwners().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        assetViewer.getListPreviousOwners().setToolTipText("List of Previous Owners");
        assetViewer.getjScrollPane1().setViewportView(assetViewer.getListPreviousOwners());

        assetViewer.getjLabel3().setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        assetViewer.getjLabel3().setForeground(new java.awt.Color(0, 102, 102));
        assetViewer.getjLabel3().setText("Previous Owners");
        
        
    }
    
    @Override
    public void initializePageLayout() {
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(assetViewer.getjPanel1());
        assetViewer.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assetViewer.getLbAssetName())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assetViewer.getLbAssetName())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(assetViewer.getjPanel2());
        assetViewer.getjPanel2().setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assetViewer.getjScrollPane1(), javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(assetViewer.getjLabel3()))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assetViewer.getjLabel3())
                .addGap(14, 14, 14)
                .addComponent(assetViewer.getjScrollPane1(), javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(assetViewer.getContentPane());
        assetViewer.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(assetViewer.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(assetViewer.getjLabel12())
                    .addComponent(assetViewer.getjLabel11())
                    .addComponent(assetViewer.getjLabel10())
                    .addComponent(assetViewer.getjLabel9())
                    .addComponent(assetViewer.getjLabel8())
                    .addComponent(assetViewer.getjLabel7())
                    .addComponent(assetViewer.getjLabel6())
                    .addComponent(assetViewer.getjLabel5())
                    .addComponent(assetViewer.getjLabel4())
                    .addComponent(assetViewer.getjLabel2())
                    .addComponent(assetViewer.getjLabel22())
                    .addComponent(assetViewer.getjLabel24())
                    .addComponent(assetViewer.getjLabel26())
                    .addComponent(assetViewer.getjLabel1()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assetViewer.getLbAssetID(), javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assetViewer.getLbOwner())
                            .addComponent(assetViewer.getLbCustodian())
                            .addComponent(assetViewer.getLbType())
                            .addComponent(assetViewer.getLbDate())
                            .addComponent(assetViewer.getLbRetention())
                            .addComponent(assetViewer.getLbMaintenance())
                            .addComponent(assetViewer.getLbFinancial())
                            .addComponent(assetViewer.getLbClassification())
                            .addComponent(assetViewer.getLbStorage())
                            .addComponent(assetViewer.getLbConfidentiality())
                            .addComponent(assetViewer.getLbAvailability())
                            .addComponent(assetViewer.getLbIntegrity())
                            .addComponent(assetViewer.getLbPreviousOwner()))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addComponent(assetViewer.getbtnEdit(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(assetViewer.getjPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(assetViewer.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel2())
                            .addComponent(assetViewer.getLbAssetID()))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel4())
                            .addComponent(assetViewer.getLbOwner()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel1())
                            .addComponent(assetViewer.getLbPreviousOwner()))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel5())
                            .addComponent(assetViewer.getLbCustodian()))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel6())
                            .addComponent(assetViewer.getLbType()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel7())
                            .addComponent(assetViewer.getLbDate()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel8())
                            .addComponent(assetViewer.getLbRetention()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel9())
                            .addComponent(assetViewer.getLbMaintenance()))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel10())
                            .addComponent(assetViewer.getLbFinancial()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel26())
                            .addComponent(assetViewer.getLbIntegrity()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getLbConfidentiality())
                            .addComponent(assetViewer.getjLabel22()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel24())
                            .addComponent(assetViewer.getLbAvailability()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel11())
                            .addComponent(assetViewer.getLbClassification()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(assetViewer.getjLabel12())
                            .addComponent(assetViewer.getLbStorage()))
                        .addGap(27, 27, 27)
                        .addComponent(assetViewer.getbtnEdit()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assetViewer.getjPanel2(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

    }

	@Override
	public Page selectConcretePage() {
		return assetViewer = new AssetViewer();
	}
    
}
