
package BO;


import javax.faces.bean.ManagedBean;

/**
 *
 * @author Pacslink
 */

@ManagedBean



public class PathologyStudyData implements java.io.Serializable{
  
    public String patientId = "";
    public String pathologyStatusId = "";
    public String completeOrderNo = "";
    public String orderDetailId = "";
    public String locationId = "";
    public String departmentId = "";
    public String sectionId = "";
    public String sectionNo = "";
    public String specimenId = "";
    public String labNo = "";
    public String cptId = "";
    public String cpt = "";
    public String clinicalHistory = "";
    
    //pathology Update 
    public String acknowledgedBy = "";
    public String specimenReceivedBy = "";
    public String specimenAcknowledgedBy = "";
    
    
    //patient information 
    public String patientName = "";
    public String gender = "";
    public String age = "";
    private int rowIndex;

    public int getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(int rowIndex) {
        this.rowIndex = rowIndex;
    }
    
}