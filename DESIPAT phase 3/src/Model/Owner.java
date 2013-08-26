package Model;

import Model.Strategy.AddOwner;

public class Owner extends User {

	public Owner() {
		super();
	}
	
	public Owner(String username, String password) {
		super(username, password);
	}
	
	@Override
	public boolean addToDatabase() {
		this.setUserColumns(new AddOwner().getColumns());
		return super.addToDatabase("owner");
	}

	@Override
	public boolean login() {
		return super.login("owner");
	}

}
