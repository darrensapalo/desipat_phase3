/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Strategy;

import Model.Strategy.Add;

/**
 *
 * @author DJ
 */
public class AddCustodian implements Add{
    
    @Override
    public String getTable() {
        return "custodian";
    }

    @Override
    public String[] getColumns() {
        String[] columnsUsed = { "cfirstname", "clastname", "custodian_username", "custodian_password" };
        
        return columnsUsed;
    }
}
