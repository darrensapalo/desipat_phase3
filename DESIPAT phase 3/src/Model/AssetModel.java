package Model;

import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Bean.Asset;

public class AssetModel {
    public Asset getAsset(ResultSet rs) {
        Asset asset = new Asset();
        
        try {
            asset.setAssetName((rs.getString("assetname")));
     
            asset.setAssetID((rs.getString("assetid")));
            asset.setOFirstName(rs.getString("ofirstname"));
            asset.setOLastName(rs.getString("olastname"));
            
            asset.setCFirstName(rs.getString("cfirstname"));
            
            asset.setCLastName(rs.getString("clastname"));
            asset.setAssetType((rs.getString("assettype")));
            asset.setDateAcquired(rs.getString("dateacquired"));
            asset.setRetentionPeriod((rs.getString("retentionperiod")));
            asset.setMainSched((rs.getString("mainsched")));
            asset.setFinancial((rs.getString("financialval")));
            asset.setConfidentiality((rs.getString("confidentialityval")));
            asset.setAvailability((rs.getString("availabilityval")));
            asset.setIntegrity((rs.getString("integrityval")));
            asset.setClassification((rs.getString("classification")));
            asset.setStorage((rs.getString("storagelocation")));
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return asset;
    }
}
