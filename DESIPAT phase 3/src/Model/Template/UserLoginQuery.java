package Model.Template;


/**
 * 
 * @author Renz
 */
public class UserLoginQuery extends Query {

	private String username;
	private String password;
	private String userType;
	
	public UserLoginQuery(String username, String password, String userType) {
		this.username = username;
		this.password = password;
		this.userType = userType;
		
		this.createQuery();
	}

	public boolean queryNeedsInsert() {
		return false;
	}

	public boolean queryNeedsUpdate() {
		return false;
	}

	public boolean queryNeedsDelete() {
		return false;
	}

	public boolean queryNeedsInto() {
		return false;
	}

	public boolean queryNeedsInnerJoin() {
		return false;
	}

	public boolean queryNeedsSet() {
		return false;
	}

	public boolean queryNeedsValues() {
		return false;
	}

	public boolean queryNeedsGroupBy() {
		return false;
	}

	public boolean queryNeedsOrderBy() {
		return false;
	}

	@Override
	String addSelect() {
		return "SELECT *";
	}

	@Override
	String addFrom() {
		if ("owner".equals(userType)) {
			return "FROM owner";
		} else
			return "FROM custodian";
	}

	@Override
	String addWhere() {
		if (userType == "owner") {
			return "WHERE owner_username = '" + username
					+ "' AND owner_password = '" + password + "'";
		} else
			return "WHERE custodian_username = '" + username
					+ "' AND custodian_password = '" + password + "'";
	}

	@Override
	String addInsert() {
		return null;
	}

	@Override
	String addUpdate() {
		return null;
	}

	@Override
	String addDelete() {
		return null;
	}

	@Override
	String addInnerJoin() {
		return null;
	}

	@Override
	String addInto() {
		return null;
	}

	@Override
	String addSet() {
		return null;
	}

	@Override
	String addValues() {
		return null;
	}

	@Override
	String addGroupBy() {
		return null;
	}

	@Override
	String addOrderBy() {
		return null;
	}

}
