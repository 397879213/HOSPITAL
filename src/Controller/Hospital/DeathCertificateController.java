/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.DeathCertificate;
import BO.Hospital.PatientAdmission;
import BO.Hospital.DischargePatient;
import Handler.Hospital.DeathCertificateHandler;
import java.util.List;
import utilities.Constants;

/**
 *
 * @author UsmanSaeed
 */
public class DeathCertificateController {

    DeathCertificateHandler hdldeath = new DeathCertificateHandler();
    PatientDischargeController ctlDischarge = new PatientDischargeController();

    public boolean updateSaveDeathCertificate(String admisNo,
            DeathCertificate objDc) {

        boolean ret = hdldeath.updateSaveDeathCertificate(objDc);

        if (ret) {
            ret = hdldeath.updatePatientInfo(objDc);
        }

        if (ret) {
            ret = hdldeath.updatePatientDischarge(admisNo, objDc);
        }

        if (ret) {
            ret = Constants.dao.commitTransaction();

        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateApproveDeathCertificate(DeathCertificate objDc, 
            DischargePatient patientDischarge,  PatientAdmission admission) {

        boolean ret =  hdldeath.updateApproveDeathCertificate(objDc);
        if (ret) {
            ret = hdldeath.updatePatientInfo(objDc);
        }
        if (ret) {
            ret = ctlDischarge.saveDischargeComments(patientDischarge, 
                    "Y",  admission);
        } 
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public List<DeathCertificate> selectDeathPatientInfo(String patientId) {
        return hdldeath.selectDeathPatientInfo(patientId);
    }

    public List<DischargePatient> selectPatientDiagnosis(String admissionNo) {
        return hdldeath.selectPatientDiagnosis(admissionNo);
    }

}
