/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Renz
 */
public class addPreviousOwnerQuery extends Query{
    
    int assetID, previousOwnerID;
    
    public addPreviousOwnerQuery(int assetid, int prevOwnerID){
        assetID = assetid;
        previousOwnerID = prevOwnerID;
    }
    
    String tableUsed = "ownerlog";
    
    boolean queryNeedsSelect(){ return false; }
    boolean queryNeedsUpdate(){ return false; }
    boolean queryNeedsDelete(){ return false; }
    boolean queryNeedsFrom(){ return false; }
    boolean queryNeedsInnerJoin(){ return false; }
    boolean queryNeedsSet(){ return false; }
    boolean queryNeedsWhere(){ return false; }
    boolean queryNeedsGroupBy(){ return false; }
    boolean queryNeedsOrderBy(){ return false; }  
    
    @Override
    String addInsert() {
        return "INSERT";
    }
    
    @Override
    String addInto() {
        return "INTO " + tableUsed;
    }
    
    @Override
    String addValues() {
        String s = "VALUES(";
        
        s += "'"+assetID+"', ";
        s += "'"+previousOwnerID+"', ";
        s += "'"+getDate()+"')";
        
        return s;
    }
    
    @Override
    String addSelect() {return null;}

    @Override
    String addUpdate() {return null;}

    @Override
    String addDelete() {return null;}

    @Override
    String addFrom() {return null;}

    @Override
    String addInnerJoin() {return null;}

    @Override
    String addSet() {return null;}

    @Override
    String addWhere() {return null;}

    @Override
    String addGroupBy() {return null;}

    @Override
    String addOrderBy() {return null;}
    
    public String getDate(){
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
      Date d = new Date();
      return dateFormat.format(d);
     }
    
}
