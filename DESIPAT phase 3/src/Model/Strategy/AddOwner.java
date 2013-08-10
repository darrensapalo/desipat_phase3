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
public class AddOwner implements Add{
   
    @Override
    public String getTable() {
        return "owner";
    }

    @Override
    public String[] getColumns() {
        
        String[] columns = { "ofirstname", "olastname", "owner_username", "owner_password" };
        return columns;
    }
}
