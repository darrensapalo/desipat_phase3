/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

/**
 *
 * @author Renz
 */
public class listAssetQuery extends Query{
    
    String userType, userName;
    
    public listAssetQuery(String uType, String uName){
        userType = uType;
        userName = uName;
    }
    
    String[] tablesUsed = {"asset", "owner", "custodian"};
    
    boolean queryNeedsInsert(){ return false; }
    boolean queryNeedsUpdate(){ return false; }
    boolean queryNeedsDelete(){ return false; }
    boolean queryNeedsInto(){ return false; }
    boolean queryNeedsSet(){ return false; }
    boolean queryNeedsValues(){ return false; }
    boolean queryNeedsGroupBy(){ return false; }
    
    @Override
    String addSelect() {
        return "SELECT *";
    }

    @Override
    String addFrom() {
        return "FROM " + tablesUsed[0];
    }
    
    @Override
    String addInnerJoin() {
        String s = "Error";
    
        s = "INNER JOIN " + tablesUsed[1] + " ON asset_ownerid = ownerid "
        + "LEFT JOIN " + tablesUsed[2] + " ON asset_custodianid = custodianid";
        
        return s;
    }
    
    @Override
    String addWhere() {
        if(userType == "owner")
            return "WHERE owner_username = '" + userName + "'";
        if(userType == "custodian")
            return "WHERE custodian_username = '" + userName + "'";
        
        return null;
    }
    
    @Override
    String addOrderBy() {
        return "ORDER BY assetname";
    }

    @Override
    String addInsert() {return null;}

    @Override
    String addUpdate() {return null;}

    @Override
    String addDelete() {return null;}

    @Override
    String addInto() {return null;}

    @Override
    String addSet() {return null;}

    @Override
    String addValues() {return null;}

    @Override
    String addGroupBy() {return null;}
    
    
    
}
