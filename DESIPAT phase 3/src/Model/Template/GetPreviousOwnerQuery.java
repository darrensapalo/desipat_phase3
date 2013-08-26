/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

/**
 *
 * @author Renz
 */
public class GetPreviousOwnerQuery extends Query{
    
    int assetID;
    
    public GetPreviousOwnerQuery(int assetid){
        assetID = assetid;
    }
    
    String[] tablesUsed = {"ownerlog", "owner"};
    
    boolean queryNeedsInsert(){ return false; }
    boolean queryNeedsUpdate(){ return false; }
    boolean queryNeedsDelete(){ return false; }
    boolean queryNeedsInto(){ return false; }
    boolean queryNeedsSet(){ return false; }
    boolean queryNeedsValues(){ return false; }
    boolean queryNeedsGroupBy(){ return false; }
    boolean queryNeedsOrderBy(){ return false; }
    
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
        return "INNER JOIN " + tablesUsed[1] + " ON ownerid = ownerlog_ownerid";
    }
    
    @Override
    String addWhere() {
        return "WHERE ownerlog_assetid = '" + assetID + "'";
    }
    
    @Override
    String addOrderBy() {return null;}

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
