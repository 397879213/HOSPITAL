package Controller.Hospital;
import BO.Hospital.MedicineOrderEntry;
import BO.Hospital.PatientHospitalVisit;
//import Handler.Hospital.IPDMedicinePlanHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;


public class IPDMedicinePlanControllerOld {
    
//    IPDMedicinePlanHandler hdlIpdMed = new IPDMedicinePlanHandler();
    
    public boolean saveIpdMedMaster(List<MedicineOrderEntry> lstmed){
        
        boolean ret = true;
        
        for (int i = 0; i < lstmed.size(); i++) {
            
//            ret = hdlIpdMed.saveIpdMedMaster(lstmed.get(i));
//            
//            if (ret) {
//                ret = Constants.dao.commitTransaction();
//            }
//            
//            if (!ret) {
//                Constants.dao.rollBack();
//            }
        }
        return ret;
    }
    
//     public boolean saveIpdMedPlanDetail(List<MedicineOrderEntry> lstmed){
//        
//        boolean ret = true;
//        
//        for (int i = 0; i < lstmed.size(); i++) {
//            
////            ret = hdlIpdMed.saveIpdMedPlanDetail(lstmed.get(i));
////        
////            if (ret) {
////                ret = Constants.dao.commitTransaction();
////            }
////            
////            if (!ret) {
////                Constants.dao.rollBack();
////            }
//        }
//        return ret;
//    }
//    
//    public List<MedicineOrderEntry> selectIPDMedMaster(String patientId, String admissionNo, String isActive) {
//        return hdlIpdMed.selectIPDMedMaster(patientId, admissionNo,isActive);
//    }
//    
//    public List<MedicineOrderEntry> selectMedPlanDetail(String admissionNo, String ipdMedPlanMasterId){
//        return hdlIpdMed.selectMedPlanDetail(admissionNo, ipdMedPlanMasterId);
//    }
//    
//    public boolean updateMedPlanDetail(MedicineOrderEntry med){
//        return hdlIpdMed.updateMedPlanDetail(med);
//    }
//    
//    public boolean updateMedPlanMaster(MedicineOrderEntry med) {
//        
//        
//        boolean ret = hdlIpdMed.updateMedPlanMaster(med);
//
//        if (ret) {
//            ret = hdlIpdMed.deleteOrder(med);
//        }
//
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//        }
//        if (ret) {
//            Constants.dao.rollBack();
//        }
//
//        return ret;
//    }
//    
//     public boolean ResumeOrder(MedicineOrderEntry med) {
//         
//        boolean ret = hdlIpdMed.savOrder(med);
//
//        if (ret) {
//            ret = hdlIpdMed.updateMedPlanMaster(med);
//        }
//
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//        }
//        if (ret) {
//            Constants.dao.rollBack();
//        }
//
//        return ret;
//    }
//    
//    public boolean savOrder(MedicineOrderEntry med) {
//
//        boolean ret = hdlIpdMed.savOrder(med);
//        
//        if (ret) {
//            ret = hdlIpdMed.updateDuration(med);
//        }
//        
//        if (ret) {
//            med.setOrderStatusId(Status.ordered);
//            ret = hdlIpdMed.updateMedPlanMasterStatus(med);
//        }
//
//        if (ret) {
//            ret = Constants.dao.commitTransaction();
//        }
//
//        if (!ret) {
//            Constants.dao.rollBack();
//        }
//        
//        return ret;
//    }
    
    public PatientHospitalVisit  selectAdmissionInformation(String completePatientId) {

        String[] cols = {"", "PATIENT_ID", "FULL_NAME", "CLIENT_ID"};
        String query
                = " SELECT PAT.PATIENT_ID, PAT.FULL_NAME, PAT.CLIENT_ID FROM "
                + Database.DCMS.patientAdmission + "  PA,  \n"
                + Database.DCMS.patient + "  PAT  \n"
                + " WHERE PA.PATIENT_ID =  PAT.PATIENT_ID\n"
                + " AND  PAT.PATIENT_ID = "+completePatientId+" \n";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);
        PatientHospitalVisit phv = new PatientHospitalVisit();
        return phv;
    }
}
