/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

import View.LoginMenu;

/**
 *
 * @author Renz
 */
public class userLoginQuery extends Query{
    
    LoginMenu l;
    String username;
    String password;
    String userType;
    
    public userLoginQuery(LoginMenu l, String user){
        this.l = l;
        
        username = l.getTfUsername().getText();
        password = l.getDecipheredPassword(l.getPfPassword());
        userType = user;
        
    }
    
    String[] tablesUsed = { "owner", "custodian" };

    boolean queryNeedsInsert(){ return false; }
    boolean queryNeedsUpdate(){ return false; }
    boolean queryNeedsDelete(){ return false; }
    boolean queryNeedsInto(){ return false; }
    boolean queryNeedsInnerJoin(){ return false; }
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
        if("owner".equals(userType))
        {
            return "FROM owner";
        }
        else
            return "FROM custodian";
    }

    @Override
    String addWhere() {
        if(userType == "owner")
        {
            return "WHERE owner_username = '" + username + "' AND owner_password = '"+password+"'";
        }
        else
            return "WHERE custodian_username = '" + username + "' AND custodian_password = '"+password+"'";
    }
    
    @Override
    String addInsert() { return null; }

    @Override
    String addUpdate() { return null; }

    @Override
    String addDelete() { return null; }

    @Override
    String addInnerJoin() { return null; }

    @Override
    String addInto() { return null; }

    @Override
    String addSet() { return null; }

    @Override
    String addValues() { return null; }

    @Override
    String addGroupBy() { return null; }

    @Override
    String addOrderBy() { return null; }
    
}
