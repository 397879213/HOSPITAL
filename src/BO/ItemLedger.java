package BO;;
// Generated Aug 18, 2014 5:29:01 PM by Hibernate Tools 3.6.0


import java.util.Date;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean


public class ItemLedger  implements java.io.Serializable {


    private int serial;
    private int transactionNo;
    private String transactionType;
    private int itemId;
    private int storeId;
    private int qtyIn;
    private int qtyOut;
    private int valueIn;
    private int valueOut;
    private int cost;
    private int totalQty;
    private int totalValue;
    private int movingCostAvg;
    private String batchNo;
    private Date expiryDate;
    private String transBy;
    private Date transDate;
    
    private String itemDesc;
    private String storeDesc;
    private Date fromDate;
    private Date toDate;
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    
    public ItemLedger() {
    }

    public ItemLedger(int transactionNo, String transactionType, int itemId, int storeId, String transBy,Date transDate) {
        this.transactionNo = transactionNo;
        this.transactionType = transactionType;
        this.itemId = itemId;
        this.storeId = storeId;
        this.transBy = transBy;
        this.transDate = transDate;
    }

    public ItemLedger(String transactionType, String itemDesc, String storeDesc, Date fromDate, Date toDate) {
        this.transactionType = transactionType;
        this.itemDesc = itemDesc;
        this.storeDesc = storeDesc;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public ItemLedger(int transactionNo, String transactionType, int itemId, int storeId, int qtyIn, int qtyOut, int valueIn, int valueOut, int cost, String transBy) {
        this.transactionNo = transactionNo;
        this.transactionType = transactionType;
        this.itemId = itemId;
        this.storeId = storeId;
        this.qtyIn = qtyIn;
        this.qtyOut = qtyOut;
        this.valueIn = valueIn;
        this.valueOut = valueOut;
        this.cost = cost;
        this.transBy = transBy;
    }
    
    
    public ItemLedger(int transactionNo, String transactionType, int itemId, int storeId, int qtyIn, int qtyOut, int valueIn, int valueOut, int cost, int totalQty, int totalValue, int movingCostAvg, String batchNo, Date expiryDate, String transBy, Date transDate) {
        this.transactionNo = transactionNo;
        this.transactionType = transactionType;
        this.itemId = itemId;
        this.storeId = storeId;
        this.qtyIn = qtyIn;
        this.qtyOut = qtyOut;
        this.valueIn = valueIn;
        this.valueOut = valueOut;
        this.cost = cost;
        this.totalQty = totalQty;
        this.totalValue = totalValue;
        this.movingCostAvg = movingCostAvg;
        this.batchNo = batchNo;
        this.expiryDate = expiryDate;
        this.transBy = transBy;
        this.transDate = transDate;
    }

    public ItemLedger(int transactionNo, String transactionType, int itemId, int storeId, int qtyIn, int qtyOut, int valueIn, int valueOut, int cost, int totalQty, int totalValue, int movingCostAvg, String transBy, Date transDate) {
        this.transactionNo = transactionNo;
        this.transactionType = transactionType;
        this.itemId = itemId;
        this.storeId = storeId;
        this.qtyIn = qtyIn;
        this.qtyOut = qtyOut;
        this.valueIn = valueIn;
        this.valueOut = valueOut;
        this.cost = cost;
        this.totalQty = totalQty;
        this.totalValue = totalValue;
        this.movingCostAvg = movingCostAvg;
        this.transBy = transBy;
        this.transDate = transDate;
    }

    
    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public int getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(int transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public int getQtyIn() {
        return qtyIn;
    }

    public void setQtyIn(int qtyIn) {
        this.qtyIn = qtyIn;
    }

    public int getQtyOut() {
        return qtyOut;
    }

    public void setQtyOut(int qtyOut) {
        this.qtyOut = qtyOut;
    }

    public int getValueIn() {
        return valueIn;
    }

    public void setValueIn(int valueIn) {
        this.valueIn = valueIn;
    }

    public int getValueOut() {
        return valueOut;
    }

    public void setValueOut(int valueOut) {
        this.valueOut = valueOut;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(int totalValue) {
        this.totalValue = totalValue;
    }

    public int getMovingCostAvg() {
        return movingCostAvg;
    }

    public void setMovingCostAvg(int movingCostAvg) {
        this.movingCostAvg = movingCostAvg;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTransBy() {
        return transBy;
    }

    public void setTransBy(String transBy) {
        this.transBy = transBy;
    }

    public Date getTransDate() {
        return transDate;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getStoreDesc() {
        return storeDesc;
    }

    public void setStoreDesc(String storeDesc) {
        this.storeDesc = storeDesc;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.serial;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ItemLedger other = (ItemLedger) obj;
        if (this.serial != other.serial) {
            return false;
        }
        return true;
    }
    
    

   
    


}


