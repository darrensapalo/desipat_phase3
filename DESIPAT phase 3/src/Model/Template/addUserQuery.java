/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

import View.Register;

/**
 *
 * @author DJ
 */
public class addUserQuery extends Query{
    
    Register r;
    String[] valuesUsed;
    String[] columnsUsed = null;
    String tableUsed = null;

    public addUserQuery(Register r, String table, String[] columns) {
        
        tableUsed = table;
        columnsUsed = columns;
        
        this.r = r;
        
        String[] values = {
            r.getTfFirst().getText(),
            r.getTfLast().getText(),
            r.getTfUsername().getText(),
            r.getDecipheredPassword(r.getPfPassword())
        };
        
        valuesUsed = values;
    }
    
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
        String s = "INTO " + tableUsed + "(";
        
        for(int i = 0; i < columnsUsed.length; i++){
            if(i != columnsUsed.length-1)
                s += columnsUsed[i] + ", ";
            else
                s += columnsUsed[i] + ")";
        }
        
        return s;
    }
    
    @Override
    String addValues() {
        String s = "VALUES(";
        
        for(int i = 0; i < valuesUsed.length; i++){
            if(i != valuesUsed.length-1)
                s += "'" + valuesUsed[i] + "', ";
            else
                s += "'" + valuesUsed[i] + "')";
        }
        
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
    
}
