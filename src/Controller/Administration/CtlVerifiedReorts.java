/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller.Administration;

import BO.Administration.BOVerifiedReports;
import Handler.Administration.HdlVerifiedReports;
import java.util.List;

/**
 *
 * @author Raheel Ansari
 */
public class CtlVerifiedReorts {
    
    HdlVerifiedReports hdlObj = new HdlVerifiedReports();
    
    public List<BOVerifiedReports> selectCptWiseReports(String cptId, 
            String toDate, String fromDate) {
        return hdlObj.selectCptWiseReports(cptId, toDate, fromDate);
    }
    
    public List<BOVerifiedReports> searchVerifiedReports(String patientId, String labNo) {
        return hdlObj.selectPatReport_Verified(patientId, labNo);
    }
    
    public List<BOVerifiedReports> searchAllReports(String patientId, String labNo) {
        return hdlObj.selectPatReport_All(patientId, labNo);
    }
}
