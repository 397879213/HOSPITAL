/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.PatientAdmission;
import Controller.ActionWiseReportingController;
import Handler.Hospital.PatientAdmissionHandler;
import Handler.Hospital.PatientWardBedHandler;
import java.util.HashMap;

import java.util.List;
import utilities.Constants;
import utilities.Database;
import utilities.Status;
import utilities.TypeDetailId;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped

/**
 *
 * @author Pacslink
 */
public class PatientAdmissionController implements java.io.Serializable {

    ActionWiseReportingController ctlAWP = new ActionWiseReportingController();

    PatientAdmissionHandler hdlPatAdmission = new PatientAdmissionHandler();
    PatientWardBedHandler hdlUpdatePatientWardBed = new PatientWardBedHandler();

    public List<String> selectUserAttachedStores(HashMap hash, String userId) {
        return hdlPatAdmission.selectUserAttachedStores(hash, userId);
    }

    public List<PatientAdmission> selectAdmissionRequest(String status,
            String searchDate, String fromDate, String toDate,
            String referingPhysicanId, String attendingPhysicanId,
            String patientId, String patientName) {
        return hdlPatAdmission.selectAdmissionRequest(status,
                searchDate, fromDate, toDate, referingPhysicanId,
                attendingPhysicanId, patientId, patientName);

    }

    public List<PatientAdmission> selectAdmittedPatientByPatientId(String status,
            String patientId) {
        return hdlPatAdmission.selectAdmittedPatientByPatientId(status, patientId);

    }

    public PatientAdmission selectPatientAdmissionInfo(String patientId) {
        return hdlPatAdmission.selectPatientAdmission(patientId);

    }

    

    public boolean dischargePatient(PatientAdmission admission) {

        String query
                = " UPDATE " + Database.DCMS.patientAdmissionHistory
                + " SET ORDER_STATUS_ID =" + Status.discharged + ", \n"
                + " DISCHARGE_BY = '" + Constants.userId + "', \n"
                + " DISCHARGE_DATE = SYSDATE,  \n"
                + " DISPLAY_DISCHARGE_DATE = SYSDATE,  \n"
                + " DISCHARGE_TERMINAL_ID = '" + Constants.terminalId + "' \n"
                + " WHERE ID = '" + admission.getAdmissionNo() + "'";

        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {
            query
                    = " UPDATE " + Database.DCMS.bedTransferHistory + "\n"
                    + " SET TRANSFERRED_DATE = " + Constants.today + "\n"
                    + " WHERE ADMISSION_NO = " + admission.getAdmissionNo()
                    + " \n AND TRANSFERRED_DATE IS NULL";
            ret = Constants.dao.executeUpdate(query, false);
        }

        if (ret) {
            query
                    = " UPDATE " + Database.DCMS.patientDischarge + "\n"
                    + " SET DISCHARGE_DATE = " + Constants.today + ",\n"
                    + " DISCHARGE_BY = '" + Constants.userId + "',\n"
                    + " DISCHARGE_TERMINAL_ID = '" + Constants.terminalId + "'\n"
                    + " WHERE ADMISSION_NO = '" + admission.getAdmissionNo() + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }

        if (ret) {
            query = " UPDATE " + Database.DCMS.patient
                    + " SET PATIENT_STATUS_ID = " + TypeDetailId.outPatient + " \n"
                    + " WHERE PATIENT_ID = '" + admission.getPatientId() + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = hdlPatAdmission.deletePatientAdmission(admission.getAdmissionNo());
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean isPatientDischargeRequest(String patientId) {

        return hdlPatAdmission.isPatientDischargeRequest(patientId);

    }

    public boolean deletePatientAdmission(String admissionNo) {

        return hdlPatAdmission.deletePatientAdmission(admissionNo);
    }

    public boolean patientAdmission(String consultancyId, PatientAdmission pat) {
        boolean ret = true;
        ret = hdlPatAdmission.deletePatientAdmission(consultancyId);
        if (ret) {
            ret = hdlPatAdmission.insertAdmissionRequest(pat);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

 

    

     
    public PatientAdmission checkAdmissionRequestStatus(String patientId) {

        return hdlPatAdmission.selectPatientAdmission(patientId);
    }

    

    public String selectAdmissionNumber(String patientId) {

        return hdlPatAdmission.selectPatientAdmissionNo(patientId);

    }
    ActionWiseReportingController ctlAwp = new ActionWiseReportingController();

   

    

    public boolean updateAdmissionStatus(PatientAdmission admission, String patientStatusId) {

        String query;
        Boolean ret = hdlPatAdmission.insertAdmissionUpdateHistory(admission);
        //insertInPatientStatusHistory
        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmission
                    + " SET ORDER_STATUS_ID = '" + admission.getOrderStatusId() + "'\n"
                    + " WHERE ID = '" + admission.getAdmissionNo() + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmissionHistory
                    + " SET ORDER_STATUS_ID = '" + admission.getOrderStatusId() + "'\n"
                    + " WHERE ID = '" + admission.getAdmissionNo() + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            query = " UPDATE " + Database.DCMS.patient
                    + " SET PATIENT_STATUS_ID = " + patientStatusId + " \n"
                    + " WHERE PATIENT_ID = '" + admission.getPatientId() + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            insertInPatientStatus(admission);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        } else {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean insertInPatientStatus(PatientAdmission status) {

        return hdlPatAdmission.insertInPatientStatusHistory(status);

    }

    public boolean updateAdmittedPatientStatus(String admissionNo, String patientStatusId) {

        String query;
        boolean ret = true;
        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmission
                    + " SET ORDER_STATUS_ID = '" + patientStatusId + "'\n"
                    + " WHERE ID = '" + admissionNo + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmissionHistory
                    + " SET ORDER_STATUS_ID = '" + patientStatusId + "'\n"
                    + " WHERE ID = '" + admissionNo + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        return ret;
    }

    public String selectWardCPTID(String wardId) {
        return hdlPatAdmission.selectWardCPTID(wardId);
    }

    public int selectAdmissionAdvanceAmount(String patientId, String admissionNo) {

        String[] cols = {"", "PAY"};
        String query
                = " SELECT NVL(SUM(AMOUNT) , 0) PAY FROM "
                + Database.DCMS.advanceReceiveHistory + "  ARH  \n"
                + " WHERE ARH.PATIENT_ID =  '" + patientId + "'\n"
                + " AND  ARH.ADMISSION_NO = '" + admissionNo + "'\n";

        List<HashMap> list = Constants.dao.selectDatainList(query, cols);
        return Integer.parseInt(list.get(0).get("PAY").toString());
    }

    public boolean cancelAdmissionRequest(PatientAdmission currentSelectedPatient) {

        boolean ret = hdlPatAdmission.deletePatientAdmission(currentSelectedPatient.getAdmissionNo());

        if (ret) {

            String update = " UPDATE " + Database.DCMS.patientAdmissionHistory
                    + " SET ORDER_STATUS_ID = '" + Status.canceled + "', \n"
                    + " DISCHARGE_BY =  '" + Constants.userId + "',  \n"
                    + " DISCHARGE_DATE = SYSDATE,  \n"
                    + " DISCHARGE_TERMINAL_ID =  '" + Constants.terminalId + "'  \n"
                    + " WHERE ID = " + currentSelectedPatient.getAdmissionNo();

            ret = Constants.dao.executeUpdate(update, false);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }

        return ret;

    }

}
