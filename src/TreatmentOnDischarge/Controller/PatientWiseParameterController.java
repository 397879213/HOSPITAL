/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TreatmentOnDischarge.Controller;

import BO.OPD.PatientHospitalVisit;
import TreatmentOnDischarge.Handler.PatientWiseParameterHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author Pacslink
 */
public class PatientWiseParameterController {
    PatientWiseParameterHandler hdlPatWiseParameter = new PatientWiseParameterHandler();
    
    public List<PatientHospitalVisit> selectPatientPerformedParameters(String patientId,
            String admissionNumber, String parameterId) {
        boolean ret = hdlPatWiseParameter.patientPerformedParametersPRD(patientId,
                admissionNumber, parameterId);
        hdlPatWiseParameter.patientPerformedParametersCTR(patientId,
                admissionNumber, parameterId);
        return hdlPatWiseParameter.patientPerformedParametersSRD(patientId,
                admissionNumber, parameterId);
    }
    
    public List<PatientHospitalVisit> patientWiseSelectedParameter(String patientId,
            String admissionNumber) {
        return hdlPatWiseParameter.patientWiseSelectedParameter(patientId, admissionNumber);
    }
    
    public List<PatientHospitalVisit> pathUrineDR(String patientId,
            String admissionNumber) {
        return hdlPatWiseParameter.pathUrineDR(patientId, admissionNumber);
    }
    
    public boolean insertSelectedParameters(List<PatientHospitalVisit> listSave, 
            String patientId, String admissionNumber) {
        boolean ret = hdlPatWiseParameter.deleteUsersParameter(patientId, admissionNumber);
        if(ret){
            ret = hdlPatWiseParameter.insertSelectedParameters(listSave);
        }
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return  ret;
    }
    
    public boolean deleteAllParameters(String patientId, String admissionNumber) {
        boolean ret = hdlPatWiseParameter.deleteUsersParameter(patientId, admissionNumber);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return  ret;
    }
}
