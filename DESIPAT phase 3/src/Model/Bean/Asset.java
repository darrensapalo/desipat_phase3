package Model.Bean;

public class Asset {
/*    view.getLbAssetName().setText((Asset.getString("assetname")));
    view.getLbAssetID().setText((Asset.getString("assetid")));
    String oFirstname = Asset.getString("ofirstname");
    String oLastname = Asset.getString("olastname");
    view.getLbOwner().setText(oFirstname+" "+oLastname);
    String cFirstname = Asset.getString("cfirstname");
    String cLastname = Asset.getString("clastname");
    if(cFirstname == null)
        view.getLbCustodian().setText("N/A");
    else
        view.getLbCustodian().setText(cFirstname+" "+cLastname);
    view.getLbType().setText((Asset.getString("assettype")));
    view.getLbDate().setText(Asset.getString("dateacquired"));
    view.getLbRetention().setText((Asset.getString("retentionperiod")));
    view.getLbMaintenance().setText((Asset.getString("mainsched")));
    view.getLbFinancial().setText((Asset.getString("financialval")));
    view.getLbConfidentiality().setText((Asset.getString("confidentialityval")));
    view.getLbAvailability().setText((Asset.getString("availabilityval")));
    view.getLbIntegrity().setText((Asset.getString("integrityval")));
    view.getLbClassification().setText((Asset.getString("classification")));
    view.getLbStorage().setText((Asset.getString("storagelocation")));
*/
    
    private String assetName;
    private String assetID;
    private String cFirstName;
    private String cLastName;
    private String oFirstName;
    private String oLastName;
    private String assetType;
    private String dateAcquired;
    private String retentionPeriod;
    private String mainSched;
    private String financial;
    private String confidentiality;
    private String availability;
    private String integrity;
    private String classification;
    private String storage;
    private int ownerId;
    
    
    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
    public String getAssetName() {
        return assetName;
    }
    public String getAssetID() {
        return assetID;
    }
    public String getCFirstName() {
        return cFirstName;
    }
    public String getCLastName() {
        return cLastName;
    }
    public String getOFirstName() {
        return oFirstName;
    }
    public String getOLastName() {
        return oLastName;
    }
    public String getAssetType() {
        return assetType;
    }
    public String getDateAcquired() {
        return dateAcquired;
    }
    public String getRetentionPeriod() {
        return retentionPeriod;
    }
    public String getMainSched() {
        return mainSched;
    }
    public String getFinancial() {
        return financial;
    }
    public String getConfidentiality() {
        return confidentiality;
    }
    public String getAvailability() {
        return availability;
    }
    public String getIntegrity() {
        return integrity;
    }
    public String getClassification() {
        return classification;
    }
    public String getStorage() {
        return storage;
    }
    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }
    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }
    public void setCFirstName(String firstName) {
        this.cFirstName = firstName;
    }
    public void setCLastName(String lastName) {
        this.cLastName = lastName;
    }
    public void setOFirstName(String firstName) {
        this.oFirstName = firstName;
    }
    public void setOLastName(String lastName) {
        this.oLastName = lastName;
    }
    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
    public void setRetentionPeriod(String retentionPeriod) {
        this.retentionPeriod = retentionPeriod;
    }
    public void setMainSched(String mainSched) {
        this.mainSched = mainSched;
    }
    public void setFinancial(String financial) {
        this.financial = financial;
    }
    public void setConfidentiality(String confidentiality) {
        this.confidentiality = confidentiality;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public void setIntegrity(String integrity) {
        this.integrity = integrity;
    }
    public void setClassification(String classification) {
        this.classification = classification;
    }
    public void setStorage(String storate) {
        this.storage = storate;
    }
    
    
}
