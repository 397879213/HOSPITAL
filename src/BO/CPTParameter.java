package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class CPTParameter implements java.io.Serializable {

    public String parameterId = "";
    public String sectionNo = "";
    public String pathologyStatusId = "";
    public String unit = "";
    public String minRange = "";
    public String maxRange = "";
    public String LASvalue = "";
    public String LISvalue = "";
    public String Verifiedvalue = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

}
