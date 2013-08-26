/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import Controller.MainMenuHandler;
import View.MainMenu;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;

/**
 *
 * @author Jan
 */
 
 //By default, this builder builds a MainMenu form for the owner. For custodians, the program uses
 //a decorator to alter the properties of some components.
public class MainMenuBuilder extends AbstractPageBuilder {
    
    private MainMenu m;
    

    @Override
    public void populateForm() {
        
        m = new MainMenu();
        super.page = this.m;
		//Buttons use a Factory to set the name and add an ActionListener
		 
        
		
        AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
        MainMenuHandler mh = new MainMenuHandler(m);
        
		//Instantiate components of MainMenu. To set the values of some components like listOfAsset, use setValues in MainMenu class.
        m.setjPanel2(new javax.swing.JPanel());
        m.setjLabel5(new javax.swing.JLabel());
        m.setBtAdd(btnFactory.createButton("Add Asset",mh));
        m.setjSeparator1(new javax.swing.JSeparator());
        m.setjLabel1(new javax.swing.JLabel());
        m.setjPanel3(new javax.swing.JPanel());
        m.setLbName(new javax.swing.JLabel());
        m.setLbUserType(new javax.swing.JLabel());
        m.setLbID(new javax.swing.JLabel());
        m.setBtLogout(btnFactory.createButton("Logout",mh));
        m.setjLabel2(new javax.swing.JLabel());
        m.setjPanel1(new javax.swing.JPanel());
        m.setjLabel3(new javax.swing.JLabel());
        m.setBtEdit(btnFactory.createButton("Edit Asset",mh));
        m.setBtDelete(btnFactory.createButton("Delete Asset",mh));
        m.setBtView(btnFactory.createButton("View Asset",mh));
        m.setjScrollPane2(new javax.swing.JScrollPane());
        m.setListOfAsset(new javax.swing.JList());
        m.setBtRefresh(btnFactory.createButton("Refresh",mh));
    }

    @Override
    public void setFormProperties() {
        m.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        m.setTitle("Main Menu - Asset Management System");
        m.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        m.setResizable(false);
    }

    @Override
    public void setLayout() {
	//Uses group layout to set components' arrangement in the form.
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(m.getjPanel3());
        m.getjPanel3().setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m.getLbName())
                    .addComponent(m.getLbUserType())
                    .addComponent(m.getLbID()))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(m.getBtLogout(), javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m.getLbName())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getLbUserType())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getLbID())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(m.getBtLogout())
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(m.getjPanel2());
        m.getjPanel2().setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m.getjPanel3(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(m.getjSeparator1(), javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(m.getjLabel5())
                            .addComponent(m.getBtAdd(), javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m.getjLabel1()))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m.getjPanel3(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(m.getjSeparator1(), javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getjLabel5())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(m.getjLabel1())
                .addGap(18, 18, 18)
                .addComponent(m.getBtAdd())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(m.getjPanel1());
        m.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(m.getjLabel3(), javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(m.getjLabel3())
                .addContainerGap(20, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(m.getContentPane());
        m.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(m.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(m.getjLabel2())
                        .addGap(9, 9, 9)
                        .addComponent(m.getBtRefresh(), javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(m.getBtView())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m.getBtEdit(), javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m.getBtDelete()))
                    .addComponent(m.getjScrollPane2(), javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(m.getjPanel2(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(m.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(m.getjLabel2())
                            .addComponent(m.getBtRefresh()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m.getjScrollPane2(), javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m.getBtEdit())
                            .addComponent(m.getBtDelete())
                            .addComponent(m.getBtView())))
                    .addComponent(m.getjPanel2(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }

    @Override
    public void setComponentProperties() {
        m.getjPanel2().setBackground(new java.awt.Color(255, 255, 255));
        m.getjPanel2().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        m.getjLabel5().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        m.getjLabel5().setText("Asset Management");
        
        m.getjLabel1().setText("For Owners Only");

        m.getjPanel3().setBackground(new java.awt.Color(0, 102, 102));

        m.getLbName().setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        m.getLbName().setForeground(new java.awt.Color(255, 255, 255));
        m.getLbName().setText("Custodian");

        m.getLbUserType().setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        m.getLbUserType().setForeground(new java.awt.Color(255, 255, 255));
        m.getLbUserType().setText("Login ID");

        m.getLbID().setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        m.getLbID().setForeground(new java.awt.Color(255, 255, 255));
        m.getLbID().setText("m.getjLabel1()");

        m.getBtLogout().setText("Logout");
        
        m.getjLabel2().setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        m.getjLabel2().setText("Your Assets");

        m.getjPanel1().setBackground(new java.awt.Color(0, 102, 102));

        m.getjLabel3().setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        m.getjLabel3().setForeground(new java.awt.Color(255, 255, 255));
        m.getjLabel3().setText("Main Menu");
        
        m.getListOfAsset().setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        m.getjScrollPane2().setViewportView(m.getListOfAsset());
    }
    
}
