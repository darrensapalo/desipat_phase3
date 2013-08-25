package View.Builders;

import Controller.LoginMenuHandler;
import View.LoginMenu;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;

/**
 *
 * @author DJ
 */
public class LoginBuilder extends AbstractFormBuilder {

	private LoginMenu form;
    
    @Override
    public void populateForm() {
         form = new LoginMenu();
         super.form = this.form;
         
		 //Buttons use a Factory to set the name and add an ActionListener
         AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
         LoginMenuHandler lh = new LoginMenuHandler(form);
         
		 //Instantiate Components of LoginBuilder
         form.setBtLogin(btnFactory.createButton("Login",lh));
         form.setBtnRegister(btnFactory.createButton("Register Now",lh));
         form.setPfPassword(new javax.swing.JPasswordField());
         form.setTfUsername(new javax.swing.JTextField());
         form.setLbError(new javax.swing.JLabel());
         form.setBtnGrp(new javax.swing.ButtonGroup());
         form.setjLabel1(new javax.swing.JLabel());
         form.setjLabel2(new javax.swing.JLabel());
         form.setjLabel3(new javax.swing.JLabel());
         form.setjLabel4(new javax.swing.JLabel());
         form.setjLabel5(new javax.swing.JLabel());
         form.setjPanel1(new javax.swing.JPanel());
         form.setjSeparator1(new javax.swing.JSeparator());
         form.setRbCustodian(new javax.swing.JRadioButton());
         form.setRbOwner(new javax.swing.JRadioButton());
         
    }

    @Override
    public void setFormProperties() {
        form.setTitle("Asset Management System");
        form.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        form.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        form.setResizable(false);
    }

    @Override
    public void setComponentProperties() {
        form.getjPanel1().setBackground(new java.awt.Color(0, 102, 102));
        form.getjLabel5().setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        form.getjLabel5().setForeground(new java.awt.Color(255, 255, 255));
        form.getjLabel5().setText("Asset Management System");
        form.getjLabel1().setText("Username:");
        form.getjLabel2().setText("Password:");
        form.getRegisterButton().setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        form.getjLabel3().setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        form.getjLabel3().setText("Not a user yet?");

        form.getjLabel4().setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        form.getjLabel4().setText("Login");

        form.getjSeparator1().setOrientation(javax.swing.SwingConstants.VERTICAL);

        form.getLbError().setForeground(new java.awt.Color(255, 51, 0));

        form.getBtnGrp().add(form.getRbOwner());
        form.getRbOwner().setText("Owner");
        form.getRbOwner().setActionCommand("");

        form.getBtnGrp().add(form.getRbCustodian());
        form.getRbCustodian().setText("Custodian");
        form.getRbCustodian().setActionCommand("");
    }

    @Override
    public void setLayout() {
	//Uses GroupLayout to JPanels to set Layout of the components.
	
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(form.getjPanel1());
        form.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form.getjLabel5())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(form.getjLabel5())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //To extend user types, put RadioButton components here.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(form.getContentPane());
        form.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(form.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(form.getjLabel1())
                            .addComponent(form.getjLabel4())
                            .addComponent(form.getUsernameField(), javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(form.getRbOwner())
                            .addComponent(form.getRbCustodian())
                            .addComponent(form.getLbError())
                            .addComponent(form.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(form.getjLabel2())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(form.getLoginButton())))
                .addGap(39, 39, 39)
                .addComponent(form.getjSeparator1(), javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(form.getRegisterButton())
                    .addComponent(form.getjLabel3()))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(form.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(form.getjSeparator1())
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(form.getjLabel3())
                                .addGap(18, 18, 18)
                                .addComponent(form.getRegisterButton())
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(form.getjLabel4())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(form.getRbOwner())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(form.getRbCustodian())
                                .addGap(17, 17, 17)
                                .addComponent(form.getjLabel1())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(form.getUsernameField(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(form.getjLabel2())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(form.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(form.getLbError())
                        .addGap(25, 25, 25)
                        .addComponent(form.getLoginButton())
                        .addGap(42, 42, 42))))
        );

    }   
}
