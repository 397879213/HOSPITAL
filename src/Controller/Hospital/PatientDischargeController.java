/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.DischargePatient;
import BO.Hospital.DischargePatientDetail;
import BO.Hospital.PatientAdmission;
import Handler.Hospital.PatientDischargeHandler;
import Handler.OrderHandler;
import java.util.List;
import utilities.Actions;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

public class PatientDischargeController {

    PatientDischargeHandler hndlPatDischarge = new PatientDischargeHandler();
    OrderHandler ctlOrderhandler = new OrderHandler();

    public DischargePatient searchPatientAdmitted(String admissionNo) {
        return hndlPatDischarge.searchPatientAdmitted(admissionNo);
    }

    public boolean updatePatientDischarge(DischargePatient patientDischarge) {

        boolean ret = hndlPatDischarge.updatePatientDischarge(patientDischarge);

        if (ret) {
            PatientAdmissionController ctlPatAdmission = new PatientAdmissionController();
            ret = ctlPatAdmission.updateAdmittedPatientStatus(patientDischarge.getAdmissionNo(),
                    Status.medicalDischarge);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertCptItemPatientDischarge(DischargePatientDetail patientDischargeDetail) {

        boolean ret = false;
        try {
            ret = hndlPatDischarge.insertCptItemPatientDischarge(patientDischargeDetail);

            if (ret) {
                ret = Constants.dao.commitTransaction();

            }
            if (!ret) {
                ret = false;
                Constants.dao.rollBack();

            }
        } catch (Exception ex) {
            ret = false;
            Constants.dao.rollBack();
        }

        return ret;

    }

    public List<DischargePatientDetail> searchDetailDischargeCpt(String admissionNo) {
        return hndlPatDischarge.searchDischargeCptItem(admissionNo);

    }

    public List<DischargePatientDetail> searchDetailDischargeItem(String admissionNo) {
        return hndlPatDischarge.searchDetailDischargeItem(admissionNo);

    }

    public boolean deleteCptItemPatientDischarge(DischargePatientDetail patientDischargeDetail) {

        boolean ret = false;
        try {
            ret = hndlPatDischarge.deleteCptItemPatientDischarge(patientDischargeDetail);

            if (ret) {
                ret = Constants.dao.commitTransaction();

            }
            if (!ret) {
                ret = false;
                Constants.dao.rollBack();

            }
        } catch (Exception ex) {
            ret = false;
            Constants.dao.rollBack();
        }

        return ret;

    }
 
    public boolean saveDischargeComments(DischargePatient patientDischarge,
            String action, PatientAdmission admission) {

        String query
                = " UPDATE " + Database.DCMS.patientDischarge + "\n"
                + " SET DISCHARGE_TYPE_ID  = '" + patientDischarge.getDischargeTypeId() + "', \n"
                + " SUMMARY = '" + patientDischarge.getSummary().replaceAll("'", "''") + "',\n"
                + " INVESTIGATIONS = '" + patientDischarge.getInvestigation().replaceAll("'", "''") + "',\n"
                + " ADVICE = '" + patientDischarge.getAdvice().replaceAll("'", "''") + "',\n"
                + " NEXT_VISIT = '" + patientDischarge.getNextVisit().replaceAll("'", "''") + "',\n"
                + " DIAGNOSIS = '" + patientDischarge.getDiagnosisName().replaceAll("'", "''") + "'\n"
                + " WHERE ADMISSION_NO = '" + patientDischarge.getAdmissionNo() + "'";

        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmission + "\n"
                    + " SET DISCHARGE_CERTIFICATE  = '" + action + "' \n"
                    + " WHERE ID =  " + patientDischarge.getAdmissionNo() + " \n";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret && action.equalsIgnoreCase("Y")) {

            ret = ctlOrderhandler.insertOrderActions(admission.getCompleteOrderNo(),
                    admission.getOrderDetailId(), Actions.dischargedCertificatePreparedBy);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();

        }
        if (!ret) {
            ret = false;
            Constants.dao.rollBack();

        }
        return ret;
    }

}
