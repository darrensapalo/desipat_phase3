/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Builders;

import Controller.LoginMenuHandler;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;
import View.LoginMenu;

/**
 *
 * @author DJ
 */
public class LoginBuilder extends AbstractFormBuilder {

    private LoginMenu l;
    
    @Override
    public void populateForm() {
         l = new LoginMenu();
         
		 //Buttons use a Factory to set the name and add an ActionListener
		 
         AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
         LoginMenuHandler lh = new LoginMenuHandler(l);
         
		 //Instantiate Components of LoginBuilder
		 
         l.setBtLogin(btnFactory.createButton("Login",lh));
         l.setBtnRegister(btnFactory.createButton("Register Now",lh));
         l.setPfPassword(new javax.swing.JPasswordField());
         l.setTfUsername(new javax.swing.JTextField());
         l.setLbError(new javax.swing.JLabel());
         l.setBtnGrp(new javax.swing.ButtonGroup());
         l.setjLabel1(new javax.swing.JLabel());
         l.setjLabel2(new javax.swing.JLabel());
         l.setjLabel3(new javax.swing.JLabel());
         l.setjLabel4(new javax.swing.JLabel());
         l.setjLabel5(new javax.swing.JLabel());
         l.setjPanel1(new javax.swing.JPanel());
         l.setjSeparator1(new javax.swing.JSeparator());
         l.setRbCustodian(new javax.swing.JRadioButton());
         l.setRbOwner(new javax.swing.JRadioButton());
         
    }

    @Override
    public void setFormProperties() {
        l.setTitle("Asset Management System");
        l.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        l.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        l.setResizable(false);
    }

    @Override
    public void setComponentProperties() {
        l.getjPanel1().setBackground(new java.awt.Color(0, 102, 102));
        l.getjLabel5().setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l.getjLabel5().setForeground(new java.awt.Color(255, 255, 255));
        l.getjLabel5().setText("Asset Management System");
        l.getjLabel1().setText("Username:");
        l.getjLabel2().setText("Password:");
        l.getBtnRegister().setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        l.getjLabel3().setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        l.getjLabel3().setText("Not a user yet?");

        l.getjLabel4().setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        l.getjLabel4().setText("Login");

        l.getjSeparator1().setOrientation(javax.swing.SwingConstants.VERTICAL);

        l.getLbError().setForeground(new java.awt.Color(255, 51, 0));

        l.getBtnGrp().add(l.getRbOwner());
        l.getRbOwner().setText("Owner");
        l.getRbOwner().setActionCommand("");

        l.getBtnGrp().add(l.getRbCustodian());
        l.getRbCustodian().setText("Custodian");
        l.getRbCustodian().setActionCommand("");
    }

    @Override
    public void setLayout() {
	//Uses GroupLayout to JPanels to set Layout of the components.
	
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(l.getjPanel1());
        l.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l.getjLabel5())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l.getjLabel5())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //To extend user types, put RadioButton components here.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(l.getContentPane());
        l.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(l.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l.getjLabel1())
                            .addComponent(l.getjLabel4())
                            .addComponent(l.getTfUsername(), javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l.getRbOwner())
                            .addComponent(l.getRbCustodian())
                            .addComponent(l.getLbError())
                            .addComponent(l.getPfPassword(), javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l.getjLabel2())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(l.getBtLogin())))
                .addGap(39, 39, 39)
                .addComponent(l.getjSeparator1(), javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l.getBtnRegister())
                    .addComponent(l.getjLabel3()))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(l.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l.getjSeparator1())
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(l.getjLabel3())
                                .addGap(18, 18, 18)
                                .addComponent(l.getBtnRegister())
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l.getjLabel4())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l.getRbOwner())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l.getRbCustodian())
                                .addGap(17, 17, 17)
                                .addComponent(l.getjLabel1())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l.getTfUsername(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(l.getjLabel2())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l.getPfPassword(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l.getLbError())
                        .addGap(25, 25, 25)
                        .addComponent(l.getBtLogin())
                        .addGap(42, 42, 42))))
        );

    }


    @Override
    public Form getForm() {
      l.pack();
        return l;
    }
    
}
