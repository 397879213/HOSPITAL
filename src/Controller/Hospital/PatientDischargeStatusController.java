package Controller.Hospital;

import BO.Hospital.PatientAdmission;
//import Controller.AdvanceAdjustmentController;
import Handler.Hospital.PatientDischargeStatusHandler;

import java.util.List;
import utilities.Database;
import utilities.Constants;
import utilities.Status;

/**
 *
 * @author Pacslink
 */
public class PatientDischargeStatusController {

    PatientDischargeStatusHandler hdlpat = new PatientDischargeStatusHandler();

    public List
            selectFinancialDischargePatient(String status,
                    String patientId, String primaryPhysicianId, String wardId) {

        return hdlpat.selectFinancialDischargePatient(status, patientId,
                primaryPhysicianId, wardId);
    }

    public boolean updateDischargeDate(PatientAdmission patientAdmission) {
        boolean ret = true;

        if (ret) {
            String query = " UPDATE " + Database.DCMS.patientAdmissionHistory + "\n"
                    + " SET DISPLAY_DISCHARGE_DATE = '" + patientAdmission.getDisplayDischargeDate() + "'\n"
                    + " WHERE ID = " + patientAdmission.getAdmissionNo() + "\n";
            ret = Constants.dao.executeUpdate(query, ret);
        }
        if (ret) {
            ret = Constants.dao.commitTransaction();
        }
        if (!ret) {
            Constants.dao.rollBack();;
        }
        return ret;
    }

}
