package View.Builders;

import java.awt.event.ActionListener;

import View.LoginMenu;
import View.Page;

/**
 *
 * @author DJ
 */
public class LoginBuilder extends AbstractPageBuilder {

	private LoginMenu loginMenu;
    
	@Override
	protected void initializeComponents() {        
		 //Buttons use a Factory to set the name and add an ActionListener
        //AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
        //LoginMenuHandler lh = new LoginMenuHandler(loginMenu);
        
		 //Instantiate Components of LoginBuilder
        //loginMenu.setBtLogin(btnFactory.createButton("Login",lh));
        //loginMenu.setBtnRegister(btnFactory.createButton("Register Now",lh));
		loginMenu.setBtLogin(new javax.swing.JButton("Login"));
        loginMenu.setBtnRegister(new javax.swing.JButton("Register Now"));
        loginMenu.setPfPassword(new javax.swing.JPasswordField());
        loginMenu.setTfUsername(new javax.swing.JTextField());
        loginMenu.setLbError(new javax.swing.JLabel());
        loginMenu.setBtnGrp(new javax.swing.ButtonGroup());
        loginMenu.setjLabel1(new javax.swing.JLabel());
        loginMenu.setjLabel2(new javax.swing.JLabel());
        loginMenu.setjLabel3(new javax.swing.JLabel());
        loginMenu.setjLabel4(new javax.swing.JLabel());
        loginMenu.setjLabel5(new javax.swing.JLabel());
        loginMenu.setjPanel1(new javax.swing.JPanel());
        loginMenu.setjSeparator1(new javax.swing.JSeparator());
        loginMenu.setRbCustodian(new javax.swing.JRadioButton());
        loginMenu.setRbOwner(new javax.swing.JRadioButton());
        
        loginMenu.setTitle("Asset Management System");
        loginMenu.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        loginMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginMenu.setResizable(false);
		
        loginMenu.getjPanel1().setBackground(new java.awt.Color(0, 102, 102));
        loginMenu.getjLabel5().setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        loginMenu.getjLabel5().setForeground(new java.awt.Color(255, 255, 255));
        loginMenu.getjLabel5().setText("Asset Management System");
        loginMenu.getjLabel1().setText("Username:");
        loginMenu.getjLabel2().setText("Password:");
        loginMenu.getRegisterButton().setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        loginMenu.getjLabel3().setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        loginMenu.getjLabel3().setText("Not a user yet?");

        loginMenu.getjLabel4().setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginMenu.getjLabel4().setText("Login");

        loginMenu.getjSeparator1().setOrientation(javax.swing.SwingConstants.VERTICAL);

        loginMenu.getLbError().setForeground(new java.awt.Color(255, 51, 0));

        loginMenu.getBtnGrp().add(loginMenu.getRbOwner());
        loginMenu.getRbOwner().setText("Owner");
        loginMenu.getRbOwner().setActionCommand("");

        loginMenu.getBtnGrp().add(loginMenu.getRbCustodian());
        loginMenu.getRbCustodian().setText("Custodian");
        loginMenu.getRbCustodian().setActionCommand("");
	}

	@Override
	protected void initializePageLayout() {
		//Uses GroupLayout to JPanels to set Layout of the components.
		
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(loginMenu.getjPanel1());
        loginMenu.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginMenu.getjLabel5())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginMenu.getjLabel5())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        //To extend user types, put RadioButton components here.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(loginMenu.getContentPane());
        loginMenu.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginMenu.getjPanel1(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginMenu.getjLabel1())
                            .addComponent(loginMenu.getjLabel4())
                            .addComponent(loginMenu.getUsernameField(), javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginMenu.getRbOwner())
                            .addComponent(loginMenu.getRbCustodian())
                            .addComponent(loginMenu.getLbError())
                            .addComponent(loginMenu.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginMenu.getjLabel2())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(loginMenu.getLoginButton())))
                .addGap(39, 39, 39)
                .addComponent(loginMenu.getjSeparator1(), javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginMenu.getRegisterButton())
                    .addComponent(loginMenu.getjLabel3()))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginMenu.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginMenu.getjSeparator1())
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(loginMenu.getjLabel3())
                                .addGap(18, 18, 18)
                                .addComponent(loginMenu.getRegisterButton())
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(loginMenu.getjLabel4())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginMenu.getRbOwner())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(loginMenu.getRbCustodian())
                                .addGap(17, 17, 17)
                                .addComponent(loginMenu.getjLabel1())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginMenu.getUsernameField(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(loginMenu.getjLabel2())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginMenu.getPasswordField(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginMenu.getLbError())
                        .addGap(25, 25, 25)
                        .addComponent(loginMenu.getLoginButton())
                        .addGap(42, 42, 42))))
        );
	}

	@Override
	protected Page selectConcretePage() {
		return loginMenu = new LoginMenu();
	}

	@Override
	protected void setActionListener(ActionListener listener) {
		loginMenu.getLoginButton().addActionListener(listener);
		loginMenu.getRegisterButton().addActionListener(listener);
	}   
}
