/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import Controller.listeners.DeleteAssetHandler;
import View.DeleteAsset;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;

/**
 *
 * @author Jan
 */
public class DeleteAssetBuilder extends AbstractFormBuilder {
    
    private DeleteAsset d;
    

    @Override
    public void populateForm() {
        
        d = new DeleteAsset();
        super.form = this.d;
		//Buttons use a Factory to set the name and add an ActionListener
         AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
        
        d.setLbAssetName(new javax.swing.JLabel());
        d.setPasswordField(new javax.swing.JPasswordField());
        d.setbtnDelete(btnFactory.createButton("Delete Asset", new DeleteAssetHandler(d)));
        d.setjLabel1(new javax.swing.JLabel());
        d.setjLabel2(new javax.swing.JLabel());
        d.setjLabel3(new javax.swing.JLabel());
        
    
    }

    @Override
    public void setFormProperties() {
        d.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        d.setTitle("Delete Asset");
        d.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        d.setResizable(false);
    }

    @Override
    public void setLayout() {
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(d.getContentPane());
        d.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(d.getbtnDelete())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(d.getjLabel1())
                            .addComponent(d.getjLabel2()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d.getLbAssetName(), javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(d.getjLabel3()))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d.getjLabel1())
                    .addComponent(d.getLbAssetName(), javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(d.getjLabel3(), javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d.getjLabel2())
                    .addComponent(d.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(d.getbtnDelete())
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }

    @Override
    public void setComponentProperties() {
        d.getjLabel1().setText("Name of Asset:");

        d.getjLabel2().setText("Password:");

        d.getLbAssetName().setOpaque(true);

        d.getjLabel3().setText("Please enter Password to confirm");
    }
}
