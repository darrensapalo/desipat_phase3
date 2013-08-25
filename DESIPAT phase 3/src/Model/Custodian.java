package Model;

public class Custodian extends User {

	public Custodian(String username, String password) {
		super(username, password);
	}
	
	@Override
	public void addToDatabase() {
		// TODO Implement addToDatabase() for Custodian
		
	}

	public boolean login() {
		return super.login("custodian");
	}	
}
