package Model;

import Model.Strategy.AddCustodian;

public class Custodian extends User {

	public Custodian() {
		super();
	}
	
	public Custodian(String username, String password) {
		super(username, password);
	}
	
	@Override
	public boolean addToDatabase() {
		this.setUserColumns(new AddCustodian().getColumns());
		return super.addToDatabase("custodian");
	}
	
	@Override
	public boolean login() {
		return super.login("custodian");
	}	
}
