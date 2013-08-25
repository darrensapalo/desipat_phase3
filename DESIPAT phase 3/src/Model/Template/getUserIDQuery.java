package Model.Template;

/**
 * 
 * @author Renz
 */
public class getUserIDQuery extends Query {

	String userType, userName;

	public getUserIDQuery(String uType, String uName) {
		userType = uType;
		userName = uName;
	}

	String[] tablesUsed = { "owner", "custodian" };

	boolean queryNeedsInsert() {
		return false;
	}

	boolean queryNeedsUpdate() {
		return false;
	}

	boolean queryNeedsDelete() {
		return false;
	}

	boolean queryNeedsInto() {
		return false;
	}

	boolean queryNeedsSet() {
		return false;
	}

	boolean queryNeedsValues() {
		return false;
	}

	boolean queryNeedsGroupBy() {
		return false;
	}

	boolean queryNeedsOrderBy() {
		return false;
	}

	boolean queryNeedsInnerJoin() {
		return false;
	}

	@Override
	String addSelect() {
		return "SELECT *";
	}

	@Override
	String addFrom() {
		if (userType.equalsIgnoreCase("Owner"))
			return "FROM " + tablesUsed[0];
		if (userType.equalsIgnoreCase("Custodian"))
			return "FROM " + tablesUsed[1];

		return null;
	}

	@Override
	String addWhere() {
		if (userType.equalsIgnoreCase("Owner"))
			return "WHERE owner_username = '" + userName + "'";
		if (userType.equalsIgnoreCase("Custodian"))
			return "WHERE custodian_username = '" + userName + "'";

		return null;
	}

	@Override
	String addOrderBy() {
		return null;
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
	String addInnerJoin() {
		return null;
	}

}
