/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Hospital;

import BO.Hospital.PatientAdmission;
import Controller.ActionWiseReportingController;
import Handler.Hospital.InpatientBillHandler;
import Handler.OrderHandler;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import utilities.Constants;
import utilities.Database;
import utilities.Status;

@ManagedBean
@ViewScoped

/**
 *
 * @author UsmanSaeed
 */
public class InPatientBillController implements java.io.Serializable {

    ActionWiseReportingController ctlAWP = new ActionWiseReportingController();
    InpatientBillHandler hdlInpatientBill = new InpatientBillHandler();
    OrderHandler ctlOrderhandler = new OrderHandler();

    public List<PatientAdmission> selectAdmittedPatient(String status,
            String patientId, String attendingPhysicianId, String wardId) {

        return hdlInpatientBill.selectAdmittedPatient(status,
                patientId, attendingPhysicianId, wardId);
    }

    public List<PatientAdmission> selectPatientAdmissionHistory(String patientId) {
        return hdlInpatientBill.selectPatientAdmissionHistory(patientId);
    }

    public List<PatientAdmission> selectAdmittedPatientOrders(String patientId,
            String admissionNo, String wardId, String orderBy, String storeId) {
        return hdlInpatientBill.selectOrderAdmittedPatient(patientId,
                admissionNo, wardId, orderBy, storeId);
    }

    public boolean updateDischargeRequestStatus(PatientAdmission selectedPatient) {

        String query = " UPDATE " + Database.DCMS.patientAdmission
                + " SET ORDER_STATUS_ID = " + Status.dischargeRequest + ", \n"
                + " DISCHARGE_TYPE_ID =" + selectedPatient.getDischargeTypeId() + ", \n"
                + " DISCHARGE_REQUEST_BY = '" + Constants.userId + "', \n"
                + " DISCHARGE_REQUEST_DATE= SYSDATE  \n"
                + " WHERE ID = " + selectedPatient.getAdmissionNo();

        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmissionHistory
                    + " SET ORDER_STATUS_ID = " + Status.dischargeRequest + ", \n"
                    + " DISCHARGE_TYPE_ID =" + selectedPatient.getDischargeTypeId() + ", \n"
                    + " DISCHARGE_REMARKS = '" + selectedPatient.getDischargeRemarks().replaceAll("'", "''") + "', \n"
                    + " DISCHARGE_REQUEST_BY = '" + Constants.userId + "', \n"
                    + " DISCHARGE_REQUEST_DATE= SYSDATE \n"
                    + " WHERE ID = " + selectedPatient.getAdmissionNo() + "\n"
                    + " AND ORDER_STATUS_ID != " + Status.discharged + " \n";
                    

            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            query
                    = " UPDATE " + Database.DCMS.patientDischarge + "\n"
                    + " SET DISCHARGE_TYPE_ID = '" + selectedPatient.getDischargeTypeId() + "' \n"
                    + " WHERE ADMISSION_NO = '" + selectedPatient.getAdmissionNo() + "'";
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret && selectedPatient.getDischargeTypeId().equalsIgnoreCase(Status.death)) {

            ret = hdlInpatientBill.insertDeathCertificate(selectedPatient);
        }

        if (ret) {

            ret = ctlOrderhandler.insertOrderActions(selectedPatient.getCompleteOrderNo(),
                    selectedPatient.getOrderDetailId(), Status.dischargeRequest);
        }

        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();
        }
        return ret;
    }

    public boolean updateDischargeRejectStatus(PatientAdmission selectedPatient) {

        String query = " UPDATE " + Database.DCMS.patientAdmission
                + " SET ORDER_STATUS_ID = " + Status.admitted
                + " \n WHERE ADMISSION_NO = " + selectedPatient.getAdmissionNo();

        boolean ret = Constants.dao.executeUpdate(query, false);

        if (ret) {
            query = " UPDATE " + Database.DCMS.patientAdmission
                    + " SET ORDER_STATUS_ID = " + Status.admitted
                    + " \n WHERE ADMISSION_NO = " + selectedPatient.getAdmissionNo();
            ret = Constants.dao.executeUpdate(query, false);
        }
        if (ret) {
            ret = ctlOrderhandler.insertOrderActions(selectedPatient.getCompleteOrderNo(),
                    selectedPatient.getOrderDetailId(), Status.rejected);
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
