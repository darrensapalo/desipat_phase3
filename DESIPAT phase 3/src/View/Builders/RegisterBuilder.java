package View.Builders;

import Controller.RegisterHandler;
import View.Register;
import View.AbstractFactories.AbstractButtonFactory;
import View.AbstractFactories.ConcreteButtonFactory;

/**
 *
 * @author Jan
 */
public class RegisterBuilder extends AbstractFormBuilder{
    
    private Register r;

    @Override
    public void populateForm() {
        r = new Register();
        super.form = this.r;
		//Buttons use a Factory to set the name and add an ActionListener
		
        AbstractButtonFactory btnFactory = new ConcreteButtonFactory();
        RegisterHandler rh = new RegisterHandler(r);
        
        r.setButtonGroup1(new javax.swing.ButtonGroup());
        r.setButtonGroup2(new javax.swing.ButtonGroup());
        r.setBtSignUp(btnFactory.createButton("Register",rh));
        r.setRbOwner(new javax.swing.JRadioButton());
        r.setRbCustodian(new javax.swing.JRadioButton());
        r.setjLabel5(new javax.swing.JLabel());
        r.setjPanel1(new javax.swing.JPanel());
        r.setjLabel1(new javax.swing.JLabel());
        r.setTfLast(new javax.swing.JTextField());
        r.setTfFirst(new javax.swing.JTextField());
        r.setjLabel6(new javax.swing.JLabel());
        r.setjPanel2(new javax.swing.JPanel());
        r.setjLabel3(new javax.swing.JLabel());
        r.setjLabel2(new javax.swing.JLabel());
        r.setPfConfirmPassword(new javax.swing.JPasswordField());
        r.setjLabel4(new javax.swing.JLabel());
        r.setPfPassword(new javax.swing.JPasswordField());
        r.setTfUsername(new javax.swing.JTextField());
        r.setLbError(new javax.swing.JLabel());
    }

    @Override
    public void setFormProperties() {
        r.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        r.setTitle("Register a User");
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }

    @Override
    public void setComponentProperties() {
        r.getBtSignUp().setText("Register");

        r.getButtonGroup2().add(r.getRbOwner());
        r.getRbOwner().setText("Owner");

        r.getButtonGroup2().add(r.getRbCustodian());
        r.getRbCustodian().setText("Custodian");
		
		//To add more usertypes, create a new RadioButton and add it to ButtonGroup2.

        r.getjLabel5().setText("Type of User");

        r.getjPanel1().setBorder(javax.swing.BorderFactory.createEtchedBorder());

        r.getjLabel1().setText("First Name:");

        r.getjLabel6().setText("Last Name:");
        
        r.getjPanel2().setBorder(javax.swing.BorderFactory.createEtchedBorder());

        r.getjLabel3().setText("Password:");

        r.getjLabel2().setText("Username:");
        
         r.getjLabel4().setText("Confirm Password:");

        r.getLbError().setForeground(new java.awt.Color(204, 0, 51));
    }

    @Override
    public void setLayout() {
	//Uses GroupLayout to JPanels to set Layout of the components.
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(r.getjPanel1());
        r.getjPanel1().setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(r.getjLabel1())
                    .addComponent(r.getjLabel6()))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r.getTfFirst(), javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(r.getTfLast(), javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r.getTfFirst(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r.getjLabel1()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r.getjLabel6())
                    .addComponent(r.getTfLast(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(r.getjPanel2());
        r.getjPanel2().setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(r.getjLabel3()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r.getjLabel2()))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(r.getjLabel4())))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r.getTfUsername(), javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(r.getPfPassword())
                    .addComponent(r.getPfConfirmPassword()))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(r.getLbError(), javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r.getjLabel2())
                    .addComponent(r.getTfUsername(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r.getPfPassword(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r.getjLabel3()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r.getPfConfirmPassword(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r.getjLabel4()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r.getLbError(), javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(r.getContentPane());
        r.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(r.getjLabel5())
                                .addGap(18, 18, 18)
                                .addComponent(r.getRbOwner())
                                .addGap(18, 18, 18)
                                .addComponent(r.getRbCustodian()))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(r.getjPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(r.getjPanel1(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(r.getBtSignUp())))
                .addContainerGap())
        );
		//If you wish to extend more user types, add more radio buttons here.
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(r.getRbOwner())
                    .addComponent(r.getRbCustodian())
                    .addComponent(r.getjLabel5()))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r.getjPanel1(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r.getjPanel2(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r.getBtSignUp())
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }   
}
