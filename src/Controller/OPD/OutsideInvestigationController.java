 
package Controller.OPD;

import BO.OutsideInvestigation;
import Handler.OPD.OutsideInvestigationHandler;
import java.util.List;
import utilities.Constants;
import utilities.Database;


 
public class OutsideInvestigationController implements java.io.Serializable{

    OutsideInvestigationHandler hdlOutsideInvestigation
            = new OutsideInvestigationHandler();

    public boolean insertOutsideInvestigation(OutsideInvestigation investigation) {
        boolean ret = true;
        ret = hdlOutsideInvestigation.insertOutsideInvestigation(investigation);
        if (ret) {
            Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<OutsideInvestigation> selectOutsideInvestigation(
            String completeOrderNo, String orderDetailId, String patientId) {
        return hdlOutsideInvestigation.selectOutsideInvestigation(
                completeOrderNo,orderDetailId,patientId);
    }

    public List<OutsideInvestigation> selectPreviousOutsideInvestigation(
                    String completeOrderNo,String patientId,
                    String testName) {
        return hdlOutsideInvestigation.selectPreviousOutsideInvestigation(
                completeOrderNo,patientId,testName);
    }
    public boolean updateReport(String id, String reportRemarks) {
        String update = "UPDATE " + Database.DCMS.outsideInvestigations + " SET \n"
                + " REPORT_REMARKS = '" + reportRemarks + "'            \n"
                + " WHERE ID = '" + id + "'                             \n";

        return Constants.dao.executeUpdate(update, true);
    }
    
    public boolean updateOutsideInvestigation(
                            OutsideInvestigation investigation) {
        
        String update = "UPDATE " + Database.DCMS.outsideInvestigations + " SET \n"
                + " TEST_NAME  = '" + investigation.getTestName() + "',         \n"
                + " CPT_ID = '"+ investigation.getCptId() +"',                  \n"
                + " HEALTHCARE_FACILITY_ID = '"
                        + investigation.getHealthCareFacilityId() +"',          \n"
                + " REPORT_DATE = '"+ investigation.getReportDate() +"'         \n"
                + " WHERE ID = '" + investigation.getId() + "'                  \n";

        return Constants.dao.executeUpdate(update, true);
    }
    
    public boolean deleteOutsideInvestigation(String id) {
        String delete = "DELETE FROM "+ Database.DCMS.outsideInvestigations
                + " WHERE ID = '" + id + "'                           \n";
        return Constants.dao.executeUpdate(delete, true);
    }
}
