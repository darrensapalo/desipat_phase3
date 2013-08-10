/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

/**
 *
 * @author Renz
 */
public abstract class Query {
    
    private String query = "";
    
    public final void createQuery() {
        
        //
        if(queryNeedsSelect()){
            query += addSelect();
        }
        if(queryNeedsInsert()){
            query += addInsert();
        }
        if(queryNeedsUpdate()){
            query += addUpdate();
        }
        if(queryNeedsDelete()){
            query += addDelete();
        }
        
        //
        if(queryNeedsFrom()){
            query += " ";
            query += addFrom();
        }
        if(queryNeedsInnerJoin()){
            query += " ";
            query += addInnerJoin();
        }
        if(queryNeedsInto()){
            query += " ";
            query += addInto();
        }
        if(queryNeedsSet()){
            query += " ";
            query += addSet();
        }
        
        //
        if(queryNeedsWhere()){
            query += " ";
            query += addWhere();
        }
        if(queryNeedsValues()){
            query += " ";
            query += addValues();
        }
        
        //
        if(queryNeedsGroupBy()){
            query += " ";
            query += addGroupBy();
        }
        if(queryNeedsOrderBy()){
            query += " ";
            query += addOrderBy();
        }       
    }
    
    public String getQuery() {
        return query;
    }
    
    abstract String addSelect();
    abstract String addInsert();
    abstract String addUpdate();
    abstract String addDelete();
    
    abstract String addFrom();
    abstract String addInnerJoin();
    abstract String addInto();
    abstract String addSet();
    
    abstract String addWhere();
    abstract String addValues();
    
    abstract String addGroupBy();
    abstract String addOrderBy();
    
    
    boolean queryNeedsSelect(){ return true; }
    boolean queryNeedsInsert(){ return true; }
    boolean queryNeedsUpdate(){ return true; }
    boolean queryNeedsDelete(){ return true; }
    
    boolean queryNeedsFrom(){ return true; }
    boolean queryNeedsInnerJoin(){ return true; }
    boolean queryNeedsInto(){ return true; }
    boolean queryNeedsSet(){ return true; }
    
    boolean queryNeedsWhere(){ return true; }
    boolean queryNeedsValues(){ return true; }
    
    boolean queryNeedsGroupBy(){ return true; }
    boolean queryNeedsOrderBy(){ return true; }
    
}
