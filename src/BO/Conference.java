package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class Conference implements java.io.Serializable {

    public String Id = "";
    public String description = "";
    public String shortDescription = "";
    public String active = "";
    public String confDate = "";
    public String confStartTime = "";
    public String confEndTime = "";
    public String venueId = "";
    public String venue = "";
    public String confTypeId = "";
    public String accessionNo = "";
    public String requestedBy = "";
    public String patientId = "";
    public String modality = "";
    public String initialComments = "";
    public String conferenceRemarks = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }

}
