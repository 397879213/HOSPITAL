package BO;

 
/**
 *
 * @author Pacslink
 */
 
public class Clinic implements java.io.Serializable {

    public String Id = "";
    public String description = "";
    public String specialityId = "";
    public String specialityDescription = "";
    public String shortDescription = "";
    public String clinicTimeId = "";
    public String clinicTypeDescription = "";
    public String locationId = "";
    public String sectionId = "";
    public String departmentId = "";
    public String consultantId = "";
    public String consultantDescription = "";
    public String typeId = "";
    public String type = "";
    public String active = "";
    public String locationDescription = "";
    public String sectionDescription = "";
    public String typeDescription = "";
    public String patientType = "";
    public String paymentType = "";
    public String clinicTimeDescription = "";
    public String departmentDescription = "";
    public String remarksReq = "";
    private int rowIndex;
    public String sendSMS="";
    

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
}
