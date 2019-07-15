package BO;

import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */
@ManagedBean

public class UploadStudy implements java.io.Serializable {

    public String modality = "All";
    public String patientId = "";
    public String accessionNO = "";
    public String requestedBy = "";
    public String reportingPhysician = "";
    public String requestedDateTime = "";
    public String ftpServer = "";
    public String startTime = "";
    public String message = "";
    public String totalTime = "";
    public String status = "";
    public String reportedStatus = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
