/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import java.awt.event.ActionListener;

import View.MainMenu;
import View.Page;

/**
 *
 * @author Jan
 */
 
 //By default, this builder builds a MainMenu form for the owner. For custodians, the program uses
 //a decorator to alter the properties of some components.
public class MainMenuBuilder extends AbstractPageBuilder {
    
    private MainMenu mainMenu;
    
	@Override
	protected void initializeComponents() {
		
		//Buttons use a Factory to set the name and add an ActionListener
		
        //AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
        //MainMenuHandler mh = new MainMenuHandler(m);
        
		//Instantiate components of MainMenu. To set the values of some components like listOfAsset, use setValues in MainMenu class.
        mainMenu.setjPanel2(new javax.swing.JPanel());
        mainMenu.setjLabel5(new javax.swing.JLabel());
        //m.setBtAdd(btnFactory.createButton("Add Asset",mh));
        mainMenu.setBtAdd(new javax.swing.JButton("Add Asset"));
        mainMenu.setjSeparator1(new javax.swing.JSeparator());
        mainMenu.setjLabel1(new javax.swing.JLabel());
        mainMenu.setjPanel3(new javax.swing.JPanel());
        mainMenu.setLbName(new javax.swing.JLabel());
        mainMenu.setLbUserType(new javax.swing.JLabel());
        mainMenu.setLbID(new javax.swing.JLabel());
        //m.setBtLogout(btnFactory.createButton("Logout",mh));
        mainMenu.setBtLogout(new javax.swing.JButton("Logout"));
        mainMenu.setjLabel2(new javax.swing.JLabel());
        mainMenu.setjPanel1(new javax.swing.JPanel());
        mainMenu.setjLabel3(new javax.swing.JLabel());
        //m.setBtEdit(btnFactory.createButton("Edit Asset",mh));
        mainMenu.setBtEdit(new javax.swing.JButton("Edit Asset"));
        //m.setBtDelete(btnFactory.createButton("Delete Asset",mh));
        mainMenu.setBtDelete(new javax.swing.JButton("Delete Asset"));
        //m.setBtView(btnFactory.createButton("View Asset",mh));
        mainMenu.setBtView(new javax.swing.JButton("View Asset"));
        mainMenu.setjScrollPane2(new javax.swing.JScrollPane());
        mainMenu.setListOfAsset(new javax.swing.JList());
        //m.setBtRefresh(btnFactory.createButton("Refresh",mh));
        mainMenu.setBtRefresh(new javax.swing.JButton("Refresh"));
		
		// TODO Auto-generated method stub
        mainMenu.getjPanel2().setBackground(new java.awt.Color(255, 255, 255));
        mainMenu.getjPanel2().setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mainMenu.getjLabel5().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mainMenu.getjLabel5().setText("Asset Management");
        
        mainMenu.getjLabel1().setText("For Owners Only");

        mainMenu.getjPanel3().setBackground(new java.awt.Color(0, 102, 102));

        mainMenu.getLbName().setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mainMenu.getLbName().setForeground(new java.awt.Color(255, 255, 255));
        mainMenu.getLbName().setText("Custodian");

        mainMenu.getLbUserType().setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        mainMenu.getLbUserType().setForeground(new java.awt.Color(255, 255, 255));
        mainMenu.getLbUserType().setText("Login ID");

        mainMenu.getLbID().setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        mainMenu.getLbID().setForeground(new java.awt.Color(255, 255, 255));
        mainMenu.getLbID().setText("m.getjLabel1()");

        mainMenu.getBtLogout().setText("Logout");
        
        mainMenu.getjLabel2().setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mainMenu.getjLabel2().setText("Your Assets");

        mainMenu.getjPanel1().setBackground(new java.awt.Color(0, 102, 102));

        mainMenu.getjLabel3().setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        mainMenu.getjLabel3().setForeground(new java.awt.Color(255, 255, 255));
        mainMenu.getjLabel3().setText("Main Menu");
        
        mainMenu.getListOfAsset().setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        mainMenu.getjScrollPane2().setViewportView(mainMenu.getListOfAsset());
	}

	@Override
	protected void initializePageLayout() {

        mainMenu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        mainMenu.setTitle("Main Menu - Asset Management System");
        mainMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainMenu.setResizable(false);
    	
	//Uses group layout to set components' arrangement in the form.
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(mainMenu.getjPanel3());
        mainMenu.getjPanel3().setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainMenu.getLbName())
                    .addComponent(mainMenu.getLbUserType())
                    .addComponent(mainMenu.getLbID()))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenu.getBtLogout(), javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenu.getLbName())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu.getLbUserType())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu.getLbID())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(mainMenu.getBtLogout())
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(mainMenu.getjPanel2());
        mainMenu.getjPanel2().setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainMenu.getjPanel3(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainMenu.getjSeparator1(), javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mainMenu.getjLabel5())
                            .addComponent(mainMenu.getBtAdd(), javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainMenu.getjLabel1()))
                        .addGap(0, 58, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenu.getjPanel3(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainMenu.getjSeparator1(), javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu.getjLabel5())
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainMenu.getjLabel1())
                .addGap(18, 18, 18)
                .addComponent(mainMenu.getBtAdd())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

       

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(mainMenu.getjPanel1());
        mainMenu.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainMenu.getjLabel3(), javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(mainMenu.getjLabel3())
                .addContainerGap(20, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(mainMenu.getContentPane());
        mainMenu.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainMenu.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainMenu.getjLabel2())
                        .addGap(9, 9, 9)
                        .addComponent(mainMenu.getBtRefresh(), javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(mainMenu.getBtView())
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainMenu.getBtEdit(), javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainMenu.getBtDelete()))
                    .addComponent(mainMenu.getjScrollPane2(), javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(mainMenu.getjPanel2(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainMenu.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mainMenu.getjLabel2())
                            .addComponent(mainMenu.getBtRefresh()))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mainMenu.getjScrollPane2(), javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mainMenu.getBtEdit())
                            .addComponent(mainMenu.getBtDelete())
                            .addComponent(mainMenu.getBtView())))
                    .addComponent(mainMenu.getjPanel2(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
	}

	@Override
	protected Page selectConcretePage() {
		return mainMenu = new MainMenu();
	}

	@Override
	protected void setActionListener(ActionListener listener) {
		mainMenu.getBtAdd().addActionListener(listener);
		mainMenu.getBtLogout().addActionListener(listener);
		mainMenu.getBtEdit().addActionListener(listener);
		mainMenu.getBtDelete().addActionListener(listener);
		mainMenu.getBtView().addActionListener(listener);
		mainMenu.getBtRefresh().addActionListener(listener);
	}
    
}
