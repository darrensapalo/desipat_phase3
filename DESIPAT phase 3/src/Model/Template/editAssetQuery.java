/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Template;

import View.ModifyAsset;

/**
 *
 * @author Renz
 */
public class editAssetQuery extends Query{
    
    ModifyAsset m;
    int id;
    String[] valuesUsed;
    
    public editAssetQuery(ModifyAsset m, int assetid){
        
        this.m = m;
        id = assetid;
        
        String[] values = {
            m.getTfAssetName().getText(),
            m.getTfType().getText(),
            m.getDccDateAcquired().getText(),
            (String)m.getCbClassification().getSelectedItem(),
            m.getTfStorage().getText(),
            m.getDccRetentionPeriod().getText(),
            (String)m.getCbMaintenance().getSelectedItem(),
            m.getTfFinancial().getText(),
            (String)m.getCbConfidentiality().getSelectedItem(),
            (String)m.getCbIntegrity().getSelectedItem(),
            (String)m.getCbAvailability().getSelectedItem(),
            m.getTfOwner().getText(),
            m.getTfCustodian().getText()
        };
        
        valuesUsed = values;
        
    }
    
    String[] columnsUsed = { "assetname", "assettype", "dateacquired", "classification", "storagelocation",
                "retentionperiod", "mainsched", "financialval", "confidentialityval", "integrityval",
                "availabilityval", "asset_ownerid", "asset_custodianid" };
    
    String tableUsed = "asset";

    boolean queryNeedsInsert(){ return false; }
    boolean queryNeedsSelect(){ return false; }
    boolean queryNeedsDelete(){ return false; }
    boolean queryNeedsInto(){ return false; }
    boolean queryNeedsInnerJoin(){ return false; }
    boolean queryNeedsFrom(){ return false; }
    boolean queryNeedsValues(){ return false; }
    boolean queryNeedsGroupBy(){ return false; }
    boolean queryNeedsOrderBy(){ return false; } 
    
    @Override
    String addUpdate() {
        return "UPDATE " + tableUsed;
    }
    
    @Override
    String addSet() {
        String s = "SET ";
        
        for(int i = 0; i < columnsUsed.length; i++){
            if(i != columnsUsed.length-1)
                s += columnsUsed[i] + " = '" + valuesUsed[i] + "', ";
            else if(m.getTfCustodian().getText().isEmpty() || "0".equals(m.getTfCustodian().getText()))
                    s += columnsUsed[i] + " = NULL";
                else
                    s += columnsUsed[i] + " = '" + valuesUsed[i] + "'";
        }
        
        return s;
    }
    
    @Override
    String addWhere() {
        return "WHERE assetid = '"+id+"'";
    }

    @Override
    String addDelete() {return null;}
    
    @Override
    String addSelect() {return null;}

    @Override
    String addInsert() {return null;}

    @Override
    String addFrom() {return null;}

    @Override
    String addInnerJoin() {return null;}

    @Override
    String addInto() {return null;}

    @Override
    String addValues() {return null;}

    @Override
    String addGroupBy() {return null;}

    @Override
    String addOrderBy() {return null;}
    
}
