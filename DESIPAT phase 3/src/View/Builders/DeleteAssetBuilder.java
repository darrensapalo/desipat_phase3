/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import java.awt.event.ActionListener;

import View.DeleteAsset;
import View.Page;

/**
 *
 * @author Jan
 */
public class DeleteAssetBuilder extends AbstractPageBuilder {
    
    private DeleteAsset deleteAsset;

    @Override
    public void initializeComponents() {
        deleteAsset.setLbAssetName(new javax.swing.JLabel());
        deleteAsset.setPasswordField(new javax.swing.JPasswordField());
        //d.setbtnDelete(btnFactory.createButton("Delete Asset", new DeleteAssetHandler(d)));
        deleteAsset.setbtnDelete(new javax.swing.JButton("Delete Asset"));
        deleteAsset.setjLabel1(new javax.swing.JLabel());
        deleteAsset.setjLabel2(new javax.swing.JLabel());
        deleteAsset.setjLabel3(new javax.swing.JLabel());
        deleteAsset.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        deleteAsset.setTitle("Delete Asset");
        deleteAsset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteAsset.setResizable(false);
        
        deleteAsset.getjLabel1().setText("Name of Asset:");

        deleteAsset.getjLabel2().setText("Password:");

        deleteAsset.getLbAssetName().setOpaque(true);

        deleteAsset.getjLabel3().setText("Please enter Password to confirm");
	}
    @Override
    public void initializePageLayout() {
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(deleteAsset.getContentPane());
        deleteAsset.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteAsset.getbtnDelete())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteAsset.getjLabel1())
                            .addComponent(deleteAsset.getjLabel2()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteAsset.getLbAssetName(), javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteAsset.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteAsset.getjLabel3()))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAsset.getjLabel1())
                    .addComponent(deleteAsset.getLbAssetName(), javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(deleteAsset.getjLabel3(), javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteAsset.getjLabel2())
                    .addComponent(deleteAsset.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(deleteAsset.getbtnDelete())
                .addContainerGap(14, Short.MAX_VALUE))
        );
	}

    @Override
    public Page selectConcretePage() {
        return deleteAsset = new DeleteAsset();
    }

	@Override
	protected void setActionListener(ActionListener listener) {
		deleteAsset.getbtnDelete().addActionListener(listener);	
	}
}
