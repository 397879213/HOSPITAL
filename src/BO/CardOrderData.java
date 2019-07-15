package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class CardOrderData implements java.io.Serializable {

    public String completeOrderNo = "";
    public String orderDetailId = "";
    public String machineId = "";
    public String machineDescription = "";
    public String wireId = "";
    public String wireDescription = "";
    public String stentType = "";
    public String stentId = "";
    public String stentDescription = "";
    public String balloonLength = "";
    public String balloonLengthDescription = "";
    public String balloonId = "";
    public String balloonDescription = "";
    public String chetherTypeId = "";
    public String chetherType = "";
    public String chetherDiameter = "";
    public String chetherCurve = "";
    public String acknowledgedBy = "";
    public String acknowledgedDate = "";
    public String performedBy = "";
    public String performedDate = "";
    public String reportedBy = "";
    public String reportedDate = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
