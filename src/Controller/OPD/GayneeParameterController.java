/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.OPD;

import BO.OPD.PatientHospitalVisit;
import Handler.OPD.GayneeParameterHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class GayneeParameterController {
    
    GayneeParameterHandler hdlGayneeParameter = new GayneeParameterHandler();
    
    public List<PatientHospitalVisit> selectGayneeParameter(String patientId,
            String referenceNumber) {
        return hdlGayneeParameter.selectGayneeParameter(patientId, referenceNumber);
    }
    
    public boolean insertGayneeParameters(PatientHospitalVisit objSave) {
        boolean ret = hdlGayneeParameter.insertGayneeParameters(objSave);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateGayneeParameters(PatientHospitalVisit objUpdate) {
        boolean ret = hdlGayneeParameter.updateGayneeParameters(objUpdate);
        if(ret){
            Constants.dao.commitTransaction();
        }
        if(!ret){
            Constants.dao.rollBack();
        }
        return ret;
    }
}
