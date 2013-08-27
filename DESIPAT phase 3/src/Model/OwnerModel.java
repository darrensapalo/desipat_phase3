package Model;

import Model.Bean.User;
import Model.Strategy.AddOwner;

public class OwnerModel extends UserModel {

	public OwnerModel() {
		super();
	}

	
	public OwnerModel(User user) {
		super(user);
	}
	
	@Override
	public boolean addToDatabase() {
	    user.setUserColumns(new AddOwner().getColumns());
		return super.addToDatabase("owner");
	}

	@Override
	public boolean login() {
		return super.login("owner");
	}


	@Override
	protected void fetchUserId() {
		super.fetchUserId("owner");
	}

}
