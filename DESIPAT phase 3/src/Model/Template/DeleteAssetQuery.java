/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

/**
 *
 * @author Renz
 */
public class DeleteAssetQuery extends Query{
    
    int assetID;
    
    public DeleteAssetQuery(int assetid){
        assetID = assetid;
    }
    
    String tableUsed = "asset";
    
    boolean queryNeedsInsert(){ return false; }
    boolean queryNeedsUpdate(){ return false; }
    boolean queryNeedsSelect(){ return false; }
    boolean queryNeedsInnerJoin(){ return false; }
    boolean queryNeedsInto(){ return false; }
    boolean queryNeedsSet(){ return false; }
    boolean queryNeedsValues(){ return false; }
    boolean queryNeedsGroupBy(){ return false; }
    boolean queryNeedsOrderBy(){ return false; }
    
    @Override
    String addDelete() {
        return "DELETE";
    }

    @Override
    String addFrom() {
        return "FROM " + tableUsed;
    }
    
    @Override
    String addWhere() {
        return "WHERE assetid = '" + assetID + "'";
    }
    
    @Override
    String addOrderBy() {return null;}

    @Override
    String addInsert() {return null;}

    @Override
    String addUpdate() {return null;}

    @Override
    String addSelect() {return null;}

    @Override
    String addInto() {return null;}

    @Override
    String addSet() {return null;}

    @Override
    String addValues() {return null;}

    @Override
    String addGroupBy() {return null;}

    @Override
    String addInnerJoin() {return null;}
    
}
