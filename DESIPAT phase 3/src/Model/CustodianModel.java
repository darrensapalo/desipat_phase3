package Model;

import Model.Bean.User;
import Model.Strategy.AddCustodian;

public class CustodianModel extends UserModel {

	public CustodianModel() {
		super();
	}
	
	public CustodianModel(User user) {
		super(user);
	}
	
	@Override
	public boolean addToDatabase() {
		user.setUserColumns(new AddCustodian().getColumns());
		return super.addToDatabase("custodian");
	}
	
	@Override
	public boolean login() {
		return super.login("custodian");
	}
	
	@Override
	protected void fetchUserId() {
		super.fetchUserId("custodian");
	}
}
