/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMT.BO;

/**
 *
 * @author Pacslink
 */
public class CompoundingBO {
    
    private String storeId = "";
    private String compoundId = "";
    private String additiveId = "";
    private String additiveDescription = "";
    private String typeId = "";
    private String volumeUsed = "";
    private String itemId = "";
    private String quantity = "";
    private String unitQuantity = "";
    private String unitCost = "";
    private String unitQuantityType = "";
    private String serviceCharges = "";
    private String TotalAmount = "";

     public CompoundingBO(String compoundId, String storeId, String additiveId,
            String additiveDescription, String unitQuantity, String volumeUsed){
        this.storeId = storeId;
        this.additiveId = additiveId;
        this.additiveDescription = additiveDescription;
        this.unitQuantity = unitQuantity;
        this.compoundId = compoundId;
        this.volumeUsed = volumeUsed;
    };

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
    public CompoundingBO(){
    };
    
    public String getVolumeUsed() {
        return volumeUsed;
    }

    public String getServiceCharges() {
        return serviceCharges;
    }

    public void setServiceCharges(String serviceCharges) {
        this.serviceCharges = serviceCharges;
    }

    public String getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(String TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public void setVolumeUsed(String volumeUsed) {
        this.volumeUsed = volumeUsed;
    }
    
    public String getUnitQuantityType() {
        return unitQuantityType;
    }

    public void setUnitQuantityType(String unitQuantityType) {
        this.unitQuantityType = unitQuantityType;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUnitQuantity() {
        return unitQuantity;
    }

    public void setUnitQuantity(String unitQuantity) {
        this.unitQuantity = unitQuantity;
    }

    public String getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(String unitCost) {
        this.unitCost = unitCost;
    }
    
    public String getCompoundId() {
        return compoundId;
    }

    public void setCompoundId(String compoundId) {
        this.compoundId = compoundId;
    }
    
    public String getAdditiveId() {
        return additiveId;
    }

    public void setAdditiveId(String additiveId) {
        this.additiveId = additiveId;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getAdditiveDescription() {
        return additiveDescription;
    }

    public void setAdditiveDescription(String additiveDescription) {
        this.additiveDescription = additiveDescription;
    }
    
}
