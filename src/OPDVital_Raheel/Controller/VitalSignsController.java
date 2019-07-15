/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OPDVital_Raheel.Controller;

import Controller.*;
import OPDVital.Raheel.BO.PatientSymptom;
import OPDVital.Raheel.BO.PatientVitalSigns;
import OPDVital_Raheel.Handler.PatientVitalSignsHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author raheelansari
 */
public class VitalSignsController {
    PatientVitalSignsHandler vitalSignHdl = new PatientVitalSignsHandler();
            
   public List<PatientSymptom> pendingConsultancies(String patID, String name, 
           String consultantId, String tokenNumkber){
        return vitalSignHdl.searchPendingConsultancies(patID, name, consultantId, 
                            tokenNumkber);
    }
   
   public boolean insertPatientVitalSigns(PatientVitalSigns patientvitalsigns) {
       boolean ret = vitalSignHdl.insertPatientVitalSigns(patientvitalsigns);
       if(ret){
           Constants.dao.commitTransaction();
       }
       if(!ret){
           Constants.dao.remoteRollBack();
       }
       return ret;
   }
   
   public List searchPatientVital(String patientId, String userId,
            String actionEventId, String fromDate, String toDate) {
       return vitalSignHdl.searchPatientVital(patientId, userId, actionEventId, fromDate, toDate);
   }
}
