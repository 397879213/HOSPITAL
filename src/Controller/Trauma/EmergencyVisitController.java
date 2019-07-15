package Controller.Trauma;

import BO.Trauma.EmergencyVisit;
import Handler.Trauma.EmergencyVisitHandler;
import java.util.List;
import utilities.Constants;

public class EmergencyVisitController {

    EmergencyVisitHandler hdlepr = new EmergencyVisitHandler();

    public List<EmergencyVisit> selectPendingByPatient(String patientId) {
        return hdlepr.selectPendingByPatient(patientId);
    }

    public List<EmergencyVisit> searchPendingByUnit(String emergencyUnitId) {
        return hdlepr.selectPendingByTraumaUnit(emergencyUnitId);
    }
    
    public boolean insertEmergencyVisit(String patientId) {

        return hdlepr.insertEmergencyVisit(patientId);

    }
      
      
      public boolean updateComplaints(EmergencyVisit obj) {

        boolean ret = hdlepr.updatePendingComplaints(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }
      
       public boolean updatePendingVitals(EmergencyVisit obj) {

        boolean ret = hdlepr.updatePendingVitals(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }
        public boolean updatePerformedVitals(EmergencyVisit obj) {

        boolean ret = hdlepr.updatePerformedVitals(obj);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;

    }
      
      
    
    
    /// FOR PERFORMED TABLE
     public List<EmergencyVisit> searchPerformedByPatientId(String patientId) {
        return hdlepr.selectPerformedByPatient(patientId);
    }

    public List<EmergencyVisit> searchPerformedByUnit(String medicalUnitId) {
        return hdlepr.selectPendingByTraumaUnit(medicalUnitId);
    }
    
    public boolean insertEmergencyVisitPerformed(String patientId) {

        return hdlepr.insertEmergencyVisitPerformed(patientId);

    }
    
//     public boolean updatePerformedDischargeType(EmergencyVisit obj) {
//
//        boolean ret = hdlepr.updatePerformedDischargeType(obj);
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//        }
//        if (!ret) {
//            Constants.dao.rollBack();
//        }
//        return ret;
//
//    }
    
}
//SELECT PERFORMED PATIENT SELECT BY PATIENT ID IS MISSING FROM 
//EMERGENCY_PERFORMED VISIT TABLE IN CONTROLLER AND HANDLER
//UPDATE VITAL SIGNS ARE PENDING IN PENDING AND PERFORMED TABLE.
//UPDATE PATIENT COMPLAINT TREATMENT PENDING ON BOTH TABLES

