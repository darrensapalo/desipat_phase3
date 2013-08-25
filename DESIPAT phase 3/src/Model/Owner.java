package Model;

public class Owner extends User {

	public Owner(String username, String password) {
		super(username, password);
	}
	
	@Override
	public void addToDatabase() {
		// TODO Implement addToDatabase for Owner

	}

	public boolean login() {
		return super.login("owner");
	}

}
