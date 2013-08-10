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
public class addAssetQuery extends Query{
    
    ModifyAsset m;
    String[] valuesUsed;
    
    public addAssetQuery(ModifyAsset m){
        this.m = m;
        
        if(m.getTfCustodian().getText().isEmpty())
            m.getTfCustodian().setText(null);

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
            m.getTfCustodian().getText(),
        };
        
        valuesUsed = values;
    }
    
    String[] columnsUsed = { "assetname", "assettype", "dateacquired", "classification", "storagelocation",
                "retentionperiod", "mainsched", "financialval", "confidentialityval", "integrityval",
                "availabilityval", "asset_ownerid", "asset_custodianid", };
    
    String tableUsed = "asset";
    
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
        String s;
        
        s = "INTO " + tableUsed + "(";
        for(int i = 0; i < columnsUsed.length; i++){
            if(i != columnsUsed.length-1)
                s += columnsUsed[i] + ", ";
            else{
                s += columnsUsed[i] + ")";
                }
        }
        
        return s;
    }
    
    @Override
    String addValues() {
        String s;
        
        s = "VALUES(";
        for(int i = 0; i < valuesUsed.length; i++){
            if(i != valuesUsed.length-1)
                s += "'" + valuesUsed[i] + "', ";
            else if(m.getTfCustodian().getText().isEmpty())
                    s += "NULL)";
                else
                    s += "'" + valuesUsed[i] + "')";
        }
        
        return s;
    }

    @Override
    String addSelect() { return null; }
    
    @Override
    String addUpdate() { return null; }

    @Override
    String addDelete() { return null; }

    @Override
    String addFrom() { return null; }

    @Override
    String addInnerJoin() { return null; }

    @Override
    String addSet() { return null; }

    @Override
    String addWhere() { return null; }

    @Override
    String addGroupBy() { return null; }

    @Override
    String addOrderBy() { return null; }
    
}