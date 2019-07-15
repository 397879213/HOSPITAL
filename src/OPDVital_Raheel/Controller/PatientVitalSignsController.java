package OPDVital_Raheel.Controller;

import OPDVital.Raheel.BO.PatientVitalSigns;
import OPDVital_Raheel.Handler.PatientVitalSignsHandler;
import java.util.List;
import utilities.Constants;

public class PatientVitalSignsController implements java.io.Serializable{

    PatientVitalSignsHandler hdlPatientVitalSigns = new PatientVitalSignsHandler();

    public boolean insertPatientVitalSigns(PatientVitalSigns patientvitalsigns) {
        boolean ret= hdlPatientVitalSigns.insertPatientVitalSigns(patientvitalsigns);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean insertFinalPatientVitalSigns(PatientVitalSigns patientvitalsigns) {
        boolean ret= hdlPatientVitalSigns.insertPatientVitalSigns(patientvitalsigns);
        if (ret) {
            ret = hdlPatientVitalSigns.updateVitalEntered(patientvitalsigns.getPatientId(),
                    patientvitalsigns.getVitalEventId());
        } if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean  UpdatePatientVitals(PatientVitalSigns patientvitalsigns){
        boolean ret = hdlPatientVitalSigns.UpdatePatientVitals(patientvitalsigns);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }
    
    public boolean updateVitalStatus(String patentId, String consultancyId) {
        boolean ret = true;
        ret = hdlPatientVitalSigns.updateVitalEntered(patentId, consultancyId);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<PatientVitalSigns> getPatientVitals(String patientId,
            String action_event_id, String consultancyId, String vitalDate) {
        return hdlPatientVitalSigns.searchPatientVitals(patientId, consultancyId, vitalDate);
    }

    public List<PatientVitalSigns> getPatientVital(String patientId,String userId,
            String action_event_id,String fromDate,String toDate) {
        
        return hdlPatientVitalSigns.searchPatientVital(patientId,userId,
                action_event_id, fromDate, toDate);
    }
    
    public boolean updateVital(PatientVitalSigns selectedPatientVitalSigns) {
        boolean ret = true;
        ret = hdlPatientVitalSigns.updateVital(selectedPatientVitalSigns);
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

   

}
