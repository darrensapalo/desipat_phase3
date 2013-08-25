package Model.Template;

/**
 * 
 * @author Renz
 */
public class ListAssetQuery extends Query {

	private String username;
	private String userType;
	
	private String[] tablesUsed = { "asset", "owner", "custodian" };
	
	public ListAssetQuery(String userType, String username) {
		this.username = username;
		this.userType = userType;
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

	public boolean queryNeedsSet() {
		return false;
	}

	public boolean queryNeedsValues() {
		return false;
	}

	public boolean queryNeedsGroupBy() {
		return false;
	}

	@Override
	public String addSelect() {
		return "SELECT *";
	}

	@Override
	public String addFrom() {
		return "FROM " + tablesUsed[0];
	}

	@Override
	public String addInnerJoin() {
		String s = "Error";

		s = "INNER JOIN " + tablesUsed[1] + " ON asset_ownerid = ownerid "
				+ "LEFT JOIN " + tablesUsed[2]
				+ " ON asset_custodianid = custodianid";

		return s;
	}

	@Override
	public String addWhere() {
		if (userType.equalsIgnoreCase("Owner"))
			return "WHERE owner_username = '" + this.username + "'";
		if (userType.equalsIgnoreCase("Custodian"))
			return "WHERE custodian_username = '" + this.username + "'";

		return null;
	}

	@Override
	public String addOrderBy() {
		return "ORDER BY assetname";
	}

	@Override
	public String addInsert() {
		return null;
	}

	@Override
	public String addUpdate() {
		return null;
	}

	@Override
	public String addDelete() {
		return null;
	}

	@Override
	public String addInto() {
		return null;
	}

	@Override
	public String addSet() {
		return null;
	}

	@Override
	public String addValues() {
		return null;
	}

	@Override
	public String addGroupBy() {
		return null;
	}

}
