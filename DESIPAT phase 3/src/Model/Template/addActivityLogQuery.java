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
public class addActivityLogQuery extends Query{
    
    String activityName, userType, userName;
    
    public addActivityLogQuery(String actName, String uType, String uName){
        activityName = actName;
        userType = uType;
        userName = uName;
    }
    
    String tableUsed = "activitylog";
    
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
        
        s += "'"+activityName+"', ";
        s += "'"+getDateandTime()+"', ";
        s += "'"+userType+"', ";
        s += "'"+userName+"')";
        
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
    
    public String getDateandTime(){
      DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
      Date d = new Date();
      return dateFormat.format(d);
     }
    
}
