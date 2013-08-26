package View.Builders;

import Controller.RegisterHandler;
import View.Page;
import View.Register;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;

/**
 *
 * @author Jan
 */
public class RegisterBuilder extends AbstractPageBuilder{

	private Register register;

	@Override
	protected void initializeComponents() {
		//Buttons use a Factory to set the name and add an ActionListener

		AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
		RegisterHandler rh = new RegisterHandler(register);

		register.setButtonGroup1(new javax.swing.ButtonGroup());
		register.setButtonGroup2(new javax.swing.ButtonGroup());
		register.setBtSignUp(btnFactory.createButton("Register",rh));
		register.setRbOwner(new javax.swing.JRadioButton());
		register.setRbCustodian(new javax.swing.JRadioButton());
		register.setjLabel5(new javax.swing.JLabel());
		register.setjPanel1(new javax.swing.JPanel());
		register.setjLabel1(new javax.swing.JLabel());
		register.setTfLast(new javax.swing.JTextField());
		register.setTfFirst(new javax.swing.JTextField());
		register.setjLabel6(new javax.swing.JLabel());
		register.setjPanel2(new javax.swing.JPanel());
		register.setjLabel3(new javax.swing.JLabel());
		register.setjLabel2(new javax.swing.JLabel());
		register.setPfConfirmPassword(new javax.swing.JPasswordField());
		register.setjLabel4(new javax.swing.JLabel());
		register.setPfPassword(new javax.swing.JPasswordField());
		register.setTfUsername(new javax.swing.JTextField());
		register.setLbError(new javax.swing.JLabel());

		register.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		register.setTitle("Register a User");
		register.setResizable(false);
		register.setLocationRelativeTo(null);

		register.getBtSignUp().setText("Register");

		register.getButtonGroup2().add(register.getRbOwner());
		register.getRbOwner().setText("Owner");

		register.getButtonGroup2().add(register.getRbCustodian());
		register.getRbCustodian().setText("Custodian");

		//To add more usertypes, create a new RadioButton and add it to ButtonGroup2.

		register.getjLabel5().setText("Type of User");

		register.getjPanel1().setBorder(javax.swing.BorderFactory.createEtchedBorder());

		register.getjLabel1().setText("First Name:");

		register.getjLabel6().setText("Last Name:");

		register.getjPanel2().setBorder(javax.swing.BorderFactory.createEtchedBorder());

		register.getjLabel3().setText("Password:");

		register.getjLabel2().setText("Username:");

		register.getjLabel4().setText("Confirm Password:");

		register.getLbError().setForeground(new java.awt.Color(204, 0, 51));
	}

	@Override
	protected void initializePageLayout() {
		//Uses GroupLayout to JPanels to set Layout of the components.
		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(register.getjPanel1());
		register.getjPanel1().setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(register.getjLabel1())
								.addComponent(register.getjLabel6()))
								.addGap(18, 18, 18)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(register.getTfFirst(), javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
										.addComponent(register.getTfLast(), javax.swing.GroupLayout.Alignment.TRAILING))
										.addContainerGap())
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(register.getTfFirst(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(register.getjLabel1()))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(register.getjLabel6())
										.addComponent(register.getTfLast(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap())
				);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(register.getjPanel2());
		register.getjPanel2().setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGap(50, 50, 50)
										.addComponent(register.getjLabel3()))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
												.addContainerGap()
												.addComponent(register.getjLabel2()))
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addContainerGap()
														.addComponent(register.getjLabel4())))
														.addGap(18, 18, 18)
														.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
																.addComponent(register.getTfUsername(), javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
																.addComponent(register.getPfPassword())
																.addComponent(register.getPfConfirmPassword()))
																.addContainerGap(23, Short.MAX_VALUE))
																.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
																		.addGap(0, 0, Short.MAX_VALUE)
																		.addComponent(register.getLbError(), javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(25, 25, 25))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(register.getjLabel2())
								.addComponent(register.getTfUsername(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(register.getPfPassword(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(register.getjLabel3()))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(register.getPfConfirmPassword(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(register.getjLabel4()))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(register.getLbError(), javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(register.getContentPane());
		register.getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addContainerGap()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addGap(28, 28, 28)
														.addComponent(register.getjLabel5())
														.addGap(18, 18, 18)
														.addComponent(register.getRbOwner())
														.addGap(18, 18, 18)
														.addComponent(register.getRbCustodian()))
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(register.getjPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(register.getjPanel1(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
																.addGap(0, 0, Short.MAX_VALUE))
																.addGroup(layout.createSequentialGroup()
																		.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(register.getBtSignUp())))
																		.addContainerGap())
				);
		//If you wish to extend more user types, add more radio buttons here.
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap(11, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(register.getRbOwner())
								.addComponent(register.getRbCustodian())
								.addComponent(register.getjLabel5()))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(register.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(register.getjPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(register.getBtSignUp())
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);

	}

	@Override
	protected Page selectConcretePage() {
		return register = new Register();
	}   
}
