package BO.Hospital;
// Generated Aug 18, 2014 5:29:01 PM by Hibernate Tools 3.6.0

public class DischargePatientDetail implements java.io.Serializable {

  private String crtdBy = "";
  private String crtdTerminalId = "";
  private String cptItemDescription = "";
  private String cptItemId = "";
  private String remarks = "";
  private String admissionNo = "";
  private String type = "";
  private String rowIndex ="";

    public DischargePatientDetail() {
    }

   
   
    public String getCrtdBy() {
        return crtdBy;
    }

    public void setCrtdBy(String crtdBy) {
        this.crtdBy = crtdBy;
    }

    public String getCrtdTerminalId() {
        return crtdTerminalId;
    }

    public void setCrtdTerminalId(String crtdTerminalId) {
        this.crtdTerminalId = crtdTerminalId;
    }

    public String getCptItemDescription() {
        return cptItemDescription;
    }

    public void setCptItemDescription(String cptItemDescription) {
        this.cptItemDescription = cptItemDescription;
    }

    public String getCptItemId() {
        return cptItemId;
    }

    public void setCptItemId(String cptItemId) {
        this.cptItemId = cptItemId;
    }

    
    
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(String rowIndex) {
        this.rowIndex = rowIndex;
    }

    
    public String getAdmissionNo() {
        return admissionNo;
    }

    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
  
  
  

}
