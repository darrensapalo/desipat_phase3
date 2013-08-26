package Model.Template;

import Model.User;

/**
 *
 * @author DJ
 */
public class AddUserQuery extends Query {

	private String userType;
	private String[] columns;
	private String[] userData;
	
	public AddUserQuery(User user, String userType, String[] columns) {
		this.userType = userType;
		this.columns = columns;
		this.userData = new String[] {
			user.getFirstName(),
			user.getLastName(),
			user.getUsername(),
			user.getPassword()
		};
		
		this.createQuery();
	}
	
	/*
    public AddUserQuery(Register r, String table, String[] columns) {
        
        tableUsed = table;
        columnsUsed = columns;
        
        String[] values = {
            r.getTfFirst().getText(),
            r.getTfLast().getText(),
            r.getTfUsername().getText(),
            r.getDecipheredPassword(r.getPfPassword())
        };
        
        valuesUsed = values;
    }
    */
    public boolean queryNeedsSelect(){ return false; }
    public boolean queryNeedsUpdate(){ return false; }
    public boolean queryNeedsDelete(){ return false; }
    public boolean queryNeedsFrom(){ return false; }
    public boolean queryNeedsInnerJoin(){ return false; }
    public boolean queryNeedsSet(){ return false; }
    public boolean queryNeedsWhere(){ return false; }
    public boolean queryNeedsGroupBy(){ return false; }
    public boolean queryNeedsOrderBy(){ return false; }  

    @Override
    public String addInsert() {
        return "INSERT";
    }
    
    @Override
    public String addInto() {
        String s = "INTO " + this.userType + "(";
        
        for(int i = 0; i < columns.length; i++){
            if(i != columns.length-1)
                s += columns[i] + ", ";
            else
                s += columns[i] + ")";
        }
        
        return s;
    }
    
    @Override
    public String addValues() {
        String s = "VALUES(";
        
        for(int i = 0; i < userData.length; i++){
            if(i != userData.length-1)
                s += "'" + userData[i] + "', ";
            else
                s += "'" + userData[i] + "')";
        }
        
        return s;
    }
    
    @Override
    public String addSelect() {return null;}

    @Override
    public String addUpdate() {return null;}

    @Override
    public String addDelete() {return null;}

    @Override
    public String addFrom() {return null;}

    @Override
    public String addInnerJoin() {return null;}

    @Override
    public String addSet() {return null;}

    @Override
    public String addWhere() {return null;}

    @Override
    public String addGroupBy() {return null;}

    @Override
    public String addOrderBy() {return null;}
    
}
